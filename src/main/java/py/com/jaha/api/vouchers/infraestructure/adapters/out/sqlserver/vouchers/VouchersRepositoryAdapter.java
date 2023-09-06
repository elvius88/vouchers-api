package py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers;

import io.vavr.control.Try;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import py.com.jaha.api.vouchers.domain.models.vouchers.Voucher;
import py.com.jaha.api.vouchers.domain.ports.out.VouchersRepositoryPort;
import py.com.jaha.api.vouchers.infraestructure.adapters.out.sqlserver.vouchers.mapper.VouchersMapper;

@Service
@Slf4j
@RequiredArgsConstructor
public class VouchersRepositoryAdapter implements VouchersRepositoryPort {

  private final VouchersRepository vouchersRepository;

  @Override
  public Voucher getVoucher(String id) {
    return Try.of(() -> vouchersRepository.findById(id))
        .filter(Optional::isPresent)
        .map(voucher -> VouchersMapper.INSTANCE.toDomain(voucher.get()))
        .get();
  }

  @Override
  public List<Voucher> getVouchersBy(String clientId, String establishmentId) {
    return Try.of(() -> vouchersRepository.findVouchersBy(clientId, establishmentId))
        .map(VouchersMapper.INSTANCE::toDomainList)
        .get();
  }
}
