package py.com.jaha.api.general.domain.usecases.states;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import py.com.jaha.api.general.domain.commands.states.GetStatesCommand;
import py.com.jaha.api.general.domain.commands.states.GetStatesResponse;
import py.com.jaha.api.general.domain.ports.in.GetStatesPort;
import py.com.jaha.api.general.domain.ports.out.StatesRepositoryPort;

@Slf4j
@RequiredArgsConstructor
public class GetStatesUseCase implements GetStatesPort {

  private final StatesRepositoryPort statesRepositoryPort;

  @Override
  public GetStatesResponse execute(GetStatesCommand command) {
    return null;
  }
}
