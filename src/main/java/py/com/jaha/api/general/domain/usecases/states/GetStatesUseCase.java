package py.com.jaha.api.general.domain.usecases.states;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import py.com.jaha.api.general.domain.commands.states.GetStatesRequest;
import py.com.jaha.api.general.domain.commands.states.GetStatesResponse;
import py.com.jaha.api.general.domain.ports.in.GetStatesPort;

@Slf4j
@RequiredArgsConstructor
public class GetStatesUseCase implements GetStatesPort {

  @Override
  public GetStatesResponse execute(GetStatesRequest command) {
    return null;
  }
}
