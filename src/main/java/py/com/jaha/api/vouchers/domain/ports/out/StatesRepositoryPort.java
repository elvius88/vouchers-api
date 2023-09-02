package py.com.jaha.api.vouchers.domain.ports.out;

import py.com.jaha.api.vouchers.domain.models.states.States;

public interface StatesRepositoryPort {

  States getStates(String country);
}
