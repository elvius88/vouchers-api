package py.com.jaha.api.general.infraestructure.adapters.commons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiException extends RuntimeException {

  private String code;
  private ApiExceptionType type;
  private String userMessage;
  private String userApiMessage;
  private String httpStatus;

}
