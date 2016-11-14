

/**
 * Created by 151642b on 11/14/2016.
 */

package demo;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class BookResource {
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getResource() {
//        Gson gson = new Gson();
//        return gson.toJson(new Book());
//
//    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        Book p = new Book();
        String json = p.getTitle() +" "+ p.getDescription() +  " "+p.getAuthor() + " "+ p.getYear() ;
        return json;
    }
}

