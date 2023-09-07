package py.com.jaha.api.vouchers.config;

import py.com.jaha.api.vouchers.config.exception.ApiException;
import py.com.jaha.api.vouchers.config.exception.ApiExceptionType;

public class ApiTimeoutException extends ApiException {
  public ApiTimeoutException(String code, String message) {
    super(code, message, ApiExceptionType.COMMUNICATION);
  }
}
