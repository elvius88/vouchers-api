package py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.cities;

import py.com.jaha.api.vouchers.domain.models.cities.Cities;
import py.com.jaha.api.vouchers.domain.ports.out.CitiesRepositoryPort;

public class CitiesRepositoryAdapter implements CitiesRepositoryPort {

  private CitiesRepository citiesRepository;

  @Override
  public Cities getCities(String country, String state) {
    return null;
  }
}
