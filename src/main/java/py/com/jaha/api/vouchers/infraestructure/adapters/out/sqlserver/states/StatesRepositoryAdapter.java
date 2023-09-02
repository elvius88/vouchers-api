package py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.states;

import py.com.jaha.api.vouchers.domain.models.states.States;
import py.com.jaha.api.vouchers.domain.ports.out.StatesRepositoryPort;

public class StatesRepositoryAdapter implements StatesRepositoryPort {

  private StatesRepository statesRepository;

  @Override
  public States getStates(String country) {
    return null;
  }
}
