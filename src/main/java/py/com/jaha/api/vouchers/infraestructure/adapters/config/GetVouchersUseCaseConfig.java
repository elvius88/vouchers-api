package py.com.jaha.api.vouchers.infraestructure.adapters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import py.com.jaha.api.vouchers.domain.ports.in.GetVoucherPort;
import py.com.jaha.api.vouchers.domain.ports.in.GetVouchersPort;
import py.com.jaha.api.vouchers.domain.ports.out.DaysRepositoryPort;
import py.com.jaha.api.vouchers.domain.ports.out.VouchersRepositoryPort;
import py.com.jaha.api.vouchers.domain.usecases.vouchers.GetVoucherUseCase;
import py.com.jaha.api.vouchers.domain.usecases.vouchers.GetVouchersUseCase;

@Configuration
public class GetVouchersUseCaseConfig {

    @Bean
    public GetVouchersPort getVouchersUseCase(VouchersRepositoryPort vouchersRepositoryPort){
        return new GetVouchersUseCase(vouchersRepositoryPort);
    }

    @Bean
    public GetVoucherPort getVoucherUseCase(VouchersRepositoryPort vouchersRepositoryPort,
                                            DaysRepositoryPort daysRepositoryPort){
        return new GetVoucherUseCase(vouchersRepositoryPort, daysRepositoryPort);
    }
}
