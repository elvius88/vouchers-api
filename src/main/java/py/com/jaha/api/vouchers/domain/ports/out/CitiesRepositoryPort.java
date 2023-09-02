package py.com.jaha.api.vouchers.domain.ports.out;

import py.com.jaha.api.vouchers.domain.models.cities.Cities;

public interface CitiesRepositoryPort {

  Cities getCities(String country, String state);
}
