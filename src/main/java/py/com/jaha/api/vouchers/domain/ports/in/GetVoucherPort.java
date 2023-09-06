package py.com.jaha.api.vouchers.domain.ports.in;

import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVoucherResponse;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersCommand;
import py.com.jaha.api.vouchers.domain.usecases.UseCase;

public interface GetVoucherPort extends UseCase<GetVoucherResponse, GetVouchersCommand> {
}
