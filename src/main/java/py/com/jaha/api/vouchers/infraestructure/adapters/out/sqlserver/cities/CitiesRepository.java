package py.com.jaha.api.general.infraestructure.adapters.out.sqlserver.cities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiesRepository extends CrudRepository<String, String> {

}

