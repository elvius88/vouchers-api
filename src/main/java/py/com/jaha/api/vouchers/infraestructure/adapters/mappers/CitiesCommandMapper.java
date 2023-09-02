package py.com.jaha.api.vouchers.infraestructure.adapters.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import py.com.jaha.api.vouchers.domain.commands.cities.GetCitiesCommand;

@Mapper
public interface CitiesCommandMapper {

  CitiesCommandMapper INSTANCE = Mappers.getMapper(CitiesCommandMapper.class);

  GetCitiesCommand toCommand(String countryCode, String stateCode);
}
