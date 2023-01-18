package com.example;

import controller.MovieImdbController;
import dto.MovieImdbDTO;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/movie")
public class MovieResource {

    @Inject
    MovieImdbController movieImdbController;

    @GET
    @Path("/search/{query}")
    @Produces(MediaType.APPLICATION_JSON)
    public MovieImdbDTO hello(@PathParam("query") String dsNome) {
        return movieImdbController.chamadaApi(dsNome);
    }
}