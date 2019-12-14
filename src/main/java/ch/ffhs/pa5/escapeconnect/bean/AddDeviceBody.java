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




/**
 * Body
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyDIServerCodegen", date = "2019-10-16T16:22:47.544870800+02:00[Europe/Berlin]")
public class AddDeviceBody   {
  
    
      
  
  @JsonProperty("name")
  
  
  
  
  private String name = null;
  

  
    
      
  
  @JsonProperty("file")
  
  
  
  
  private byte[] file = null;
  

  
  
  
  public AddDeviceBody name(String name) {
    this.name = name;
    return this;
  }
  
  

  
  /**
  
   * Name für das Panel
  
  
  
  
   * @return name
   **/
 
  
  @JsonProperty("name")
  
  @ApiModelProperty(value = "Name für das Panel")

  public String getName() {
    return name;
  }
  

  public void setName(String name) {
    this.name = name;
  }
  

  
  
  public AddDeviceBody file(byte[] file) {
    this.file = file;
    return this;
  }
  
  

  
  /**
  
   * Datei des Herstellers im JSON-Format
  
  
  
  
   * @return file
   **/
 
  
  @JsonProperty("file")
  
  @ApiModelProperty(required = true, value = "Datei des Herstellers im JSON-Format")

  //@NotNull

  public byte[] getFile() {
    return file;
  }
  

  public void setFile(byte[] file) {
    this.file = file;
  }
  




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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



