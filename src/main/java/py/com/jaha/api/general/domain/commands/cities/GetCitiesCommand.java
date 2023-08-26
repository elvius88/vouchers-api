package py.com.jaha.api.general.domain.commands.cities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetCitiesRequest {

  private String countryCode;
  private String stateCode;
}
