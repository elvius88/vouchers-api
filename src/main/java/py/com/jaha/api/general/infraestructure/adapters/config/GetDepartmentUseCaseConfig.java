package py.com.jaha.api.general.infraestructure.adapters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import py.com.jaha.api.general.domain.ports.in.GetDepartmentPort;
import py.com.jaha.api.general.domain.ports.out.corebanking.departments.DepartmentCoreBankingPort;
import py.com.jaha.api.general.domain.ports.out.corebanking.token.CoreBankTokenPort;
import py.com.jaha.api.general.domain.usecases.departments.GetDepartmentUseCase;

@Configuration
public class GetDepartmentUseCaseConfig {
    @Bean
    public GetDepartmentPort getDepartamentUseCase(CoreBankTokenPort tokenCoreBankPort, DepartmentCoreBankingPort departmentCoreBankingPort){
        return new GetDepartmentUseCase(tokenCoreBankPort, departmentCoreBankingPort);
    }
}
