package py.com.jaha.api.general.domain.models.departments;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GetDepartmentsRequest {
    private Integer countryCode;
}
