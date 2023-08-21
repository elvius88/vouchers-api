package py.com.jaha.api.general.domain.ports.in;

import py.com.jaha.api.general.domain.commands.states.GetStatesRequest;
import py.com.jaha.api.general.domain.commands.states.GetStatesResponse;
import py.com.jaha.api.general.domain.usecases.UseCase;

public interface GetStatesPort extends UseCase<GetStatesResponse, GetStatesRequest> {
}
