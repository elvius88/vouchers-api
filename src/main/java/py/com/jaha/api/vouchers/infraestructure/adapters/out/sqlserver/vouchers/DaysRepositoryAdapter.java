package py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers;

import io.vavr.control.Try;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import py.com.jaha.api.vouchers.domain.models.vouchers.Day;
import py.com.jaha.api.vouchers.domain.ports.out.DaysRepositoryPort;
import py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers.mapper.DaysMapper;

@Service
@Slf4j
@RequiredArgsConstructor
public class DaysRepositoryAdapter implements DaysRepositoryPort {

  private final DaysRepository daysRepository;

  @Override
  public List<Day> getDaysBy(String voucherId, String dayId) {
    return Try.of(() -> daysRepository.findDaysBy(voucherId, dayId))
        .map(days -> days)
        .map(DaysMapper.INSTANCE::toDomainList)
        .onFailure(ex -> log.error("Error querying days of vouchers. ", ex))
        .getOrElse(List.of());
  }
}
