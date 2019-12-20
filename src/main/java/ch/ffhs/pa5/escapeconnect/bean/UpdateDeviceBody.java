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

/** Body1 */
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.java.JavaJerseyDIServerCodegen",
    date = "2019-10-16T16:22:47.544870800+02:00[Europe/Berlin]")
public class UpdateDeviceBody {

  @JsonProperty("firmware")
  private byte[] firmware = null;

  public UpdateDeviceBody firmware(byte[] firmware) {
    this.firmware = firmware;
    return this;
  }

  /**
   * Datei des Herstellers im .bin-Format
   *
   * @return firmware
   */
  @JsonProperty("firmware")
  @ApiModelProperty(required = true, value = "Datei des Herstellers im .bin-Format")
  @NotNull
  public byte[] getFirmware() {
    return firmware;
  }

  public void setFirmware(byte[] firmware) {
    this.firmware = firmware;
  }

  @Override
  public int hashCode() {
    return Objects.hash(firmware);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");

    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("}");
    return sb.toString();
  }


  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
