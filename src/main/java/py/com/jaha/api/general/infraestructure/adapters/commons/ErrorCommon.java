package py.com.jaha.api.general.infraestructure.adapters.commons;

import java.util.Objects;

import org.springframework.http.HttpStatus;

import py.com.bbva.api.apicommon.constants.GlobalErrorCodes;
import py.com.bbva.api.apicommon.exception.ApiException;
import py.com.bbva.api.apicommon.exception.NotFoundException;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

public class ErrorCommon {
	
	public static ApiException buildErrorCommon(Throwable throwable) {
		return throwable instanceof ApiException ? (ApiException) throwable
				: new ApiException(GlobalErrorCodes.GLOBAL_UNEXPECTED_ERROR_CODE,
						Objects.nonNull(throwable.getMessage())?throwable.getMessage():"No es posible obtener la informacion", HttpStatus.INTERNAL_SERVER_ERROR.value(), false);
	}

	public static ApiException createInternalError(String code, String message) {
		return new ApiException(code, message, INTERNAL_SERVER_ERROR.value(), false);
	}

	public static ApiException createNotFoundError(String code, String message) {
		return new NotFoundException(code, message, message, false);
	}
}
