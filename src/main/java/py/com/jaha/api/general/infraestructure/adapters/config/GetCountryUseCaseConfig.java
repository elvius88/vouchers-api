package py.com.jaha.api.general.infraestructure.adapters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import py.com.jaha.api.general.domain.ports.in.GetCountryPort;
import py.com.jaha.api.general.domain.ports.out.corebanking.countries.CountryCoreBankingPort;
import py.com.jaha.api.general.domain.ports.out.corebanking.token.CoreBankTokenPort;
import py.com.jaha.api.general.domain.usecases.country.GetCountryUseCase;

@Configuration
public class GetCountryUseCaseConfig {

	@Bean
    public GetCountryPort getCountryUseCase (CoreBankTokenPort tokenCoreBankingPort, CountryCoreBankingPort countryCoreBankingPort){
        return new GetCountryUseCase(tokenCoreBankingPort, countryCoreBankingPort);
    }

}
