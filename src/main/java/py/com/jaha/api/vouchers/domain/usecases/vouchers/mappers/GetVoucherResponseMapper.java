package py.com.jaha.api.vouchers.domain.usecases.vouchers.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetDayResponse;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVoucherResponse;
import py.com.jaha.api.vouchers.domain.models.vouchers.Day;
import py.com.jaha.api.vouchers.domain.models.vouchers.Voucher;

@Mapper
public interface GetVoucherResponseMapper {

  GetVoucherResponseMapper INSTANCE = Mappers.getMapper(GetVoucherResponseMapper.class);

  GetVoucherResponse toGetVoucherResponse(Voucher voucher);
  List<GetVoucherResponse> toGetVoucherResponseList(List<Voucher> vouchers);

  GetDayResponse toGetGetDayResponse(Day day);
  List<GetDayResponse> toGetDayResponseList(List<Day> days);
}
