package jboss.developer;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Local
@Path("/myrest")
public interface ICommon {

  @GET
  @Path("/greeting")
  @javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
  public String getGreetings();

}
