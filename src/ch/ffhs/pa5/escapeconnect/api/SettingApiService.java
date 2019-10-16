package ch.ffhs.pa5.escapeconnect.api;

import ch.ffhs.pa5.escapeconnect.api.*;
import ch.ffhs.pa5.escapeconnect.bean.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import ch.ffhs.pa5.escapeconnect.bean.Setting;
import ch.ffhs.pa5.escapeconnect.bean.SettingMod;


import java.util.Map;
import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyDIServerCodegen", date = "2019-10-16T16:22:47.544870800+02:00[Europe/Berlin]")

public interface SettingApiService {
    
    public Response getSettingsByDeviceId( Integer deviceId,SecurityContext securityContext);
    
    public Response setSetting(List<SettingMod> body, Integer deviceId,SecurityContext securityContext);
    
}

