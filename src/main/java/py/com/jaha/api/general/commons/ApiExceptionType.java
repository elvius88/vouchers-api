package py.com.jaha.api.general.commons;

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
