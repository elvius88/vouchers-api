package py.com.jaha.api.vouchers.domain.models.states;

import java.io.Serializable;
import java.util.List;
import py.com.jaha.api.vouchers.config.IdNameDto;

public class States implements Serializable {

  private List<IdNameDto<String, String>> states;
}
