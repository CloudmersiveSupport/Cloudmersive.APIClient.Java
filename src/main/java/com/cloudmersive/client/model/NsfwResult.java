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
 * Result of an NSFW classification
 */
@ApiModel(description = "Result of an NSFW classification")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-26T18:41:38.139-07:00")
public class NsfwResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Score")
  private Double score = null;

  @SerializedName("ClassificationOutcome")
  private String classificationOutcome = null;

  public NsfwResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the classification was successfully run, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the classification was successfully run, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public NsfwResult score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Score between 0.0 and 1.0.  Scores of 0.0-0.2 represent high probability safe content, while scores 0.8-1.0 represent high probability unsafe content.  Content between 0.2 and 0.8 is of increasing raciness.
   * @return score
  **/
  @ApiModelProperty(value = "Score between 0.0 and 1.0.  Scores of 0.0-0.2 represent high probability safe content, while scores 0.8-1.0 represent high probability unsafe content.  Content between 0.2 and 0.8 is of increasing raciness.")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public NsfwResult classificationOutcome(String classificationOutcome) {
    this.classificationOutcome = classificationOutcome;
    return this;
  }

   /**
   * Classification result into four categories: SafeContent_HighProbability, UnsafeContent_HighProbability, RacyContent, SafeContent_ModerateProbability
   * @return classificationOutcome
  **/
  @ApiModelProperty(value = "Classification result into four categories: SafeContent_HighProbability, UnsafeContent_HighProbability, RacyContent, SafeContent_ModerateProbability")
  public String getClassificationOutcome() {
    return classificationOutcome;
  }

  public void setClassificationOutcome(String classificationOutcome) {
    this.classificationOutcome = classificationOutcome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NsfwResult nsfwResult = (NsfwResult) o;
    return Objects.equals(this.successful, nsfwResult.successful) &&
        Objects.equals(this.score, nsfwResult.score) &&
        Objects.equals(this.classificationOutcome, nsfwResult.classificationOutcome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, score, classificationOutcome);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NsfwResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    classificationOutcome: ").append(toIndentedString(classificationOutcome)).append("\n");
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

