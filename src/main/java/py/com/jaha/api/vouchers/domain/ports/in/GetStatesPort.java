package py.com.jaha.api.vouchers.domain.ports.in;

import py.com.jaha.api.vouchers.domain.commands.states.GetStatesCommand;
import py.com.jaha.api.vouchers.domain.commands.states.GetStatesResponse;
import py.com.jaha.api.vouchers.domain.usecases.UseCase;

public interface GetStatesPort extends UseCase<GetStatesResponse, GetStatesCommand> {
}
