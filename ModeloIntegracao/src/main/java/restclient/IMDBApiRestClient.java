package restclient;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "restclient-imdb-api")
@Produces(MediaType.APPLICATION_JSON)
@RegisterProvider(ObjectMapperProvider.class)
public interface IMDBApiRestClient {

    @GET
    @Path("/auto-complete")
    JSONObject search(@HeaderParam("X-RapidAPI-Key") String dsRapidKey,
                        @HeaderParam("X-RapidAPI-Host") String dsRapidHost,
                        @QueryParam("q") String dsQuery);
}
