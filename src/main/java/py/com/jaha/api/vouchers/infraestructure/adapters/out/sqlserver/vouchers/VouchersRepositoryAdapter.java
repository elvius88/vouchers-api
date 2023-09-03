package py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers;

import java.util.List;
import py.com.jaha.api.vouchers.domain.models.vouchers.Voucher;
import py.com.jaha.api.vouchers.domain.ports.out.VouchersRepositoryPort;

public class VouchersRepositoryAdapter implements VouchersRepositoryPort {

  private VouchersRepository vouchersRepository;

  @Override
  public Voucher getVoucher(String id) {
    return null;
  }

  @Override
  public List<Voucher> getVouchersBy(String clientId) {
    return null;
  }
}
