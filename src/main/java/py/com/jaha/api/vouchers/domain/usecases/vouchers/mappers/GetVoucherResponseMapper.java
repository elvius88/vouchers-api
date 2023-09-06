package py.com.jaha.api.vouchers.domain.usecases.vouchers.mappers;

import org.mapstruct.factory.Mappers;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVoucherResponse;
import py.com.jaha.api.vouchers.domain.models.vouchers.Voucher;

public interface GetVoucherResponseMapper {

  GetVoucherResponseMapper INSTANCE = Mappers.getMapper(GetVoucherResponseMapper.class);

  GetVoucherResponse toGetVoucherResponse(Voucher voucher);
}
