package py.com.jaha.api.general.infraestructure.adapters.out.sqlserver.passwordpolicies;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordPoliciesRepository extends CrudRepository<String, String> {

}

