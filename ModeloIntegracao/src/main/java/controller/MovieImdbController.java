package controller;

import dto.MovieImdbDTO;
import io.vertx.core.json.JsonObject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import restclient.IMDBApiRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class MovieImdbController {

    @ConfigProperty(name = "x-rapidapi-key")
    String xRapidapKey;

    @ConfigProperty(name = "x-rapidapi-host")
    String xRapidapiHost;

    @Inject
    @RestClient
    IMDBApiRestClient imdbApiRestClient;

    public MovieImdbDTO chamadaApi(String dsNome){

        JSONObject search = imdbApiRestClient.search(xRapidapKey, xRapidapiHost, dsNome);


        String nome = search.getString("nome_funao");

        JsonObject search.getObject("dados_pessoas")


    }
}
