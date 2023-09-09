package py.com.jaha.api.vouchers.domain.usecases.vouchers;

import static py.com.jaha.api.vouchers.domain.models.commons.enums.ErrorCatalog.NOT_FOUND;
import static py.com.jaha.api.vouchers.domain.usecases.utils.LogUtil.logAndThrows;

import io.vavr.control.Try;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVoucherResponse;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersCommand;
import py.com.jaha.api.vouchers.domain.ports.in.GetVoucherPort;
import py.com.jaha.api.vouchers.domain.ports.out.DaysRepositoryPort;
import py.com.jaha.api.vouchers.domain.ports.out.VouchersRepositoryPort;
import py.com.jaha.api.vouchers.domain.usecases.vouchers.mappers.GetVoucherResponseMapper;

@Slf4j
@RequiredArgsConstructor
public class GetVoucherUseCase implements GetVoucherPort {

  private final VouchersRepositoryPort vouchersRepositoryPort;
  private final DaysRepositoryPort daysRepositoryPort;

  @Override
  public GetVoucherResponse execute(GetVouchersCommand command) {
    return Try.of(() -> vouchersRepositoryPort.getVoucher(command.getId()))
        .filter(Objects::nonNull)
        .map(voucher -> voucher.toBuilder().days(daysRepositoryPort.getDaysBy(voucher.getId(), null)).build())
        .map(GetVoucherResponseMapper.INSTANCE::toGetVoucherResponse)
        .onSuccess(response -> log.debug("Query has been successful: [{}]", response))
        .onFailure(logAndThrows(log, "Error querying vouchers data: [{}]", NOT_FOUND))
        .get();
  }
}
