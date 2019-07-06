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
 * Style in an Excel spreadsheet
 */
@ApiModel(description = "Style in an Excel spreadsheet")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-06T12:16:34.831-07:00")
public class DocxCellStyle {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("FormatID")
  private Integer formatID = null;

  @SerializedName("BuiltInID")
  private Integer builtInID = null;

  public DocxCellStyle path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new rows
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new rows")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocxCellStyle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the style
   * @return name
  **/
  @ApiModelProperty(value = "Name of the style")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocxCellStyle formatID(Integer formatID) {
    this.formatID = formatID;
    return this;
  }

   /**
   * Format ID of the cell style
   * @return formatID
  **/
  @ApiModelProperty(value = "Format ID of the cell style")
  public Integer getFormatID() {
    return formatID;
  }

  public void setFormatID(Integer formatID) {
    this.formatID = formatID;
  }

  public DocxCellStyle builtInID(Integer builtInID) {
    this.builtInID = builtInID;
    return this;
  }

   /**
   * Built&#x3D;in ID of the cell style
   * @return builtInID
  **/
  @ApiModelProperty(value = "Built=in ID of the cell style")
  public Integer getBuiltInID() {
    return builtInID;
  }

  public void setBuiltInID(Integer builtInID) {
    this.builtInID = builtInID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxCellStyle docxCellStyle = (DocxCellStyle) o;
    return Objects.equals(this.path, docxCellStyle.path) &&
        Objects.equals(this.name, docxCellStyle.name) &&
        Objects.equals(this.formatID, docxCellStyle.formatID) &&
        Objects.equals(this.builtInID, docxCellStyle.builtInID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, name, formatID, builtInID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxCellStyle {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formatID: ").append(toIndentedString(formatID)).append("\n");
    sb.append("    builtInID: ").append(toIndentedString(builtInID)).append("\n");
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

