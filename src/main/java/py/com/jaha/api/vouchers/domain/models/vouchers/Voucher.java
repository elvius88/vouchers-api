package py.com.jaha.api.vouchers.domain.models.vouchers;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class Voucher implements Serializable {

  private String id;
  private String name;
  private String description;
  private String imagePath;
  private String term;
  private LocalDate startDate;
  private LocalTime startHour;
  private LocalDate endDate;
  private LocalTime endHour;
  private List<Day> days;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
}
