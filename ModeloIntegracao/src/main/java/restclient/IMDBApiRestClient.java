package restclient;

import dto.MovieImdbDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "restclient-imdb-api")
@Produces(MediaType.APPLICATION_JSON)
public interface IMDBApiRestClient {

    @GET
    @Path("/auto-complete")
    MovieImdbDTO search(@HeaderParam("X-RapidAPI-Key") String dsRapidKey,
                        @HeaderParam("X-RapidAPI-Host") String dsRapidHost,
                        @QueryParam("q") String dsQuery);
}
