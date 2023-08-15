package py.com.jaha.api.general.utils;

import java.util.List;
import java.util.UUID;
import py.com.jaha.api.general.infraestructure.adapters.out.sqlserver.feature.entities.IUserFeatureSearchDto;

public class FeatureFactory {

  public static final String GROUP_ID = UUID.randomUUID().toString();
  public static final String GROUP_NAME = "groupOne";
  public static final String GROUP_DESC = "groupDesc";

  public static final String GROUP_ID_OTHER = UUID.randomUUID().toString();
  public static final String GROUP_NAME_OTHER = "groupTwo";
  public static final String GROUP_DESC_OTHER = "groupTwoDesc";

  public static final String FEATURE_ID = UUID.randomUUID().toString();
  public static final String FEATURE_NAME = "Service";
  public static final String FEATURE_DESC = "ServiceDesc";

  public static final String FEATURE_ID_OTHER = UUID.randomUUID().toString();
  public static final String FEATURE_NAME_OTHER = "ServiceTwo";
  public static final String FEATURE_DESC_OTHER = "ServiceTwoDesc";

  public static final String FEATURE_ID_OTHER_OTHER = UUID.randomUUID().toString();
  public static final String FEATURE_NAME_OTHER_OTHER = "ServiceThree";
  public static final String FEATURE_DESC_OTHER_OTHER = "ServiceThreeDesc";

  public static final String WEB = "WEB";
  public static final String ANDROID = "ANDROID";
  public static final String IOS = "IOS";

  public static final String STATUS_ENABLED = "ENABLED";
  public static final String STATUS_DISABLED = "DISABLED";

  public static List<IUserFeatureSearchDto> mockMap() {
    return List.of(
        userFeatureSearchDto(GROUP_ID, GROUP_NAME, GROUP_DESC, FEATURE_ID, FEATURE_NAME, FEATURE_DESC, STATUS_ENABLED, IOS),
        userFeatureSearchDto(GROUP_ID, GROUP_NAME, GROUP_DESC, FEATURE_ID, FEATURE_NAME, FEATURE_DESC, STATUS_ENABLED, WEB),


        userFeatureSearchDto(GROUP_ID, GROUP_NAME, GROUP_DESC, FEATURE_ID_OTHER, FEATURE_NAME_OTHER, FEATURE_DESC_OTHER, STATUS_ENABLED, IOS),
        userFeatureSearchDto(GROUP_ID, GROUP_NAME, GROUP_DESC, FEATURE_ID_OTHER, FEATURE_NAME_OTHER, FEATURE_DESC_OTHER, STATUS_ENABLED, WEB),
        userFeatureSearchDto(GROUP_ID, GROUP_NAME, GROUP_DESC, FEATURE_ID_OTHER, FEATURE_NAME_OTHER, FEATURE_DESC_OTHER, STATUS_ENABLED, ANDROID),

        userFeatureSearchDto(GROUP_ID_OTHER, GROUP_NAME_OTHER, GROUP_DESC_OTHER, FEATURE_ID_OTHER, FEATURE_NAME_OTHER, FEATURE_DESC_OTHER, STATUS_DISABLED, ANDROID),
        userFeatureSearchDto(GROUP_ID_OTHER, GROUP_NAME_OTHER, GROUP_DESC_OTHER, FEATURE_ID_OTHER, FEATURE_NAME_OTHER, FEATURE_DESC_OTHER, STATUS_DISABLED, IOS),
        userFeatureSearchDto(GROUP_ID_OTHER, GROUP_NAME_OTHER, GROUP_DESC_OTHER, FEATURE_ID_OTHER, FEATURE_NAME_OTHER, FEATURE_DESC_OTHER, STATUS_ENABLED, WEB),

        userFeatureSearchDto(GROUP_ID_OTHER, GROUP_NAME_OTHER, GROUP_DESC_OTHER, FEATURE_ID, FEATURE_NAME, FEATURE_DESC, STATUS_DISABLED, ANDROID),
        userFeatureSearchDto(GROUP_ID_OTHER, GROUP_NAME_OTHER, GROUP_DESC_OTHER, FEATURE_ID, FEATURE_NAME, FEATURE_DESC, STATUS_DISABLED, IOS),
        userFeatureSearchDto(GROUP_ID_OTHER, GROUP_NAME_OTHER, GROUP_DESC_OTHER, FEATURE_ID, FEATURE_NAME, FEATURE_DESC, STATUS_ENABLED, WEB),

        userFeatureSearchDto(GROUP_ID_OTHER, GROUP_NAME_OTHER, GROUP_DESC_OTHER, FEATURE_ID_OTHER_OTHER, FEATURE_NAME_OTHER_OTHER, FEATURE_DESC_OTHER_OTHER, STATUS_DISABLED, ANDROID),
        userFeatureSearchDto(GROUP_ID_OTHER, GROUP_NAME_OTHER, GROUP_DESC_OTHER, FEATURE_ID_OTHER_OTHER, FEATURE_NAME_OTHER_OTHER, FEATURE_DESC_OTHER_OTHER, STATUS_DISABLED, WEB)
    );
  }
  
  public static IUserFeatureSearchDto userFeatureSearchDto(String groupId,
                                                           String groupName,
                                                           String groupDescription,
                                                           String featureId,
                                                           String featureName,
                                                           String featureDescription,
                                                           String status,
                                                           String channel) {
    return new IUserFeatureSearchDto() {

      @Override
      public String getGroupId() {
        return groupId;
      }

      @Override
      public String getGroupName() {
        return groupName;
      }

      @Override
      public String getGroupDescription() {
        return groupDescription;
      }

      @Override
      public String getFeatureId() {
        return featureId;
      }

      @Override
      public String getFeatureName() {
        return featureName;
      }

      @Override
      public String getFeatureDescription() {
        return featureDescription;
      }

      @Override
      public String getStatus() {
        return status;
      }

      @Override
      public String getClientChannel() {
        return channel;
      }
    };
  }
}
