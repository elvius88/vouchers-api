package py.com.jaha.api.general.infraestructure.adapters.commons;

import static java.util.Objects.nonNull;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static py.com.jaha.api.general.domain.models.commons.enums.GlobalErrorCodes.GLOBAL_UNEXPECTED_ERROR_CODE;

import org.springframework.http.HttpStatus;

public class ErrorCommon {
	
//	public static ApiException buildErrorCommon(Throwable throwable) {
//		return throwable instanceof ApiException ? (ApiException) throwable
//				: new ApiException(GLOBAL_UNEXPECTED_ERROR_CODE,
//						nonNull(throwable.getMessage()) ? throwable.getMessage() : "No es posible obtener la informacion",
//				HttpStatus.INTERNAL_SERVER_ERROR.value(),
//				false);
//	}
//
//	public static ApiException createInternalError(String code, String message) {
//		return new ApiException(code, message, INTERNAL_SERVER_ERROR.value(), false);
//	}
//
//	public static ApiException createNotFoundError(String code, String message) {
//		return new NotFoundException(code, message, message, false);
//	}
}
