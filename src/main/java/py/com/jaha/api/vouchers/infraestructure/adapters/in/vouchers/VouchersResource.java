package py.com.jaha.api.vouchers.infraestructure.adapters.in.vouchers;

import static py.com.jaha.api.vouchers.constants.GlobalConstants.API_BASE;
import static py.com.jaha.api.vouchers.commons.ApiVersions.API_VERSION_V1;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import py.com.jaha.api.vouchers.commons.Filterable;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVoucherResponse;
import py.com.jaha.api.vouchers.domain.commands.vouchers.GetVouchersResponse;
import py.com.jaha.api.vouchers.domain.ports.in.GetVoucherPort;
import py.com.jaha.api.vouchers.commons.ApiError;
import py.com.jaha.api.vouchers.commons.ApiException;
import py.com.jaha.api.vouchers.commons.ApiResponse;
import py.com.jaha.api.vouchers.domain.ports.in.GetVouchersPort;
import py.com.jaha.api.vouchers.infraestructure.adapters.mappers.VouchersCommandMapper;

@RestController
@RequestMapping(value = "/" + API_BASE + "/vouchers/" + API_VERSION_V1)
@Tag(name = "VouchersResource")
@RequiredArgsConstructor
@Slf4j
public class VouchersResource {

    private final GetVoucherPort getVoucherUseCase;
    private final GetVouchersPort getVouchersUseCase;

    @Operation(summary = "Voucher", description = "Get voucher data by ID")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Ok", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiError.class))),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiError.class))),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiError.class))) })
    @Filterable
    @GetMapping("/vouchers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<GetVoucherResponse> getVoucher(@PathVariable String id) throws ApiException {
        return ApiResponse.of(getVoucherUseCase.execute(VouchersCommandMapper.INSTANCE.toCommand(id, null)));
    }

    @Operation(summary = "Vouchers", description = "Get vouchers data by parameters filters")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Ok", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiError.class))),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiError.class))),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiError.class))) })
    @Filterable
    @GetMapping("/vouchers")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<GetVouchersResponse> getVouchers(@RequestParam(required = false) String clientId) throws ApiException {
        return ApiResponse.of(getVoucherUseCase.execute(VouchersCommandMapper.INSTANCE.toCommand(null, clientId)));
    }
}
