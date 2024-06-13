/*
 * Unity Catalog API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.unitycatalog.server.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A function that is dependent on a SQL object.
 */
@JsonPropertyOrder({
  FunctionDependency.JSON_PROPERTY_FUNCTION_FULL_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class FunctionDependency {
  public static final String JSON_PROPERTY_FUNCTION_FULL_NAME = "function_full_name";
  private String functionFullName;

  public FunctionDependency() {
  }

  public FunctionDependency functionFullName(String functionFullName) {
    
    this.functionFullName = functionFullName;
    return this;
  }

   /**
   * Full name of the dependent function, in the form of __catalog_name__.__schema_name__.__function_name__.
   * @return functionFullName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FUNCTION_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFunctionFullName() {
    return functionFullName;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFunctionFullName(String functionFullName) {
    this.functionFullName = functionFullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunctionDependency functionDependency = (FunctionDependency) o;
    return Objects.equals(this.functionFullName, functionDependency.functionFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionFullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionDependency {\n");
    sb.append("    functionFullName: ").append(toIndentedString(functionFullName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
