/*
 * API v1
 * FormAPI is a service that helps you fill out and sign PDF templates.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.formapi;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UpdateSubmissionDataRequestData
 */
@javax.annotation.Generated(value = "io.formapi.codegen.FormApiJavaClientCodegen", date = "2018-12-01T01:05:42.176+07:00[Asia/Bangkok]")
public class UpdateSubmissionDataRequestData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email = null;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<String> fields = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  /**
   * Gets or Sets authType
   */
  @JsonAdapter(AuthTypeEnum.Adapter.class)
  public enum AuthTypeEnum {
    NONE("none"),
    
    PASSWORD("password"),
    
    OAUTH("oauth"),
    
    EMAIL_LINK("email_link"),
    
    PHONE_NUMBER("phone_number"),
    
    LDAP("ldap"),
    
    SAML("saml");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String text) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<AuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AuthTypeEnum authType = null;

  /**
   * Gets or Sets authSecondFactorType
   */
  @JsonAdapter(AuthSecondFactorTypeEnum.Adapter.class)
  public enum AuthSecondFactorTypeEnum {
    NONE("none"),
    
    PHONE_NUMBER("phone_number"),
    
    TOTP("totp"),
    
    MOBILE_PUSH("mobile_push"),
    
    SECURITY_KEY("security_key"),
    
    FINGERPRINT("fingerprint");

    private String value;

    AuthSecondFactorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthSecondFactorTypeEnum fromValue(String text) {
      for (AuthSecondFactorTypeEnum b : AuthSecondFactorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<AuthSecondFactorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthSecondFactorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthSecondFactorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthSecondFactorTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTH_SECOND_FACTOR_TYPE = "auth_second_factor_type";
  @SerializedName(SERIALIZED_NAME_AUTH_SECOND_FACTOR_TYPE)
  private AuthSecondFactorTypeEnum authSecondFactorType = null;

  public static final String SERIALIZED_NAME_AUTH_PROVIDER = "auth_provider";
  @SerializedName(SERIALIZED_NAME_AUTH_PROVIDER)
  private String authProvider = null;

  public static final String SERIALIZED_NAME_AUTH_SESSION_STARTED_AT = "auth_session_started_at";
  @SerializedName(SERIALIZED_NAME_AUTH_SESSION_STARTED_AT)
  private String authSessionStartedAt = null;

  public static final String SERIALIZED_NAME_AUTH_SESSION_ID_HASH = "auth_session_id_hash";
  @SerializedName(SERIALIZED_NAME_AUTH_SESSION_ID_HASH)
  private String authSessionIdHash = null;

  public static final String SERIALIZED_NAME_AUTH_USER_ID_HASH = "auth_user_id_hash";
  @SerializedName(SERIALIZED_NAME_AUTH_USER_ID_HASH)
  private String authUserIdHash = null;

  public static final String SERIALIZED_NAME_AUTH_USERNAME_HASH = "auth_username_hash";
  @SerializedName(SERIALIZED_NAME_AUTH_USERNAME_HASH)
  private String authUsernameHash = null;

  public static final String SERIALIZED_NAME_AUTH_PHONE_NUMBER_HASH = "auth_phone_number_hash";
  @SerializedName(SERIALIZED_NAME_AUTH_PHONE_NUMBER_HASH)
  private String authPhoneNumberHash = null;

  public UpdateSubmissionDataRequestData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateSubmissionDataRequestData email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UpdateSubmissionDataRequestData order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public UpdateSubmissionDataRequestData fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public UpdateSubmissionDataRequestData addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<String>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(value = "")
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public UpdateSubmissionDataRequestData metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public UpdateSubmissionDataRequestData authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @ApiModelProperty(value = "")
  public AuthTypeEnum getAuthType() {
    return authType;
  }

  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }

  public UpdateSubmissionDataRequestData authSecondFactorType(AuthSecondFactorTypeEnum authSecondFactorType) {
    this.authSecondFactorType = authSecondFactorType;
    return this;
  }

   /**
   * Get authSecondFactorType
   * @return authSecondFactorType
  **/
  @ApiModelProperty(value = "")
  public AuthSecondFactorTypeEnum getAuthSecondFactorType() {
    return authSecondFactorType;
  }

  public void setAuthSecondFactorType(AuthSecondFactorTypeEnum authSecondFactorType) {
    this.authSecondFactorType = authSecondFactorType;
  }

  public UpdateSubmissionDataRequestData authProvider(String authProvider) {
    this.authProvider = authProvider;
    return this;
  }

   /**
   * Get authProvider
   * @return authProvider
  **/
  @ApiModelProperty(value = "")
  public String getAuthProvider() {
    return authProvider;
  }

  public void setAuthProvider(String authProvider) {
    this.authProvider = authProvider;
  }

  public UpdateSubmissionDataRequestData authSessionStartedAt(String authSessionStartedAt) {
    this.authSessionStartedAt = authSessionStartedAt;
    return this;
  }

   /**
   * Get authSessionStartedAt
   * @return authSessionStartedAt
  **/
  @ApiModelProperty(value = "")
  public String getAuthSessionStartedAt() {
    return authSessionStartedAt;
  }

  public void setAuthSessionStartedAt(String authSessionStartedAt) {
    this.authSessionStartedAt = authSessionStartedAt;
  }

  public UpdateSubmissionDataRequestData authSessionIdHash(String authSessionIdHash) {
    this.authSessionIdHash = authSessionIdHash;
    return this;
  }

   /**
   * Get authSessionIdHash
   * @return authSessionIdHash
  **/
  @ApiModelProperty(value = "")
  public String getAuthSessionIdHash() {
    return authSessionIdHash;
  }

  public void setAuthSessionIdHash(String authSessionIdHash) {
    this.authSessionIdHash = authSessionIdHash;
  }

  public UpdateSubmissionDataRequestData authUserIdHash(String authUserIdHash) {
    this.authUserIdHash = authUserIdHash;
    return this;
  }

   /**
   * Get authUserIdHash
   * @return authUserIdHash
  **/
  @ApiModelProperty(value = "")
  public String getAuthUserIdHash() {
    return authUserIdHash;
  }

  public void setAuthUserIdHash(String authUserIdHash) {
    this.authUserIdHash = authUserIdHash;
  }

  public UpdateSubmissionDataRequestData authUsernameHash(String authUsernameHash) {
    this.authUsernameHash = authUsernameHash;
    return this;
  }

   /**
   * Get authUsernameHash
   * @return authUsernameHash
  **/
  @ApiModelProperty(value = "")
  public String getAuthUsernameHash() {
    return authUsernameHash;
  }

  public void setAuthUsernameHash(String authUsernameHash) {
    this.authUsernameHash = authUsernameHash;
  }

  public UpdateSubmissionDataRequestData authPhoneNumberHash(String authPhoneNumberHash) {
    this.authPhoneNumberHash = authPhoneNumberHash;
    return this;
  }

   /**
   * Get authPhoneNumberHash
   * @return authPhoneNumberHash
  **/
  @ApiModelProperty(value = "")
  public String getAuthPhoneNumberHash() {
    return authPhoneNumberHash;
  }

  public void setAuthPhoneNumberHash(String authPhoneNumberHash) {
    this.authPhoneNumberHash = authPhoneNumberHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSubmissionDataRequestData updateSubmissionDataRequestData = (UpdateSubmissionDataRequestData) o;
    return Objects.equals(this.name, updateSubmissionDataRequestData.name) &&
        Objects.equals(this.email, updateSubmissionDataRequestData.email) &&
        Objects.equals(this.order, updateSubmissionDataRequestData.order) &&
        Objects.equals(this.fields, updateSubmissionDataRequestData.fields) &&
        Objects.equals(this.metadata, updateSubmissionDataRequestData.metadata) &&
        Objects.equals(this.authType, updateSubmissionDataRequestData.authType) &&
        Objects.equals(this.authSecondFactorType, updateSubmissionDataRequestData.authSecondFactorType) &&
        Objects.equals(this.authProvider, updateSubmissionDataRequestData.authProvider) &&
        Objects.equals(this.authSessionStartedAt, updateSubmissionDataRequestData.authSessionStartedAt) &&
        Objects.equals(this.authSessionIdHash, updateSubmissionDataRequestData.authSessionIdHash) &&
        Objects.equals(this.authUserIdHash, updateSubmissionDataRequestData.authUserIdHash) &&
        Objects.equals(this.authUsernameHash, updateSubmissionDataRequestData.authUsernameHash) &&
        Objects.equals(this.authPhoneNumberHash, updateSubmissionDataRequestData.authPhoneNumberHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, order, fields, metadata, authType, authSecondFactorType, authProvider, authSessionStartedAt, authSessionIdHash, authUserIdHash, authUsernameHash, authPhoneNumberHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSubmissionDataRequestData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    authSecondFactorType: ").append(toIndentedString(authSecondFactorType)).append("\n");
    sb.append("    authProvider: ").append(toIndentedString(authProvider)).append("\n");
    sb.append("    authSessionStartedAt: ").append(toIndentedString(authSessionStartedAt)).append("\n");
    sb.append("    authSessionIdHash: ").append(toIndentedString(authSessionIdHash)).append("\n");
    sb.append("    authUserIdHash: ").append(toIndentedString(authUserIdHash)).append("\n");
    sb.append("    authUsernameHash: ").append(toIndentedString(authUsernameHash)).append("\n");
    sb.append("    authPhoneNumberHash: ").append(toIndentedString(authPhoneNumberHash)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

