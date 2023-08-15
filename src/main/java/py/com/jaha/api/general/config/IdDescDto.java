package py.com.jaha.api.general.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DtoMeta
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IdDescDto<K, V> {

  private K id;
  private V description;

  public static <K, V> IdDescDto<K, V> of(K id, V description) {
    return new IdDescDto<>(id, description);
  }
}
