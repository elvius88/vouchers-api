package py.com.jaha.api.vouchers.commons;

import java.util.List;
import java.util.Optional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import py.com.jaha.api.vouchers.config.DtoMeta;

@DtoMeta
@NoArgsConstructor
@Getter
@Setter
public class ApiPageableResponse<T> extends ApiDtoResponse {

  private List<T> data;
  private CustomPagination pagination;

  public static <T> ApiPageableResponse<T> of(List<T> data) {
    ApiPageableResponse<T> response = new ApiPageableResponse<>();
    response.setData(data);
    return response;
  }

  public static <T> ApiPageableResponse<T> of(Optional<List<T>> data) {
    ApiPageableResponse<T> response = new ApiPageableResponse<>();
    data.ifPresent(response::setData);
    return response;
  }
}
