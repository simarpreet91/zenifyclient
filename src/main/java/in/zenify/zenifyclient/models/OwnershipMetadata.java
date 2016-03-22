package in.zenify.zenifyclient.models;

/**
 * Created by tanay on 03/07/15.
 */
public class OwnershipMetadata {

    private String metadata;

    public OwnershipMetadata() {
    }

    public OwnershipMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}
