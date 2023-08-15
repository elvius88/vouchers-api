package py.com.jaha.api.general.infraestructure.adapters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import py.com.jaha.api.general.domain.ports.in.GetCitiesPort;
import py.com.jaha.api.general.domain.ports.out.corebanking.cities.CityCoreBankingPort;
import py.com.jaha.api.general.domain.ports.out.corebanking.token.CoreBankTokenPort;
import py.com.jaha.api.general.domain.usecases.cities.GetCityUseCase;

@Configuration
public class GetCitiesUseCaseConfig {

    @Bean
    public GetCitiesPort getCitiesUseCase(CoreBankTokenPort tokenCoreBankingPort, CityCoreBankingPort cityCoreBankingPort){
        return new GetCityUseCase(tokenCoreBankingPort, cityCoreBankingPort);
    }
}
