package py.com.jaha.api.vouchers.domain.usecases.vouchers;

import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import py.com.jaha.api.general.domain.usecases.cities.mappers.GetCitiesResponseMapper;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVoucherResponse;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersCommand;
import py.com.jaha.api.vouchers.domain.ports.in.GetVoucherPort;
import py.com.jaha.api.vouchers.domain.ports.out.VouchersRepositoryPort;
import py.com.jaha.api.vouchers.domain.usecases.vouchers.mappers.GetVoucherResponseMapper;

@Slf4j
@RequiredArgsConstructor
public class GetVoucherUseCase implements GetVoucherPort {

  private final VouchersRepositoryPort vouchersRepositoryPort;

  @Override
  public GetVoucherResponse execute(GetVouchersCommand command) {
    return Try.of(() -> vouchersRepositoryPort.getVoucher(command.getId()))
        .map(GetVoucherResponseMapper.INSTANCE::toGetVoucherResponse)
        .get();
  }
}
