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
import io.formapi.CreateSubmissionDataBatchRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SubmissionBatchData
 */
@javax.annotation.Generated(value = "io.formapi.codegen.FormApiJavaClientCodegen", date = "2018-12-01T01:05:42.176+07:00[Asia/Bangkok]")
public class SubmissionBatchData {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_TEST = "test";
  @SerializedName(SERIALIZED_NAME_TEST)
  private Boolean test = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId = null;

  public static final String SERIALIZED_NAME_SUBMISSIONS = "submissions";
  @SerializedName(SERIALIZED_NAME_SUBMISSIONS)
  private List<CreateSubmissionDataBatchRequest> submissions = new ArrayList<CreateSubmissionDataBatchRequest>();

  public SubmissionBatchData metadata(Object metadata) {
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

  public SubmissionBatchData test(Boolean test) {
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

  public SubmissionBatchData templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(value = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public SubmissionBatchData submissions(List<CreateSubmissionDataBatchRequest> submissions) {
    this.submissions = submissions;
    return this;
  }

  public SubmissionBatchData addSubmissionsItem(CreateSubmissionDataBatchRequest submissionsItem) {
    this.submissions.add(submissionsItem);
    return this;
  }

   /**
   * Get submissions
   * @return submissions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CreateSubmissionDataBatchRequest> getSubmissions() {
    return submissions;
  }

  public void setSubmissions(List<CreateSubmissionDataBatchRequest> submissions) {
    this.submissions = submissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionBatchData submissionBatchData = (SubmissionBatchData) o;
    return Objects.equals(this.metadata, submissionBatchData.metadata) &&
        Objects.equals(this.test, submissionBatchData.test) &&
        Objects.equals(this.templateId, submissionBatchData.templateId) &&
        Objects.equals(this.submissions, submissionBatchData.submissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, test, templateId, submissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionBatchData {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    submissions: ").append(toIndentedString(submissions)).append("\n");
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

