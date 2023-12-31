package py.com.jaha.api.vouchers.domain.models.vouchers;

import java.io.Serializable;
import java.time.OffsetDateTime;
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
@Builder
@ToString
public class Day implements Serializable {

  private String id;
  private String name;
  private Integer orderDay;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
}
