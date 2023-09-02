package py.com.jaha.api.general.domain.usecases.cities;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import py.com.jaha.api.general.domain.commands.cities.GetCitiesCommand;
import py.com.jaha.api.general.domain.commands.cities.GetCitiesResponse;
import py.com.jaha.api.general.domain.ports.in.GetCitiesPort;
import py.com.jaha.api.general.domain.ports.out.CitiesRepositoryPort;

@Slf4j
@RequiredArgsConstructor
public class GetCitiesUseCase implements GetCitiesPort {

  private final CitiesRepositoryPort citiesRepositoryPort;

  @Override
  public GetCitiesResponse execute(GetCitiesCommand command) {
    return null;
  }
}
