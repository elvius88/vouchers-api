package py.com.jaha.api.general.domain.usecases.cities;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import py.com.jaha.api.general.domain.commands.cities.GetCitiesRequest;
import py.com.jaha.api.general.domain.commands.cities.GetCitiesResponse;
import py.com.jaha.api.general.domain.ports.in.GetCitiesPort;

@Slf4j
@RequiredArgsConstructor
public class GetCitiesUseCase implements GetCitiesPort {

  @Override
  public GetCitiesResponse execute(GetCitiesRequest command) {
    return null;
  }
}
