package py.com.jaha.api.general.domain.ports.in;

import py.com.jaha.api.general.domain.models.departments.GetDepartmentsRequest;
import py.com.jaha.api.general.domain.models.departments.GetDepartmentsResponse;
import py.com.jaha.api.general.domain.usecases.UseCase;

public interface GetDepartmentPort extends UseCase<GetDepartmentsResponse, GetDepartmentsRequest> {}
