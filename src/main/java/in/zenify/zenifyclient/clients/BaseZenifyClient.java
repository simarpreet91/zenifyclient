package in.zenify.zenifyclient.clients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by trapti on 3/22/16.
 */
public class BaseZenifyClient {
    private final Client client;
    private final String apiUrl;
    private static Logger logger = LoggerFactory.getLogger(BaseZenifyClient.class);

    public BaseZenifyClient(Client client, String apiUrl) {
        this.client = client;
        this.apiUrl = apiUrl;
    }

    public Response getList(String url) {
        Response response = null;
        try {
            response = client.target(apiUrl + url).request(MediaType.APPLICATION_JSON).get();
        }
        catch (Exception e) {
            logger.error(e.getMessage());
            return Response.serverError().build();
        }
        return response;
    }

    public Response get(String url, String id) {
        Response response = null;
        try {
            response = client.target(apiUrl + url + "/" + id).request(MediaType.APPLICATION_JSON).get();
        }
        catch (Exception e) {
            logger.error(e.getMessage());
            return Response.serverError().build();
        }
        return response;
    }

    public Response post(String url, Object object) {
        Response response = null;
        try {
            response = client.target(apiUrl + url).request(MediaType.APPLICATION_JSON).post(Entity.entity(object, MediaType.APPLICATION_JSON));
        }
        catch (Exception e) {
            logger.error(e.getMessage());
            return Response.serverError().build();
        }
        return response;
    }

    public Response put(String url, String id, Object object) {
        Response response = null;
        try {
            response = client.target(apiUrl + url + "/" + id).request(MediaType.APPLICATION_JSON).put(Entity.entity(object, MediaType.APPLICATION_JSON));
        }
        catch (Exception e) {
            logger.error(e.getMessage());
            return Response.serverError().build();
        }
        return response;
    }
}
