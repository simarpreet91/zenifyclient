package in.zenify.zenifyclient.clients;

import in.zenify.zenifyclient.models.EntityType;
import in.zenify.zenifyclient.models.UserAssociation;

import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by trapti on 3/22/16.
 */
public class UserAssociationClient {
    private String URL = "/api/user/association";

    private final BaseZenifyClient baseZenifyClient;

    public UserAssociationClient(BaseZenifyClient baseZenifyClient) {
        this.baseZenifyClient = baseZenifyClient;
    }

    public List<UserAssociation> getListByEntity(EntityType entityType, String entityId) {
        Response response = baseZenifyClient.getList(URL + "?entityType=" + entityType + "&entityId=" + entityId);
        return (List<UserAssociation>)response.getEntity(); //TODO: catch error if cast fails
    }

    public UserAssociation post(UserAssociation userAssociation) {
        Response response = baseZenifyClient.post(URL, userAssociation);
        return response.readEntity(UserAssociation.class);
    }
}
