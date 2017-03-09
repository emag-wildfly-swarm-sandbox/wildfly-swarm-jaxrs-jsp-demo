package wildflyswarm.jaxrs_jsp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class MyController {

  @GET
  @Produces("application/json")
  public String get() {
    return "{\"value\":\"Hello\"}";
  }

}
