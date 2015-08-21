package dao;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dto.Massage;
@Path("/json/metallica")
public class Testservice {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Massage getData(){
		Massage message=new Massage();
		message.setMessage("Hi How R U");
		return message;
		
	}
	
}
