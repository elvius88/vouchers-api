package py.com.jaha.api.vouchers.domain.models.commons;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OpenApiDTO {

	private String title;
    private String description;
    private String version; 
}
