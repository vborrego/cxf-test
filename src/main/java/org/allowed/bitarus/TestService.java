package org.allowed.bitarus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

// http://localhost:8081/cxf-test-0.1/testSvc/aaaa
// JAX-RS service 
@Path("/testSvc")
public class TestService {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {
        String out = String.format("testSvc returns %s", msg);
        return Response.status(200).entity(out).build();
    }
}
