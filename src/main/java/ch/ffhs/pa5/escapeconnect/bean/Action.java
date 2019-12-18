/*
 * EscapeManager
 * Dies ist die Dokumentation des REST API des EscapeManager
 *
 * OpenAPI spec version: 0.0.3
 * Contact: yvo.vonkaenel@students.ffhs.ch
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.ffhs.pa5.escapeconnect.bean;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/** Auslösbare Aktion */
@ApiModel(description = "Auslösbare Aktion")
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.java.JavaJerseyDIServerCodegen",
    date = "2019-10-16T16:22:47.544870800+02:00[Europe/Berlin]")
public class Action {

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("label")
  private String label = null;

  public Action id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id der Aktion
   *
   * @return id
   */
  @JsonProperty("id")
  @ApiModelProperty(required = true, value = "id der Aktion")
  @NotNull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Action label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Label der aktion, Beschriftung des Buttons
   *
   * @return label
   */
  @JsonProperty("label")
  @ApiModelProperty(required = true, value = "Label der aktion, Beschriftung des Buttons")
  @NotNull
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
