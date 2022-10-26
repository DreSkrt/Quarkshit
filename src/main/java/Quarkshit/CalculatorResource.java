package Quarkshit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Calculator")
public class CalculatorResource {
    
    @GET
    @Path("/add/{firstnumber}/{secondnumber}")
    public int add(@PathParam("firstnumber")String firstnumber, @PathParam("secondnumber") String secondnumber) {
        return Integer.parseInt(firstnumber) + Integer.parseInt(secondnumber);
    }
}
