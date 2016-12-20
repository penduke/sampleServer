package com.test.sample.service;

import com.test.sample.model.ExampleModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/example")
@Produces("application/json")
public interface ExampleService {

    @GET
    @Path("/{id}")
    public ExampleModel get(@PathParam("id") String id);

}