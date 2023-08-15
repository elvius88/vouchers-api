package py.com.jaha.api.general.domain.models.departments;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetDepartmentsResponse {
    private List<DepartmentResponse> departments;
}
