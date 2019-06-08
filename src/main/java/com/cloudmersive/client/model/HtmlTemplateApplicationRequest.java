/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import com.cloudmersive.client.model.HtmlTemplateOperation;
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
 * HTML template application request
 */
@ApiModel(description = "HTML template application request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-08T02:01:56.203Z")
public class HtmlTemplateApplicationRequest {
  @SerializedName("HtmlTemplate")
  private String htmlTemplate = null;

  @SerializedName("HtmlTemplateUrl")
  private String htmlTemplateUrl = null;

  @SerializedName("Operations")
  private List<HtmlTemplateOperation> operations = null;

  public HtmlTemplateApplicationRequest htmlTemplate(String htmlTemplate) {
    this.htmlTemplate = htmlTemplate;
    return this;
  }

   /**
   * Get htmlTemplate
   * @return htmlTemplate
  **/
  @ApiModelProperty(value = "")
  public String getHtmlTemplate() {
    return htmlTemplate;
  }

  public void setHtmlTemplate(String htmlTemplate) {
    this.htmlTemplate = htmlTemplate;
  }

  public HtmlTemplateApplicationRequest htmlTemplateUrl(String htmlTemplateUrl) {
    this.htmlTemplateUrl = htmlTemplateUrl;
    return this;
  }

   /**
   * Get htmlTemplateUrl
   * @return htmlTemplateUrl
  **/
  @ApiModelProperty(value = "")
  public String getHtmlTemplateUrl() {
    return htmlTemplateUrl;
  }

  public void setHtmlTemplateUrl(String htmlTemplateUrl) {
    this.htmlTemplateUrl = htmlTemplateUrl;
  }

  public HtmlTemplateApplicationRequest operations(List<HtmlTemplateOperation> operations) {
    this.operations = operations;
    return this;
  }

  public HtmlTemplateApplicationRequest addOperationsItem(HtmlTemplateOperation operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<HtmlTemplateOperation>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(value = "")
  public List<HtmlTemplateOperation> getOperations() {
    return operations;
  }

  public void setOperations(List<HtmlTemplateOperation> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlTemplateApplicationRequest htmlTemplateApplicationRequest = (HtmlTemplateApplicationRequest) o;
    return Objects.equals(this.htmlTemplate, htmlTemplateApplicationRequest.htmlTemplate) &&
        Objects.equals(this.htmlTemplateUrl, htmlTemplateApplicationRequest.htmlTemplateUrl) &&
        Objects.equals(this.operations, htmlTemplateApplicationRequest.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlTemplate, htmlTemplateUrl, operations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlTemplateApplicationRequest {\n");
    
    sb.append("    htmlTemplate: ").append(toIndentedString(htmlTemplate)).append("\n");
    sb.append("    htmlTemplateUrl: ").append(toIndentedString(htmlTemplateUrl)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

