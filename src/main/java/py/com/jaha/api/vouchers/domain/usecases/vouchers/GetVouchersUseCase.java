package py.com.jaha.api.vouchers.domain.usecases.vouchers;

import static py.com.jaha.api.vouchers.domain.models.commons.enums.ErrorCatalog.NOT_FOUND;
import static py.com.jaha.api.vouchers.domain.usecases.utils.LogUtil.logAndThrows;

import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersCommand;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersResponse;
import py.com.jaha.api.vouchers.domain.ports.in.GetVouchersPort;
import py.com.jaha.api.vouchers.domain.ports.out.VouchersRepositoryPort;
import py.com.jaha.api.vouchers.domain.usecases.vouchers.mappers.GetVoucherResponseMapper;

@Slf4j
@RequiredArgsConstructor
public class GetVouchersUseCase implements GetVouchersPort {

  private final VouchersRepositoryPort vouchersRepositoryPort;

  @Override
  public GetVouchersResponse execute(GetVouchersCommand command) {
    return Try.of(() -> vouchersRepositoryPort.getVouchersBy(command.getClientId(), command.getEstablishmentId()))
        .filter(vouchers -> !CollectionUtils.isEmpty(vouchers))
        .map(GetVoucherResponseMapper.INSTANCE::toGetVoucherResponseList)
        .map(response -> GetVouchersResponse.builder().vouchers(response).build())
        .onSuccess(response -> log.debug("Query has been successful: [{}]", response))
        .onFailure(logAndThrows(log, "Error querying voucher data: [{}]", NOT_FOUND))
        .get();
  }
}
