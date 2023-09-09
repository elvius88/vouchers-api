package py.com.jaha.api.vouchers.domain.commands.vouchers;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import py.com.jaha.api.vouchers.domain.models.vouchers.Day;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GetVoucherResponse {

  private String id;
  private String name;

  private String description;

  @Schema(name = "voucher_image_path")
  @JsonProperty(value = "voucher_image_path")
  private String imagePath;

  private String terms;

  @Schema(name = "voucher_images")
  @JsonProperty(value = "voucher_images")
  private List<VoucherImage> imagesPath;

  @Schema(name = "days")
  private List<GetDayResponse> days;
}
