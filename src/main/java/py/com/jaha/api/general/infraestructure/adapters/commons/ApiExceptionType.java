package py.com.jaha.api.general.infraestructure.adapters.commons;

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
