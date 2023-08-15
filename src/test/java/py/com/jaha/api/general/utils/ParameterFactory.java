package py.com.jaha.api.general.utils;

import py.com.jaha.api.general.domain.models.parameters.ParametersResponse;

public class ParameterFactory {

  public static ParametersResponse parameterResponse(String domain,
                                                     String name,
                                                     String value) {
    var parameterResponse = new ParametersResponse();
    parameterResponse.setDomain(domain);
    parameterResponse.setName(name);
    parameterResponse.setValue(value);

    return parameterResponse;
  }
}
