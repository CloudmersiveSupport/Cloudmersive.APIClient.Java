/*
 * convertapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Response from an HTML template application
 */
@ApiModel(description = "Response from an HTML template application")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-21T00:44:55.330-07:00")
public class HtmlTemplateApplicationResponse {
  @JsonProperty("Successful")
  private Boolean successful = null;

  @JsonProperty("FinalHtml")
  private String finalHtml = null;

  public HtmlTemplateApplicationResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @ApiModelProperty(value = "")
  public Boolean getSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public HtmlTemplateApplicationResponse finalHtml(String finalHtml) {
    this.finalHtml = finalHtml;
    return this;
  }

   /**
   * Get finalHtml
   * @return finalHtml
  **/
  @ApiModelProperty(value = "")
  public String getFinalHtml() {
    return finalHtml;
  }

  public void setFinalHtml(String finalHtml) {
    this.finalHtml = finalHtml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlTemplateApplicationResponse htmlTemplateApplicationResponse = (HtmlTemplateApplicationResponse) o;
    return Objects.equals(this.successful, htmlTemplateApplicationResponse.successful) &&
        Objects.equals(this.finalHtml, htmlTemplateApplicationResponse.finalHtml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, finalHtml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlTemplateApplicationResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    finalHtml: ").append(toIndentedString(finalHtml)).append("\n");
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

