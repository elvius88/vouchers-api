package py.com.jaha.api.general.domain.ports.in;

import py.com.jaha.api.general.domain.models.cities.GetCitiesRequest;
import py.com.jaha.api.general.domain.models.cities.GetCitiesResponse;
import py.com.jaha.api.general.domain.usecases.UseCase;

public interface GetCitiesPort extends UseCase<GetCitiesResponse, GetCitiesRequest> {
}
