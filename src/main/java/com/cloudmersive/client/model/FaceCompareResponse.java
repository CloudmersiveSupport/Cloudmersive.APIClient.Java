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
import com.cloudmersive.client.model.FaceMatch;
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
 * Results of comparing/matching faces in an image
 */
@ApiModel(description = "Results of comparing/matching faces in an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-06T12:16:31.154-07:00")
public class FaceCompareResponse {
  @SerializedName("ErrorDetails")
  private String errorDetails = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Faces")
  private List<FaceMatch> faces = null;

  @SerializedName("FaceCount")
  private Integer faceCount = null;

  public FaceCompareResponse errorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public String getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }

  public FaceCompareResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public FaceCompareResponse faces(List<FaceMatch> faces) {
    this.faces = faces;
    return this;
  }

  public FaceCompareResponse addFacesItem(FaceMatch facesItem) {
    if (this.faces == null) {
      this.faces = new ArrayList<FaceMatch>();
    }
    this.faces.add(facesItem);
    return this;
  }

   /**
   * Array of faces found in the input image
   * @return faces
  **/
  @ApiModelProperty(value = "Array of faces found in the input image")
  public List<FaceMatch> getFaces() {
    return faces;
  }

  public void setFaces(List<FaceMatch> faces) {
    this.faces = faces;
  }

  public FaceCompareResponse faceCount(Integer faceCount) {
    this.faceCount = faceCount;
    return this;
  }

   /**
   * Number of faces found in the image
   * @return faceCount
  **/
  @ApiModelProperty(value = "Number of faces found in the image")
  public Integer getFaceCount() {
    return faceCount;
  }

  public void setFaceCount(Integer faceCount) {
    this.faceCount = faceCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceCompareResponse faceCompareResponse = (FaceCompareResponse) o;
    return Objects.equals(this.errorDetails, faceCompareResponse.errorDetails) &&
        Objects.equals(this.successful, faceCompareResponse.successful) &&
        Objects.equals(this.faces, faceCompareResponse.faces) &&
        Objects.equals(this.faceCount, faceCompareResponse.faceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, successful, faces, faceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceCompareResponse {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
    sb.append("    faceCount: ").append(toIndentedString(faceCount)).append("\n");
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

