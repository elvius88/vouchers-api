package py.com.jaha.api.general.domain.commands.states;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetStatesRequest {

  private String countryCode;
}
