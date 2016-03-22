package in.zenify.zenifyclient.models;

/**
 * Created by tanay on 09/07/15.
 */
public class Bathroom {

    private String bathroomId;
    private String houseId;
    private BathroomType bathroomType;
    private BathroomCategory bathroomCategory;
    private boolean isLocked;

    public Bathroom() {}

    public Bathroom(String bathroomId, String houseId, BathroomType bathroomType, BathroomCategory bathroomCategory, boolean isLocked) {
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

    @Override
    public String toString() {
        return "Bathroom{" +
                "bathroomId='" + bathroomId + '\'' +
                ", houseId='" + houseId + '\'' +
                ", bathroomType='" + bathroomType + '\'' +
                ", bathroomCategory='" + bathroomCategory + '\'' +
                ", isLocked=" + isLocked +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        Bathroom obj2 = (Bathroom) obj;
        return this.getHouseId().equals(obj2.getHouseId()) &&
                this.getIsLocked() == obj2.getIsLocked() &&
                this.getBathroomCategory() == obj2.getBathroomCategory() &&
                this.getBathroomType() == obj2.getBathroomType() ;

    }
}
