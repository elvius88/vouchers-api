package py.com.jaha.api.vouchers.infraestructure.adapters.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersCommand;

@Mapper
public interface VouchersCommandMapper {

  VouchersCommandMapper INSTANCE = Mappers.getMapper(VouchersCommandMapper.class);

  default GetVouchersCommand toCommand(String id, String clientId, String establishmentId) {
    return GetVouchersCommand.builder().id(id).clientId(clientId).establishmentId(establishmentId).build();
  }
}
