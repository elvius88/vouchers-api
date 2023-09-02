package py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "sqlServerEntityManagerFactory",
        transactionManagerRef = "sqlServerTransactionManager",
        basePackages = {"py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.**"}
)
public class SqlServerDbConfig {

    @Bean(name = "sqlServerDataSource")
    @Primary
    @ConfigurationProperties(prefix = "dbsqlserver.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sqlServerEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean
    sqlServerEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("sqlServerDataSource") DataSource dataSource) {

        return builder.dataSource(dataSource)
                .packages("py.com.jaha.api.general.infraestructure.adapters.out.sqlserver.**.entities")
                .persistenceUnit("sqlServer")
                .build();
    }

    @Bean(name = "sqlServerTransactionManager")
    @Primary
    public PlatformTransactionManager sqlServerTransactionManager(
            @Qualifier("sqlServerEntityManagerFactory") EntityManagerFactory sqlServerEntityManagerFactory) {
        return new JpaTransactionManager(sqlServerEntityManagerFactory);
    }
}
