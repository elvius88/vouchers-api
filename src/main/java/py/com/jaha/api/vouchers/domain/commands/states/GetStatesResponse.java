package py.com.jaha.api.vouchers.domain.commands.states;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import py.com.jaha.api.vouchers.config.IdNameDto;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetStatesResponse {

  List<IdNameDto<String, String>> states;
}
