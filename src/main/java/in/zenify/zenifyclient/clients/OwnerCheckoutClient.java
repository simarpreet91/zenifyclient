package in.zenify.zenifyclient.clients;

import in.zenify.zenifyclient.models.OwnerCheckout;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.*;

/**
 * Created by trapti on 3/22/16.
 */
public class OwnerCheckoutClient {
    private String URL = "/api/owner/checkout";

    private final BaseZenifyClient baseZenifyClient;

    public OwnerCheckoutClient(BaseZenifyClient baseZenifyClient) {
        this.baseZenifyClient = baseZenifyClient;
    }

    public OwnerCheckout get(String checkoutId) {
        Response response = baseZenifyClient.get(URL, checkoutId);
        return (OwnerCheckout)response.getEntity();
    }

    public OwnerCheckout post(OwnerCheckout ownerCheckout) {
        Response response = baseZenifyClient.post(URL, ownerCheckout);
        return response.readEntity(OwnerCheckout.class);
    }

    public OwnerCheckout put(String checkoutId, OwnerCheckout ownerCheckout) {
        Response response = baseZenifyClient.put(URL, checkoutId, ownerCheckout);
        return response.readEntity(OwnerCheckout.class);
    }
}
