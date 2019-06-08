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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Alternate file format possibility
 */
@ApiModel(description = "Alternate file format possibility")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-08T02:01:56.203Z")
public class AlternateFileFormatCandidate {
  @SerializedName("Probability")
  private Double probability = null;

  @SerializedName("DetectedFileExtension")
  private String detectedFileExtension = null;

  @SerializedName("DetectedMimeType")
  private String detectedMimeType = null;

  public AlternateFileFormatCandidate probability(Double probability) {
    this.probability = probability;
    return this;
  }

   /**
   * Probability that this extension is the right one; possible values are between 0.0 (lowest confidence) and 1.0 (highest confidence)
   * @return probability
  **/
  @ApiModelProperty(value = "Probability that this extension is the right one; possible values are between 0.0 (lowest confidence) and 1.0 (highest confidence)")
  public Double getProbability() {
    return probability;
  }

  public void setProbability(Double probability) {
    this.probability = probability;
  }

  public AlternateFileFormatCandidate detectedFileExtension(String detectedFileExtension) {
    this.detectedFileExtension = detectedFileExtension;
    return this;
  }

   /**
   * Detected file extension of the file format, with a leading period
   * @return detectedFileExtension
  **/
  @ApiModelProperty(value = "Detected file extension of the file format, with a leading period")
  public String getDetectedFileExtension() {
    return detectedFileExtension;
  }

  public void setDetectedFileExtension(String detectedFileExtension) {
    this.detectedFileExtension = detectedFileExtension;
  }

  public AlternateFileFormatCandidate detectedMimeType(String detectedMimeType) {
    this.detectedMimeType = detectedMimeType;
    return this;
  }

   /**
   * MIME type of this file extension
   * @return detectedMimeType
  **/
  @ApiModelProperty(value = "MIME type of this file extension")
  public String getDetectedMimeType() {
    return detectedMimeType;
  }

  public void setDetectedMimeType(String detectedMimeType) {
    this.detectedMimeType = detectedMimeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternateFileFormatCandidate alternateFileFormatCandidate = (AlternateFileFormatCandidate) o;
    return Objects.equals(this.probability, alternateFileFormatCandidate.probability) &&
        Objects.equals(this.detectedFileExtension, alternateFileFormatCandidate.detectedFileExtension) &&
        Objects.equals(this.detectedMimeType, alternateFileFormatCandidate.detectedMimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(probability, detectedFileExtension, detectedMimeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternateFileFormatCandidate {\n");
    
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    detectedFileExtension: ").append(toIndentedString(detectedFileExtension)).append("\n");
    sb.append("    detectedMimeType: ").append(toIndentedString(detectedMimeType)).append("\n");
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

