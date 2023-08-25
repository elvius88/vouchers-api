package py.com.jaha.api.general.domain.models.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum ErrorCatalog {
  GLOBAL_GENERAL_DATABASE_ERROR_CODE(GlobalErrorCodes.GLOBAL_GENERAL_DATABASE_ERROR_CODE, "Error de conexión con la base de datos", null),
  GLOBAL_VALIDATION_ERROR_CODE(GlobalErrorCodes.GLOBAL_VALIDATION_ERROR_CODE, "Datos de búsqueda incorrectos", null),
  GLOBAL_INVALID_PARAMETER_ERROR_CODE(GlobalErrorCodes.GLOBAL_INVALID_PARAMETER_ERROR_CODE, "Error en el formato de datos", null),
  GLOBAL_CORE_GENERAL_ERROR_CODE(GlobalErrorCodes.GLOBAL_CORE_GENERAL_ERROR_CODE, "Error de conexión Core Banking", null),
  ERROR_GETTING_EXTERNAL_CODE("GEN0004", "Error de BanTotal no configurado", null),
  INVALID_JSON_DATA_SERIALIZE("GEN0005", "Ocurrió un error al serializar la información", null),
  INVALID_JSON_DATA_PARAM("GEN0006", "Ocurrió un error al deserializar la información", null);

  private final String code;
  private final String description;
  // Only for errors obtained from external apis
  private final Long externalCode;

  public static ErrorCatalog getErrorByExternalCode(Long externalCode) {
    return Arrays.stream(ErrorCatalog.values())
        .filter(error -> externalCode.equals(error.getExternalCode()))
        .findFirst()
        .orElseGet(() -> ERROR_GETTING_EXTERNAL_CODE);
  }
}
