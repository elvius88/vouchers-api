package py.com.jaha.api.vouchers.domain.ports.out;

import java.util.List;
import py.com.jaha.api.vouchers.domain.models.vouchers.Day;

public interface DaysRepositoryPort {

  List<Day> getDaysBy(String voucherId, String dayId);
}
