package org.opendaylight.controller.dummyNB;


import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.codehaus.enunciate.jaxrs.ResponseCode;
import org.codehaus.enunciate.jaxrs.StatusCodes;
import org.opendaylight.controller.sal.utils.ServiceHelper;

@Path("/")
public class DummyNB {
    /**
     * Ping test
     */
    @Path("/ping/{ipAddress}")
    @PUT
    @StatusCodes({
        @ResponseCode(code = 200, condition = "Destination reachable"),
        @ResponseCode(code = 503, condition = "Internal error"),
        @ResponseCode(code = 503, condition = "Destination unreachable") })
    public Response ping(@PathParam(value = "ipAddress") String ipAddress) {
        
        return Response.ok(new String("test")).build();
    }
}