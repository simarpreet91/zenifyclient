package in.zenify.zenifyclient.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.jackson.JsonSnakeCase;

import javax.validation.constraints.NotNull;
import javax.ws.rs.core.MultivaluedMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mohit on 19/03/15.
 */
@JsonSnakeCase
public class HouseDetails {

    @NotNull
    private String houseId; //ok

    private String flatNumber; //done
    private Integer area; //done
    private String housingComplexId; //check if only published ones are queried, add option to add new
    private String housingComplexName; //verify y dis is dere?

    private String title; //dynamic

    private Integer numberOfBedrooms; //done
    private Integer numberOfAttachedBathrooms; //done
    private Integer numberOfCommonBathrooms; //done
    private Boolean hasServantBathroom; //Needed ??
    private Boolean hasServantRoom; //done
    private Boolean hasStudyRoom; //done
    private Integer numberOfBalconies; //done
    private Boolean hasUtilityRoom; //done
    private Boolean hasStoreRoom; //done
    private Boolean hasTerrace; //Needed ??

    private HouseType houseType; //done
    private MainDoorDirection mainDoorFacingDirection; //done

    private Integer numberOfCoveredCarParks; //done
    private Integer numberOfOpenCarParks; //done

    private FurnishingCategory furnishingCategory; //done
    private Furnishings furnishings; //done
    private String flooringTypes; //done

    private FlatPowerBackupType flatPowerBackupType; //done
    private FlatPowerBackupCoverage flatPowerBackupCoverage; //done

    private Boolean isBachelorAllowed; //done
    private Boolean isBacheloretteAllowed; //done
    private Boolean isForeignerAllowed; //done
    private Boolean isNonvegAllowed; //done
    private Boolean isPetAllowed; //done

    private String metadata; //dynamic
    private String publishingStatus; //dynamic

    private String publisherId; //****************
    private ListingStatus listingStatus; //later

    private String contentScratchpad;
    private String approverNotes;

    private Date firstUpdated; //dynamic
    private Date lastUpdated; //dynamic

    private Boolean isPartiallyLocked; //done
    private Boolean isCorporateLeaseAllowed; //later
    private String ownershipType;
    private String gasConnectionType;
    private Integer rentalBedrooms;
    private Integer propertyOnFloor; //done
    private Integer floorsInProperty;

    private String otherFurnishings;

    public HouseDetails() {
        this.furnishings = new Furnishings();
    }

    public HouseDetails(HouseDetails other) {
        this.houseId = other.houseId;
        this.flatNumber = other.flatNumber;
        this.area = other.area;
        this.housingComplexId = other.housingComplexId;
        this.housingComplexName = other.housingComplexName;
        this.title = other.title;
        this.numberOfBedrooms = other.numberOfBedrooms;
        this.numberOfAttachedBathrooms = other.numberOfAttachedBathrooms;
        this.numberOfCommonBathrooms = other.numberOfCommonBathrooms;
        this.hasServantBathroom = other.hasServantBathroom;
        this.hasServantRoom = other.hasServantRoom;
        this.hasStudyRoom = other.hasStudyRoom;
        this.mainDoorFacingDirection = other.mainDoorFacingDirection;
        this.numberOfBalconies = other.numberOfBalconies;
        this.hasUtilityRoom = other.hasUtilityRoom;
        this.hasStoreRoom = other.hasStoreRoom;
        this.hasTerrace = other.hasTerrace;
        this.houseType = other.houseType;
        this.numberOfCoveredCarParks = other.numberOfCoveredCarParks;
        this.numberOfOpenCarParks = other.numberOfOpenCarParks;
        this.furnishingCategory = other.furnishingCategory;
        this.flooringTypes = other.flooringTypes;
        this.flatPowerBackupType = other.flatPowerBackupType;
        this.flatPowerBackupCoverage = other.flatPowerBackupCoverage;
        this.isBachelorAllowed = other.isBachelorAllowed;
        this.isBacheloretteAllowed = other.isBacheloretteAllowed;
        this.isForeignerAllowed = other.isForeignerAllowed;
        this.isNonvegAllowed = other.isNonvegAllowed;
        this.isPetAllowed = other.isPetAllowed;
        this.metadata = other.metadata;
        this.publishingStatus = other.publishingStatus;
        this.publisherId = other.publisherId;
        this.listingStatus = other.listingStatus;
        this.contentScratchpad = other.contentScratchpad;
        this.approverNotes = other.approverNotes;
        this.firstUpdated = other.firstUpdated;
        this.lastUpdated = other.lastUpdated;
        this.isPartiallyLocked = other.isPartiallyLocked;
        this.gasConnectionType = other.gasConnectionType;
        this.rentalBedrooms = other.rentalBedrooms;
    }

    public static HouseDetails getInstanceFromDB(String houseId, String flatNumber, int area, String housingComplexId, String title, int numberOfBedrooms, int numberOfAttachedBathrooms, int numberOfCommonBathrooms, boolean hasServantBathroom, boolean hasServantRoom, boolean hasStudyRoom, int numberOfBalconies, boolean hasUtilityRoom, boolean hasStoreRoom, boolean hasTerrace, HouseType houseType, MainDoorDirection mainDoorFacingDirection, int numberOfCoveredCarParks, int numberOfOpenCarParks, FurnishingCategory furnishingCategory, Furnishings furnishings, String flooringTypes, FlatPowerBackupType flatPowerBackupType, FlatPowerBackupCoverage flatPowerBackupCoverage, boolean isBachelorAllowed, boolean isBacheloretteAllowed, boolean isForeignerAllowed, boolean isNonvegAllowed, boolean isPetAllowed, String metadata, String publishingStatus, String publisherId, ListingStatus listingStatus, String approverNotes, Date firstUpdated, Date lastUpdated, boolean isPartiallyLocked, boolean isCorporateLeaseAllowed, String ownershipType, String gasConnectionType, int rentalBedrooms) {
        HouseDetails hd = new HouseDetails();
        hd.houseId = houseId;
        hd.flatNumber = flatNumber;
        hd.area = area;
        hd.housingComplexId = housingComplexId;
        hd.title = title;
        hd.numberOfBedrooms = numberOfBedrooms;
        hd.numberOfAttachedBathrooms = numberOfAttachedBathrooms;
        hd.numberOfCommonBathrooms = numberOfCommonBathrooms;
        hd.hasServantBathroom = hasServantBathroom;
        hd.hasServantRoom = hasServantRoom;
        hd.hasStudyRoom = hasStudyRoom;
        hd.numberOfBalconies = numberOfBalconies;
        hd.hasUtilityRoom = hasUtilityRoom;
        hd.hasStoreRoom = hasStoreRoom;
        hd.hasTerrace = hasTerrace;
        hd.houseType = houseType;
        hd.mainDoorFacingDirection = mainDoorFacingDirection;
        hd.numberOfCoveredCarParks = numberOfCoveredCarParks;
        hd.numberOfOpenCarParks = numberOfOpenCarParks;
        hd.furnishingCategory = furnishingCategory;
        hd.furnishings = furnishings;
        hd.flooringTypes = flooringTypes;
        hd.flatPowerBackupType = flatPowerBackupType;
        hd.flatPowerBackupCoverage = flatPowerBackupCoverage;
        hd.isBachelorAllowed = isBachelorAllowed;
        hd.isBacheloretteAllowed = isBacheloretteAllowed;
        hd.isForeignerAllowed = isForeignerAllowed;
        hd.isNonvegAllowed = isNonvegAllowed;
        hd.isPetAllowed = isPetAllowed;
        hd.metadata = metadata;
        hd.publishingStatus = publishingStatus;
        hd.publisherId = publisherId;
        hd.listingStatus = listingStatus;
        hd.approverNotes = approverNotes;
        hd.firstUpdated = firstUpdated;
        hd.lastUpdated = lastUpdated;
        hd.isPartiallyLocked = isPartiallyLocked;
        hd.isCorporateLeaseAllowed = isCorporateLeaseAllowed;
        hd.ownershipType = ownershipType;
        hd.gasConnectionType = gasConnectionType;
        hd.rentalBedrooms = rentalBedrooms;

        return hd;
    }

    @JsonProperty
    public String getHouseId() {
        return houseId;
    }

    @JsonProperty
    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    @JsonProperty
    public String getFlatNumber() {
        return flatNumber;
    }

    @JsonProperty
    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    @JsonProperty
    public Integer getArea() {
        return area;
    }

    @JsonProperty
    public void setArea(Integer area) {
        this.area = area;
    }

    @JsonProperty
    public String getHousingComplexId() {
        return housingComplexId;
    }

    @JsonProperty
    public void setHousingComplexId(String housingComplexId) {
        this.housingComplexId = housingComplexId;
    }

    @JsonProperty
    public Integer getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    @JsonProperty
    public void setNumberOfBedrooms(Integer numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public String getOtherFurnishings() {
        return otherFurnishings;
    }

    public void setOtherFurnishings(String otherFurnishings) {
        this.otherFurnishings = otherFurnishings;
    }

    public void setPartiallyLocked(Boolean isPartiallyLocked) {
        this.isPartiallyLocked = isPartiallyLocked;
    }

    @JsonProperty
    public Boolean getHasServantBathroom() {
        return hasServantBathroom;
    }

    @JsonProperty
    public void setHasServantBathroom(Boolean hasServantBathroom) {
        this.hasServantBathroom = hasServantBathroom;
    }

    @JsonProperty
    public Boolean getHasServantRoom() {
        return hasServantRoom;
    }

    @JsonProperty
    public void setHasServantRoom(Boolean hasServantRoom) {
        this.hasServantRoom = hasServantRoom;
    }

    @JsonProperty
    public MainDoorDirection getMainDoorFacingDirection() {
        return mainDoorFacingDirection;
    }

    @JsonProperty
    public void setMainDoorFacingDirection(MainDoorDirection mainDoorFacingDirection) {
        this.mainDoorFacingDirection = mainDoorFacingDirection;
    }

    @JsonProperty
    public Integer getNumberOfBalconies() {
        return numberOfBalconies;
    }

    @JsonProperty
    public void setNumberOfBalconies(Integer numberOfBalconies) {
        this.numberOfBalconies = numberOfBalconies;
    }

    @JsonProperty
    public Boolean getHasUtilityRoom() {
        return hasUtilityRoom;
    }

    @JsonProperty
    public void setHasUtilityRoom(Boolean hasUtilityRoom) {
        this.hasUtilityRoom = hasUtilityRoom;
    }

    @JsonProperty
    public Boolean getHasTerrace() {
        return hasTerrace;
    }

    @JsonProperty
    public void setHasTerrace(Boolean hasTerrace) {
        this.hasTerrace = hasTerrace;
    }

    @JsonProperty
    public Integer getNumberOfCoveredCarParks() {
        return numberOfCoveredCarParks;
    }

    @JsonProperty
    public void setNumberOfCoveredCarParks(Integer numberOfCoveredCarParks) {
        this.numberOfCoveredCarParks = numberOfCoveredCarParks;
    }

    @JsonProperty
    public Integer getNumberOfOpenCarParks() {
        return numberOfOpenCarParks;
    }

    @JsonProperty
    public void setNumberOfOpenCarParks(Integer numberOfOpenCarParks) {
        this.numberOfOpenCarParks = numberOfOpenCarParks;
    }

    @JsonProperty
    public FlatPowerBackupType getFlatPowerBackupType() {
        return flatPowerBackupType;
    }

    @JsonProperty
    public void setFlatPowerBackupType(FlatPowerBackupType flatPowerBackupType) {
        this.flatPowerBackupType = flatPowerBackupType;
    }

    @JsonProperty
    public Boolean getIsForeignerAllowed() {
        return isForeignerAllowed;
    }

    @JsonProperty
    public void setIsForeignerAllowed(Boolean isForeignerAllowed) {
        this.isForeignerAllowed = isForeignerAllowed;
    }

    @JsonProperty
    public Boolean getIsNonvegAllowed() {
        return isNonvegAllowed;
    }

    @JsonProperty
    public void setIsNonvegAllowed(Boolean isNonvegAllowed) {
        this.isNonvegAllowed = isNonvegAllowed;
    }

    @JsonProperty
    public Boolean getIsPetAllowed() {
        return isPetAllowed;
    }

    @JsonProperty
    public void setIsPetAllowed(Boolean isPetAllowed) {
        this.isPetAllowed = isPetAllowed;
    }

    @JsonProperty
    public String getMetadata() {
        return metadata;
    }

    @JsonProperty
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @JsonProperty
    public String getPublishingStatus() {
        return publishingStatus;
    }

    @JsonProperty
    public void setPublishingStatus(String publishingStatus) {
        this.publishingStatus = publishingStatus;
    }

    @JsonProperty
    public String getPublisherId() {
        return publisherId;
    }

    @JsonProperty
    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    @JsonProperty
    public String getContentScratchpad() {
        return contentScratchpad;
    }

    @JsonProperty
    public void setContentScratchpad(String contentScratchpad) {
        this.contentScratchpad = contentScratchpad;
    }

    @JsonProperty
    public String getApproverNotes() {
        return approverNotes;
    }

    @JsonProperty
    public void setApproverNotes(String approverNotes) {
        this.approverNotes = approverNotes;
    }

    @JsonProperty
    public Date getFirstUpdated() {
        return firstUpdated;
    }

    @JsonProperty
    public void setFirstUpdated(Date firstUpdated) {
        this.firstUpdated = firstUpdated;
    }

    @JsonProperty
    public Date getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty
    public HouseType getHouseType() {
        return houseType;
    }

    @JsonProperty
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    @JsonProperty
    public FurnishingCategory getFurnishingCategory() {
        return furnishingCategory;
    }

    @JsonProperty
    public void setFurnishingCategory(FurnishingCategory furnishingCategory) {
        this.furnishingCategory = furnishingCategory;
    }

    @JsonProperty
    public String getTitle() {
        return title;
    }

    @JsonProperty
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty
    public ListingStatus getListingStatus() {
        return listingStatus;
    }

    @JsonProperty
    public void setListingStatus(ListingStatus listingStatus) {
        this.listingStatus = listingStatus;
    }

    public String getHousingComplexName() {
        return housingComplexName;
    }

    public void setHousingComplexName(String housingComplexName) {
        this.housingComplexName = housingComplexName;
    }

    public Integer getNumberOfAttachedBathrooms() {
        return numberOfAttachedBathrooms;
    }

    public void setNumberOfAttachedBathrooms(Integer numberOfAttachedBathrooms) {
        this.numberOfAttachedBathrooms = numberOfAttachedBathrooms;
    }

    public Integer getNumberOfCommonBathrooms() {
        return numberOfCommonBathrooms;
    }

    public void setNumberOfCommonBathrooms(Integer numberOfCommonBathrooms) {
        this.numberOfCommonBathrooms = numberOfCommonBathrooms;
    }

    public Boolean isHasServantBathroom() {
        return hasServantBathroom;
    }

    public Boolean isHasServantRoom() {
        return hasServantRoom;
    }

    public Boolean isHasStudy() {
        return hasStudyRoom;
    }

    public Boolean getHasStudyRoom() {
        return hasStudyRoom;
    }

    public void setHasStudyRoom(Boolean hasStudyRoom) {
        this.hasStudyRoom = hasStudyRoom;
    }

    public void setHasStudy(Boolean hasStudyRoom) {
        this.hasStudyRoom = hasStudyRoom;
    }

    public Boolean isHasUtilityRoom() {
        return hasUtilityRoom;
    }

    public Boolean isHasStoreRoom() {
        return hasStoreRoom;
    }

    public Boolean getHasStoreRoom() {
        return hasStoreRoom;
    }


    public void setHasStoreRoom(Boolean hasStoreRoom) {
        this.hasStoreRoom = hasStoreRoom;
    }

    public Boolean isHasTerrace() {
        return hasTerrace;
    }

    public FlatPowerBackupCoverage getFlatPowerBackupCoverage() {
        return flatPowerBackupCoverage;
    }

    public void setFlatPowerBackupCoverage(FlatPowerBackupCoverage flatPowerBackupCoverage) {
        this.flatPowerBackupCoverage = flatPowerBackupCoverage;
    }

    public Boolean getIsBachelorAllowed() {
        return isBachelorAllowed;
    }

    public void setBachelorAllowed(Boolean isBachelorAllowed) {
        this.isBachelorAllowed = isBachelorAllowed;
    }

    public Boolean getIsBacheloretteAllowed() {
        return isBacheloretteAllowed;
    }

    public void setBacheloretteAllowed(Boolean isBacheloretteAllowed) {
        this.isBacheloretteAllowed = isBacheloretteAllowed;
    }

    public void setForeignerAllowed(Boolean isForeignerAllowed) {
        this.isForeignerAllowed = isForeignerAllowed;
    }

    public void setNonvegAllowed(Boolean isNonvegAllowed) {
        this.isNonvegAllowed = isNonvegAllowed;
    }

    public void setPetAllowed(Boolean isPetAllowed) {
        this.isPetAllowed = isPetAllowed;
    }

    public String getFlooringTypes() {
        return flooringTypes;
    }

    public void setFlooringTypes(String flooringTypes) {
        this.flooringTypes = flooringTypes;
    }

    public Furnishings getFurnishings() {
        return furnishings;
    }

    public void setFurnishings(Furnishings furnishings) {
        this.furnishings = furnishings;
    }

    public Boolean getIsPartiallyLocked() {
        return isPartiallyLocked;
    }

    public void setIsPartiallyLocked(Boolean isPartiallyLocked) {
        this.isPartiallyLocked = isPartiallyLocked;
    }

    public Boolean getIsCorporateLeaseAllowed() {
        return isCorporateLeaseAllowed;
    }

    public void setCorporateLeaseAllowed(Boolean isCorporateLeaseAllowed) {
        this.isCorporateLeaseAllowed = isCorporateLeaseAllowed;
    }

    public Integer getPropertyOnFloor() {
        return propertyOnFloor;
    }

    public void setPropertyOnFloor(Integer propertyOnFloor) {
        this.propertyOnFloor = propertyOnFloor;
    }

    public Integer getFloorsInProperty() {
        return floorsInProperty;
    }

    public void setFloorsInProperty(Integer floorsInProperty) {
        this.floorsInProperty = floorsInProperty;
    }

    public String getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(String ownershipType) {
        this.ownershipType = ownershipType;
    }

    public List<Restriction> getRestrictionsList() {
        List<Restriction> restrictions = new ArrayList<Restriction>();

        if (isForeignerAllowed != null && !isForeignerAllowed)
            restrictions.add(new Restriction(false, "Foreigners not allowed"));

        if (isNonvegAllowed != null && !isNonvegAllowed)
            restrictions.add(new Restriction(false, "Non vegetarians not allowed"));

        if (isPetAllowed != null && !isPetAllowed)
            restrictions.add(new Restriction(false, "Pets not allowed"));

        if (isBachelorAllowed != null && !isBachelorAllowed) {
            restrictions.add(new Restriction(false, "Bachelors not allowed"));
        }

        if (isBacheloretteAllowed != null && !isBacheloretteAllowed) {
            restrictions.add(new Restriction(false, "Bachelorettes not allowed"));
        }

        if (getMainDoorFacingDirection() != null && getMainDoorFacingDirection().equals(MainDoorDirection.EAST))
            restrictions.add(new Restriction(true, "Vaastu compliant"));

        return restrictions;
    }

    @JsonIgnore
    public boolean isVaastuCompliant(){
        return (getMainDoorFacingDirection() != null && getMainDoorFacingDirection().equals(MainDoorDirection.EAST));
    }

    @Override
    public String toString() {
        return "HouseDetails{" +
                "houseId='" + houseId + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", area=" + area +
                ", housingComplexId='" + housingComplexId + '\'' +
                ", housingComplexName='" + housingComplexName + '\'' +
                ", title='" + title + '\'' +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfAttachedBathrooms=" + numberOfAttachedBathrooms +
                ", numberOfCommonBathrooms=" + numberOfCommonBathrooms +
                ", hasServantBathroom=" + hasServantBathroom +
                ", hasServantRoom=" + hasServantRoom +
                ", hasStudyRoom=" + hasStudyRoom +
                ", mainDoorFacingDirection='" + mainDoorFacingDirection + '\'' +
                ", numberOfBalconies=" + numberOfBalconies +
                ", hasUtilityRoom=" + hasUtilityRoom +
                ", hasStoreRoom=" + hasStoreRoom +
                ", hasTerrace=" + hasTerrace +
                ", houseType=" + houseType +
                ", numberOfCoveredCarParks=" + numberOfCoveredCarParks +
                ", numberOfOpenCarParks=" + numberOfOpenCarParks +
                ", furnishingCategory=" + furnishingCategory +
                ", furnishings=" + furnishings +
                ", flooringTypes='" + flooringTypes + '\'' +
                ", flatPowerBackupType='" + flatPowerBackupType + '\'' +
                ", flatPowerBackupCoverage='" + flatPowerBackupCoverage + '\'' +
                ", isBachelorAllowed=" + isBachelorAllowed +
                ", isBacheloretteAllowed=" + isBacheloretteAllowed +
                ", isForeignerAllowed=" + isForeignerAllowed +
                ", isNonvegAllowed=" + isNonvegAllowed +
                ", isPetAllowed=" + isPetAllowed +
                ", metadata='" + metadata + '\'' +
                ", publishingStatus='" + publishingStatus + '\'' +
                ", publisherId='" + publisherId + '\'' +
                ", listingStatus=" + listingStatus +
                ", contentScratchpad='" + contentScratchpad + '\'' +
                ", approverNotes='" + approverNotes + '\'' +
                ", firstUpdated=" + firstUpdated +
                ", lastUpdated=" + lastUpdated +
                ", isPartiallyLocked=" + isPartiallyLocked +
                '}';
    }

    @JsonIgnore
    public Integer getTotalNumberOfBathrooms() {
        return (numberOfAttachedBathrooms!=null?numberOfAttachedBathrooms:0) + (numberOfCommonBathrooms!=null?numberOfCommonBathrooms:0);
    }

    @JsonIgnore
    public Integer getTotalNumberOfCarParks() {
        return numberOfOpenCarParks!=null?numberOfOpenCarParks:0 + (numberOfCoveredCarParks!=null?numberOfCoveredCarParks:0);
    }

    @JsonIgnore
    public Boolean isCarParkingAvailable() {
        return (getNumberOfCoveredCarParks()!=null?getNumberOfCoveredCarParks():0) + (getNumberOfOpenCarParks()!=null?getNumberOfOpenCarParks():0) > 0;
    }

    public Boolean getCarParkingAvailable() {
        int covCarParks=0;
        if(getNumberOfCoveredCarParks()!=null){
            covCarParks=getNumberOfCoveredCarParks();
        }
        int openCarParks=0;
        if(getNumberOfOpenCarParks()!=null){
            openCarParks=getNumberOfOpenCarParks();
        }
        return covCarParks + openCarParks > 0;
    }


    @JsonIgnore
    public String getTenantTypeAllowed() {
        return null;
    }

    @JsonIgnore
    public Integer getNumberOfWesternBathrooms() {
        return 0;
    }

    @JsonIgnore
    public Integer getNumberOfIndianBathrooms() {
        return 0;
    }

    public Integer getRentalBedrooms() {
        return rentalBedrooms;
    }

    public void setRentalBedrooms(Integer rentalBedrooms) {
        this.rentalBedrooms = rentalBedrooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HouseDetails)) return false;

        HouseDetails that = (HouseDetails) o;

        if (area != that.area) return false;
        if (numberOfBedrooms != that.numberOfBedrooms) return false;
        if (numberOfAttachedBathrooms != that.numberOfAttachedBathrooms) return false;
        if (numberOfCommonBathrooms != that.numberOfCommonBathrooms) return false;
        if (hasServantBathroom != that.hasServantBathroom) return false;
        if (hasServantRoom != that.hasServantRoom) return false;
        if (hasStudyRoom != that.hasStudyRoom) return false;
        if (numberOfBalconies != that.numberOfBalconies) return false;
        if (hasUtilityRoom != that.hasUtilityRoom) return false;
        if (hasStoreRoom != that.hasStoreRoom) return false;
        if (hasTerrace != that.hasTerrace) return false;
        if (numberOfCoveredCarParks != that.numberOfCoveredCarParks) return false;
        if (numberOfOpenCarParks != that.numberOfOpenCarParks) return false;
        if (isBachelorAllowed != that.isBachelorAllowed) return false;
        if (isBacheloretteAllowed != that.isBacheloretteAllowed) return false;
        if (isForeignerAllowed != that.isForeignerAllowed) return false;
        if (isNonvegAllowed != that.isNonvegAllowed) return false;
        if (isPetAllowed != that.isPetAllowed) return false;
        if (isPartiallyLocked != that.isPartiallyLocked) return false;
        if (isCorporateLeaseAllowed != that.isCorporateLeaseAllowed) return false;
        if (rentalBedrooms != that.rentalBedrooms) return false;
        if (houseId != null ? !houseId.equals(that.houseId) : that.houseId != null) return false;
        if (flatNumber != null ? !flatNumber.equals(that.flatNumber) : that.flatNumber != null) return false;
        if (housingComplexId != null ? !housingComplexId.equals(that.housingComplexId) : that.housingComplexId != null)
            return false;
        if (housingComplexName != null ? !housingComplexName.equals(that.housingComplexName) : that.housingComplexName != null)
            return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (houseType != that.houseType) return false;
        if (mainDoorFacingDirection != null ? !mainDoorFacingDirection.equals(that.mainDoorFacingDirection) : that.mainDoorFacingDirection != null)
            return false;
        if (furnishingCategory != that.furnishingCategory) return false;
        if (furnishings != null ? !furnishings.equals(that.furnishings) : that.furnishings != null) return false;
        if (flooringTypes != null ? !flooringTypes.equals(that.flooringTypes) : that.flooringTypes != null)
            return false;
        if (flatPowerBackupType != that.flatPowerBackupType) return false;
        if (flatPowerBackupCoverage != that.flatPowerBackupCoverage) return false;
        if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
        if (publishingStatus != null ? !publishingStatus.equals(that.publishingStatus) : that.publishingStatus != null)
            return false;
        if (publisherId != null ? !publisherId.equals(that.publisherId) : that.publisherId != null) return false;
        if (listingStatus != that.listingStatus) return false;
        if (contentScratchpad != null ? !contentScratchpad.equals(that.contentScratchpad) : that.contentScratchpad != null)
            return false;
        if (approverNotes != null ? !approverNotes.equals(that.approverNotes) : that.approverNotes != null)
            return false;
        if (firstUpdated != null ? !firstUpdated.equals(that.firstUpdated) : that.firstUpdated != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;
        if (ownershipType != null ? !ownershipType.equals(that.ownershipType) : that.ownershipType != null)
            return false;
        return !(gasConnectionType != null ? !gasConnectionType.equals(that.gasConnectionType) : that.gasConnectionType != null);

    }

    @Override
    public int hashCode() {
        int result = houseId != null ? houseId.hashCode() : 0;
        result = 31 * result + (flatNumber != null ? flatNumber.hashCode() : 0);
        result = 31 * result + area;
        result = 31 * result + (housingComplexId != null ? housingComplexId.hashCode() : 0);
        result = 31 * result + (housingComplexName != null ? housingComplexName.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + numberOfBedrooms;
        result = 31 * result + numberOfAttachedBathrooms;
        result = 31 * result + numberOfCommonBathrooms;
        result = 31 * result + (hasServantBathroom ? 1 : 0);
        result = 31 * result + (hasServantRoom ? 1 : 0);
        result = 31 * result + (hasStudyRoom ? 1 : 0);
        result = 31 * result + numberOfBalconies;
        result = 31 * result + (hasUtilityRoom ? 1 : 0);
        result = 31 * result + (hasStoreRoom ? 1 : 0);
        result = 31 * result + (hasTerrace ? 1 : 0);
        result = 31 * result + (houseType != null ? houseType.hashCode() : 0);
        result = 31 * result + (mainDoorFacingDirection != null ? mainDoorFacingDirection.hashCode() : 0);
        result = 31 * result + numberOfCoveredCarParks;
        result = 31 * result + numberOfOpenCarParks;
        result = 31 * result + (furnishingCategory != null ? furnishingCategory.hashCode() : 0);
        result = 31 * result + (furnishings != null ? furnishings.hashCode() : 0);
        result = 31 * result + (flooringTypes != null ? flooringTypes.hashCode() : 0);
        result = 31 * result + (flatPowerBackupType != null ? flatPowerBackupType.hashCode() : 0);
        result = 31 * result + (flatPowerBackupCoverage != null ? flatPowerBackupCoverage.hashCode() : 0);
        result = 31 * result + (isBachelorAllowed ? 1 : 0);
        result = 31 * result + (isBacheloretteAllowed ? 1 : 0);
        result = 31 * result + (isForeignerAllowed ? 1 : 0);
        result = 31 * result + (isNonvegAllowed ? 1 : 0);
        result = 31 * result + (isPetAllowed ? 1 : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        result = 31 * result + (publishingStatus != null ? publishingStatus.hashCode() : 0);
        result = 31 * result + (publisherId != null ? publisherId.hashCode() : 0);
        result = 31 * result + (listingStatus != null ? listingStatus.hashCode() : 0);
        result = 31 * result + (contentScratchpad != null ? contentScratchpad.hashCode() : 0);
        result = 31 * result + (approverNotes != null ? approverNotes.hashCode() : 0);
        result = 31 * result + (firstUpdated != null ? firstUpdated.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + (isPartiallyLocked ? 1 : 0);
        result = 31 * result + (isCorporateLeaseAllowed ? 1 : 0);
        result = 31 * result + (ownershipType != null ? ownershipType.hashCode() : 0);
        result = 31 * result + (gasConnectionType != null ? gasConnectionType.hashCode() : 0);
        result = 31 * result + rentalBedrooms;
        return result;
    }

    public String getGasConnectionType() {
        return gasConnectionType;
    }

    public void setGasConnectionType(String gasConnectionType) {
        this.gasConnectionType = gasConnectionType;
    }

}
