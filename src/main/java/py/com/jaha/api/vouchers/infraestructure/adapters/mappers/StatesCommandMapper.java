package py.com.jaha.api.vouchers.infraestructure.adapters.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import py.com.jaha.api.vouchers.domain.commands.states.GetStatesCommand;

@Mapper
public interface StatesCommandMapper {

  StatesCommandMapper INSTANCE = Mappers.getMapper(StatesCommandMapper.class);

  GetStatesCommand toCommand(String countryCode);
}
