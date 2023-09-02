package py.com.jaha.api.vouchers.domain.ports.in;

import py.com.jaha.api.vouchers.domain.commands.cities.GetCitiesCommand;
import py.com.jaha.api.vouchers.domain.commands.cities.GetCitiesResponse;
import py.com.jaha.api.vouchers.domain.usecases.UseCase;

public interface GetCitiesPort extends UseCase<GetCitiesResponse, GetCitiesCommand> {
}
