package py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers.entities.Days;

@Repository
public interface DaysRepository extends CrudRepository<Days, String> {

  @Query("SELECT d FROM Days d " +
      " JOIN VoucherDays vd ON d.id = vd.dayId " +
      " WHERE (:voucherId IS NULL OR vd.voucherId = :voucherId) " +
      " AND (:dayId IS NULL OR vd.dayId = :dayId) " +
      " ORDER BY d.orderDay ASC ")
  List<Days> findDaysBy(@Param("voucherId") String voucherId,
                        @Param("dayId") String dayId);
}

