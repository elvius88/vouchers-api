package py.com.jaha.api.general.infraestructure.adapters.commons;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ApiDtoResponse {

  private List<ApiMessage> messages;
}
