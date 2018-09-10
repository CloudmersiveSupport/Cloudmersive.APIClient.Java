/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.model.OcrPageResult;
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
 * Response from an OCR to text operation.  Includes the confience rating and converted text result.
 */
@ApiModel(description = "Response from an OCR to text operation.  Includes the confience rating and converted text result.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-09T19:23:34.572-07:00")
public class PdfToTextResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("OcrPages")
  private List<OcrPageResult> ocrPages = null;

  public PdfToTextResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public PdfToTextResponse ocrPages(List<OcrPageResult> ocrPages) {
    this.ocrPages = ocrPages;
    return this;
  }

  public PdfToTextResponse addOcrPagesItem(OcrPageResult ocrPagesItem) {
    if (this.ocrPages == null) {
      this.ocrPages = new ArrayList<OcrPageResult>();
    }
    this.ocrPages.add(ocrPagesItem);
    return this;
  }

   /**
   * Get ocrPages
   * @return ocrPages
  **/
  @ApiModelProperty(value = "")
  public List<OcrPageResult> getOcrPages() {
    return ocrPages;
  }

  public void setOcrPages(List<OcrPageResult> ocrPages) {
    this.ocrPages = ocrPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfToTextResponse pdfToTextResponse = (PdfToTextResponse) o;
    return Objects.equals(this.successful, pdfToTextResponse.successful) &&
        Objects.equals(this.ocrPages, pdfToTextResponse.ocrPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, ocrPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfToTextResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    ocrPages: ").append(toIndentedString(ocrPages)).append("\n");
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

