package py.com.jaha.api.vouchers.domain.ports.out;

import java.util.List;
import py.com.jaha.api.vouchers.domain.models.vouchers.Voucher;

public interface VouchersRepositoryPort {

  Voucher getVoucher(String id);

  List<Voucher> getVouchersBy(String clientId);
}
