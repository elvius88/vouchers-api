package py.com.jaha.api.general.infraestructure.adapters.commons;

import lombok.Data;

@Data
public class ApiException extends RuntimeException {

  private String code;
  private ApiExceptionType type;
  private String userMessage;
  private String userApiMessage;
  private String httpStatus;

}
