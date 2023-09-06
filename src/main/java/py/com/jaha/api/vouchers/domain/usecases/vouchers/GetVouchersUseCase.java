package py.com.jaha.api.vouchers.domain.usecases.vouchers;

import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersCommand;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersResponse;
import py.com.jaha.api.vouchers.domain.ports.in.GetVouchersPort;
import py.com.jaha.api.vouchers.domain.ports.out.VouchersRepositoryPort;

@Slf4j
@RequiredArgsConstructor
public class GetVouchersUseCase implements GetVouchersPort {

  private final VouchersRepositoryPort vouchersRepositoryPort;

  @Override
  public GetVouchersResponse execute(GetVouchersCommand command) {
    return Try.of(() -> vouchersRepositoryPort.getVouchersBy(command.getClientId(), command.getClientId()))
        .map(vouchers -> GetVouchersResponse.builder().build())
        .get();
  }
}
