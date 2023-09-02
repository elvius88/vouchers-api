package py.com.jaha.api.general.infraestructure.adapters.out.sqlserver.states;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatesRepository extends CrudRepository<String, String> {

}

