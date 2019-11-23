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
 * Body2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyDIServerCodegen", date = "2019-10-16T16:22:47.544870800+02:00[Europe/Berlin]")
public class Body2   {

  @JsonProperty("passhash")
  

  
  
  private String passhash = null;
  

  
  
  
  public Body2 passhash(String passhash) {
    this.passhash = passhash;
    return this;
  }
  
  

  
  /**
  
   * SHA256 Hash des Passwortes
  
  
  
  
   * @return passhash
   **/
 
  
  @JsonProperty("passhash")
  
  @ApiModelProperty(required = true, value = "SHA256 Hash des Passwortes")

  @NotNull

  public String getPasshash() {
    return passhash;
  }
  

  public void setPasshash(String passhash) {
    this.passhash = passhash;
  }
  

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body2 body2 = (Body2) o;
    return Objects.equals(this.passhash, body2.passhash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passhash);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body2 {\n");
    
    sb.append("    passhash: ").append(toIndentedString(passhash)).append("\n");
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



