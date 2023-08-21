package py.com.jaha.api.general.domain.ports.in;

import py.com.jaha.api.general.domain.commands.cities.GetCitiesRequest;
import py.com.jaha.api.general.domain.commands.cities.GetCitiesResponse;
import py.com.jaha.api.general.domain.usecases.UseCase;

public interface GetCitiesPort extends UseCase<GetCitiesResponse, GetCitiesRequest> {
}
