package py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers.entities.Vouchers;

@Repository
public interface VouchersRepository extends CrudRepository<Vouchers, String> {

}

