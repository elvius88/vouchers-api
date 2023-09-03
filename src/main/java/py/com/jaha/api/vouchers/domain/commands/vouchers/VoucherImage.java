package py.com.jaha.api.vouchers.domain.commands.vouchers;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import py.com.jaha.api.vouchers.config.DtoMeta;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@DtoMeta
public class VoucherImage implements Serializable {

  private String id;

  @Schema(name = "voucher_image_path")
  private String imagePath;
}
