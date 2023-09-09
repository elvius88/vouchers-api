package py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import py.com.jaha.api.vouchers.domain.models.vouchers.Day;
import py.com.jaha.api.vouchers.infraestructure.adapters.out.commons.IMapper;
import py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers.entities.Days;

@Mapper
public interface DaysMapper extends IMapper<Day, Days> {

  DaysMapper INSTANCE = Mappers.getMapper(DaysMapper.class);
}
