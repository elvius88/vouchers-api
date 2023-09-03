package py.com.jaha.api.vouchers.domain.ports.in;

import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersCommand;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersResponse;
import py.com.jaha.api.vouchers.domain.usecases.UseCase;

public interface GetVouchersPort extends UseCase<GetVouchersResponse, GetVouchersCommand> {
}
