package py.com.jaha.api.vouchers.domain.commands.vouchers;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetVouchersResponse {

  private List<GetVoucherResponse> vouchers;
}
