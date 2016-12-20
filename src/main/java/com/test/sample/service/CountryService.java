package com.test.sample.service;

import com.test.sample.model.Country;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by Suhas Nair on 03/12/16.
 */
@Path("/countries")
@Produces("application/json")
public interface CountryService {

    @GET
    @Path("/all")
    public List<Country> getAllCountries();
}
