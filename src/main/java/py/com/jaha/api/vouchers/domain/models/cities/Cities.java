package py.com.jaha.api.vouchers.domain.models.cities;

import java.io.Serializable;
import java.util.List;
import py.com.jaha.api.vouchers.config.IdNameDto;

public class Cities implements Serializable {

  private List<IdNameDto<String, String>> cities;
}
