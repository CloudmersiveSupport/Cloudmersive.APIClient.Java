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
import com.cloudmersive.client.model.Face;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A person identified in an image age classification operation
 */
@ApiModel(description = "A person identified in an image age classification operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-02T20:35:21.660-07:00")
public class PersonWithAge {
  @SerializedName("FaceLocation")
  private Face faceLocation = null;

  @SerializedName("AgeClassificationConfidence")
  private Double ageClassificationConfidence = null;

  @SerializedName("AgeClass")
  private String ageClass = null;

  public PersonWithAge faceLocation(Face faceLocation) {
    this.faceLocation = faceLocation;
    return this;
  }

   /**
   * Location and other information about the person&#39;s face corresponding to this age classification
   * @return faceLocation
  **/
  @ApiModelProperty(value = "Location and other information about the person's face corresponding to this age classification")
  public Face getFaceLocation() {
    return faceLocation;
  }

  public void setFaceLocation(Face faceLocation) {
    this.faceLocation = faceLocation;
  }

  public PersonWithAge ageClassificationConfidence(Double ageClassificationConfidence) {
    this.ageClassificationConfidence = ageClassificationConfidence;
    return this;
  }

   /**
   * Confidence level of age classification; possible values are between 0.0 and 1.0; higher is better, with values &amp;gt; 0.50 being high confidence results
   * @return ageClassificationConfidence
  **/
  @ApiModelProperty(value = "Confidence level of age classification; possible values are between 0.0 and 1.0; higher is better, with values &gt; 0.50 being high confidence results")
  public Double getAgeClassificationConfidence() {
    return ageClassificationConfidence;
  }

  public void setAgeClassificationConfidence(Double ageClassificationConfidence) {
    this.ageClassificationConfidence = ageClassificationConfidence;
  }

  public PersonWithAge ageClass(String ageClass) {
    this.ageClass = ageClass;
    return this;
  }

   /**
   * The person&#39;s age range classification result in years; possible values are \&quot;0-2\&quot;, \&quot;4-6\&quot;, \&quot;8-13\&quot;, \&quot;15-20\&quot;, \&quot;25-32\&quot;, \&quot;38-43\&quot;, \&quot;48-53\&quot;, \&quot;60+\&quot;
   * @return ageClass
  **/
  @ApiModelProperty(value = "The person's age range classification result in years; possible values are \"0-2\", \"4-6\", \"8-13\", \"15-20\", \"25-32\", \"38-43\", \"48-53\", \"60+\"")
  public String getAgeClass() {
    return ageClass;
  }

  public void setAgeClass(String ageClass) {
    this.ageClass = ageClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonWithAge personWithAge = (PersonWithAge) o;
    return Objects.equals(this.faceLocation, personWithAge.faceLocation) &&
        Objects.equals(this.ageClassificationConfidence, personWithAge.ageClassificationConfidence) &&
        Objects.equals(this.ageClass, personWithAge.ageClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faceLocation, ageClassificationConfidence, ageClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonWithAge {\n");
    
    sb.append("    faceLocation: ").append(toIndentedString(faceLocation)).append("\n");
    sb.append("    ageClassificationConfidence: ").append(toIndentedString(ageClassificationConfidence)).append("\n");
    sb.append("    ageClass: ").append(toIndentedString(ageClass)).append("\n");
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

