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

/**
 * CreateSubmissionDataBatchRequest
 */
@javax.annotation.Generated(value = "io.formapi.codegen.FormApiJavaClientCodegen", date = "2018-11-05T00:28:58.468+07:00[Asia/Bangkok]")
public class CreateSubmissionDataBatchRequest {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId = null;

  public static final String SERIALIZED_NAME_TEST = "test";
  @SerializedName(SERIALIZED_NAME_TEST)
  private Boolean test = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data = null;

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private String html = null;

  public static final String SERIALIZED_NAME_CSS = "css";
  @SerializedName(SERIALIZED_NAME_CSS)
  private String css = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public CreateSubmissionDataBatchRequest templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public CreateSubmissionDataBatchRequest test(Boolean test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @ApiModelProperty(value = "")
  public Boolean getTest() {
    return test;
  }

  public void setTest(Boolean test) {
    this.test = test;
  }

  public CreateSubmissionDataBatchRequest data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public CreateSubmissionDataBatchRequest html(String html) {
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @ApiModelProperty(value = "")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public CreateSubmissionDataBatchRequest css(String css) {
    this.css = css;
    return this;
  }

   /**
   * Get css
   * @return css
  **/
  @ApiModelProperty(value = "")
  public String getCss() {
    return css;
  }

  public void setCss(String css) {
    this.css = css;
  }

  public CreateSubmissionDataBatchRequest metadata(Object metadata) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubmissionDataBatchRequest createSubmissionDataBatchRequest = (CreateSubmissionDataBatchRequest) o;
    return Objects.equals(this.templateId, createSubmissionDataBatchRequest.templateId) &&
        Objects.equals(this.test, createSubmissionDataBatchRequest.test) &&
        Objects.equals(this.data, createSubmissionDataBatchRequest.data) &&
        Objects.equals(this.html, createSubmissionDataBatchRequest.html) &&
        Objects.equals(this.css, createSubmissionDataBatchRequest.css) &&
        Objects.equals(this.metadata, createSubmissionDataBatchRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, test, data, html, css, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubmissionDataBatchRequest {\n");
    
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    css: ").append(toIndentedString(css)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
