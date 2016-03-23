package in.zenify.zenifyclient.models;

/**
 * Created by tanay on 09/07/15.
 */
public class BathroomForOwnerCheckout {

    private String bathroomId;
    private String houseId;
    private BathroomType bathroomType;
    private BathroomCategory bathroomCategory;
    private boolean isLocked;

    public BathroomForOwnerCheckout() {}

    public BathroomForOwnerCheckout(String bathroomId, String houseId, BathroomType bathroomType, BathroomCategory bathroomCategory, boolean isLocked) {
        this.bathroomId = bathroomId;
        this.houseId = houseId;
        this.bathroomType = bathroomType;
        this.bathroomCategory = bathroomCategory;
        this.isLocked = isLocked;
    }

    public String getBathroomId() {
        return bathroomId;
    }

    public void setBathroomId(String bathroomId) {
        this.bathroomId = bathroomId;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public BathroomType getBathroomType() {
        return bathroomType;
    }

    public void setBathroomType(BathroomType bathroomType) {
        this.bathroomType = bathroomType;
    }

    public BathroomCategory getBathroomCategory() {
        return bathroomCategory;
    }

    public void setBathroomCategory(BathroomCategory bathroomCategory) {
        this.bathroomCategory = bathroomCategory;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }
}
