package com.airyisea.rs.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.airyisea.rs.domain.User;

@Produces("*/*")
public interface UserService {
	@PUT
	@Path("/user")
	@Consumes({"application/xml","application/json"})
	void save(User user);
	
	@GET
	@Path("/user/{id}")
	@Consumes({"application/xml","application/json"})
	@Produces({"application/xml","application/json"})
	User findById(@PathParam("id")Integer id);
	
	@GET
	@Path("/user")
	@Produces({"application/xml","application/json"})
	List<User> find();
	
	@GET
	@Path("/user/{id}/{name}")
	@Consumes({"application/xml","application/json"})
	@Produces({"application/xml","application/json"})
	User findByIdAndName(@PathParam("id")Integer id, @PathParam("name")String name);
	
	@DELETE
	@Path("/user/{id}")
	@Consumes({"application/xml","application/json"})
	@Produces({"application/xml","application/json"})
	void deleteById(@PathParam("id")Integer id);
	
	@POST
	@Path("/user")
	@Consumes({"application/xml","application/json"})
	@Produces({"application/xml","application/json"})
	User update(User user);
}
