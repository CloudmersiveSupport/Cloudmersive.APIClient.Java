/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
 * License plate found in the image
 */
@ApiModel(description = "License plate found in the image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-09T14:02:25.575-07:00")
public class DetectedLicensePlate {
  @SerializedName("LocationX")
  private Integer locationX = null;

  @SerializedName("LocationY")
  private Integer locationY = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("LicensePlateText_BestMatch")
  private String licensePlateTextBestMatch = null;

  @SerializedName("LicensePlateText_RunnerUp")
  private String licensePlateTextRunnerUp = null;

  @SerializedName("LicensePlateRecognitionConfidenceLevel")
  private Double licensePlateRecognitionConfidenceLevel = null;

  public DetectedLicensePlate locationX(Integer locationX) {
    this.locationX = locationX;
    return this;
  }

   /**
   * Get locationX
   * @return locationX
  **/
  @ApiModelProperty(value = "")
  public Integer getLocationX() {
    return locationX;
  }

  public void setLocationX(Integer locationX) {
    this.locationX = locationX;
  }

  public DetectedLicensePlate locationY(Integer locationY) {
    this.locationY = locationY;
    return this;
  }

   /**
   * Get locationY
   * @return locationY
  **/
  @ApiModelProperty(value = "")
  public Integer getLocationY() {
    return locationY;
  }

  public void setLocationY(Integer locationY) {
    this.locationY = locationY;
  }

  public DetectedLicensePlate width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public DetectedLicensePlate height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public DetectedLicensePlate licensePlateTextBestMatch(String licensePlateTextBestMatch) {
    this.licensePlateTextBestMatch = licensePlateTextBestMatch;
    return this;
  }

   /**
   * Text from the license plate, highest-confidence result
   * @return licensePlateTextBestMatch
  **/
  @ApiModelProperty(value = "Text from the license plate, highest-confidence result")
  public String getLicensePlateTextBestMatch() {
    return licensePlateTextBestMatch;
  }

  public void setLicensePlateTextBestMatch(String licensePlateTextBestMatch) {
    this.licensePlateTextBestMatch = licensePlateTextBestMatch;
  }

  public DetectedLicensePlate licensePlateTextRunnerUp(String licensePlateTextRunnerUp) {
    this.licensePlateTextRunnerUp = licensePlateTextRunnerUp;
    return this;
  }

   /**
   * Alternate text from the license plate, based on second-highest-confidence result
   * @return licensePlateTextRunnerUp
  **/
  @ApiModelProperty(value = "Alternate text from the license plate, based on second-highest-confidence result")
  public String getLicensePlateTextRunnerUp() {
    return licensePlateTextRunnerUp;
  }

  public void setLicensePlateTextRunnerUp(String licensePlateTextRunnerUp) {
    this.licensePlateTextRunnerUp = licensePlateTextRunnerUp;
  }

  public DetectedLicensePlate licensePlateRecognitionConfidenceLevel(Double licensePlateRecognitionConfidenceLevel) {
    this.licensePlateRecognitionConfidenceLevel = licensePlateRecognitionConfidenceLevel;
    return this;
  }

   /**
   * Confidence score on a range of 0.0 - 1.0 of the accuracy of the detected license plate, with higher scores being better; values about 0.75 are high confidence
   * @return licensePlateRecognitionConfidenceLevel
  **/
  @ApiModelProperty(value = "Confidence score on a range of 0.0 - 1.0 of the accuracy of the detected license plate, with higher scores being better; values about 0.75 are high confidence")
  public Double getLicensePlateRecognitionConfidenceLevel() {
    return licensePlateRecognitionConfidenceLevel;
  }

  public void setLicensePlateRecognitionConfidenceLevel(Double licensePlateRecognitionConfidenceLevel) {
    this.licensePlateRecognitionConfidenceLevel = licensePlateRecognitionConfidenceLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedLicensePlate detectedLicensePlate = (DetectedLicensePlate) o;
    return Objects.equals(this.locationX, detectedLicensePlate.locationX) &&
        Objects.equals(this.locationY, detectedLicensePlate.locationY) &&
        Objects.equals(this.width, detectedLicensePlate.width) &&
        Objects.equals(this.height, detectedLicensePlate.height) &&
        Objects.equals(this.licensePlateTextBestMatch, detectedLicensePlate.licensePlateTextBestMatch) &&
        Objects.equals(this.licensePlateTextRunnerUp, detectedLicensePlate.licensePlateTextRunnerUp) &&
        Objects.equals(this.licensePlateRecognitionConfidenceLevel, detectedLicensePlate.licensePlateRecognitionConfidenceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationX, locationY, width, height, licensePlateTextBestMatch, licensePlateTextRunnerUp, licensePlateRecognitionConfidenceLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedLicensePlate {\n");
    
    sb.append("    locationX: ").append(toIndentedString(locationX)).append("\n");
    sb.append("    locationY: ").append(toIndentedString(locationY)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    licensePlateTextBestMatch: ").append(toIndentedString(licensePlateTextBestMatch)).append("\n");
    sb.append("    licensePlateTextRunnerUp: ").append(toIndentedString(licensePlateTextRunnerUp)).append("\n");
    sb.append("    licensePlateRecognitionConfidenceLevel: ").append(toIndentedString(licensePlateRecognitionConfidenceLevel)).append("\n");
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

