package py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import py.com.jaha.api.vouchers.domain.models.vouchers.Voucher;
import py.com.jaha.api.vouchers.infraestructure.adapters.out.commons.IMapper;
import py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers.entities.Vouchers;

@Mapper
public interface VouchersMapper extends IMapper<Voucher, Vouchers> {

  VouchersMapper INSTANCE = Mappers.getMapper(VouchersMapper.class);
}
