package py.com.jaha.api.vouchers.commons;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public enum ApiExceptionType {
  INFO,
  WARNING,
  ERROR,
  FATAL,
  APPLICATION,
  CRITICAL;
}
