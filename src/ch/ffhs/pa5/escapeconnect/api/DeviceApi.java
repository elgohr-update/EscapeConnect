package ch.ffhs.pa5.escapeconnect.api;

import ch.ffhs.pa5.escapeconnect.bean.*;
import ch.ffhs.pa5.escapeconnect.api.DeviceApiService;

import io.swagger.annotations.ApiParam;

import ch.ffhs.pa5.escapeconnect.bean.Body;
import ch.ffhs.pa5.escapeconnect.bean.Body1;
import ch.ffhs.pa5.escapeconnect.bean.InlineResponse200;


import java.util.Map;
import java.util.List;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/device")


@io.swagger.annotations.Api(description = "the device API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyDIServerCodegen", date = "2019-10-16T16:22:47.544870800+02:00[Europe/Berlin]")

public class DeviceApi  {

   private DeviceApiService delegate;

   protected DeviceApi() {
   }

   @javax.inject.Inject
   public DeviceApi(DeviceApiService delegate) {
      this.delegate = delegate;
   }


    @POST
    @Path("/add")
    @Consumes({ "multipart/form-data" })
    
    @io.swagger.annotations.ApiOperation(value = "Hinzufügen eines neuen Gerätes mittels der JSON-Datei des Herstellers", notes = "", response = Void.class, tags={ "device", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Erfolgreich importiert", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Token nicht mitgeliefert oder ungültig", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 415, message = "Datei hat unerlaubtes Format", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 418, message = "Datei konnte nicht gEEparsed werden", response = Void.class) })
    public Response addDevice(@ApiParam(value = "" ,required=true) Body body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addDevice(body,securityContext);
    }

    @POST
    @Path("/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Entfernen eines Gerätes", notes = "", response = Void.class, tags={ "device", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Erfolgreich gelöscht", response = Void.class) })
    public Response deleteDevice(@ApiParam(value = "Id des devices welches upgedatet werden soll",required=true) @QueryParam("deviceid") Integer deviceid
,@ApiParam(value = "Muss gesetzt werden, zusätzliche Sicherheit") @QueryParam("forces") Boolean forces
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteDevice(deviceid,forces,securityContext);
    }

    @POST
    @Path("/upgrade")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "Firmwareupgrade eines Gerätes mittels der .bin Datei des Herstellers", notes = "", response = InlineResponse200.class, responseContainer = "List", tags={ "device", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Erfolgreich update angestossen", response = InlineResponse200.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Token nicht mitgeliefert oder ungültig", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Firmwarenamen alt/neu stimmen nicht überein, forced?", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "DeviceId nicht verfügbar", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 415, message = "Datei hat unerlaubtes Format", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 418, message = "Datei konnte nicht geparsed werden", response = Void.class) })
    public Response upgradeFirmware(@ApiParam(value = "" ,required=true) Body1 body
,@ApiParam(value = "Id des devices welches upgedatet werden soll",required=true) @QueryParam("deviceid") Integer deviceid
,@ApiParam(value = "Muss gesetzt werden, falls Firmware-name alt und neu nicht übereinstimmen") @QueryParam("forces") Boolean forces
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.upgradeFirmware(body,deviceid,forces,securityContext);
    }

}
