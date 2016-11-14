package demo;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class BookResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getResource() {
        Gson gson = new Gson();
        return gson.toJson(new Book());


    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        Book b = new Book();



        String json =b.getTitle() + " " + b.getDescription() + " " + b.author + " " + b.getYear();

        return json;

    }
}