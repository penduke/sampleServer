package com.test.sample.service;

import com.test.sample.model.EmployeeListVO;
import com.test.sample.model.EmployeeVO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Suhas Nair on 01/12/16.
 */
@Path("/employees")
@Produces("application/json")
public interface EmployeeService {

    @GET
    @Path("/all")
    public EmployeeListVO getAllEmployees();

    @GET
    @Path("/one")
    public EmployeeVO getEmployee();

    /*@GET
    @Path("/{id}")
    public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id);*/

}


