package py.com.jaha.api.general.domain.ports.in;

import py.com.jaha.api.general.domain.models.countries.GetCountryRequest;
import py.com.jaha.api.general.domain.models.countries.GetCountryResponse;
import py.com.jaha.api.general.domain.usecases.UseCase;

public interface GetCountryPort extends UseCase<GetCountryResponse, GetCountryRequest> {

}
