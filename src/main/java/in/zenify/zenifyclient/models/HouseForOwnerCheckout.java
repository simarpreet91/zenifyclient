package in.zenify.zenifyclient.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by trapti on 2/10/16.
 */
public class HouseForOwnerCheckout {
    @NotNull
    private String houseId; //ok

    private String flatNumber; //done
    private Integer area; //done
    private String housingComplexId;

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

    private String publishingStatus; //dynamic

    private String publisherId;
    private ListingStatus listingStatus; //later

    private String contentScratchpad;
    private String approverNotes;

    private Date firstUpdated; //dynamic
    private Date lastUpdated; //dynamic

    private Boolean isPartiallyLocked; //done
    private Boolean isCorporateLeaseAllowed;
    private String gasConnectionType;
    private Integer rentalBedrooms;

    private String otherFurnishings;

    private String carParkSlotNumber;
    private String lockedWithOwnerBelongings;
    private String furnishingDescription;
    private String flatPowerBackupCapacity;
    private boolean hasPipedGasAvailability;
    private int numberOfGasCylinders;
    private String cookingGasConnectionDetails;
    private String gasAgencyName;
    private String gasAgencyConsumerNumber;
    private String gasAgencyContact;
    private String otherTenancyRestrictions;
    private String sellingPoints;
    private String marketingDescription;
    private int propertyOnFloor;
    private int floorsInProperty;
    private boolean isBrandNewFlat;
    private boolean hasFlatPowerBackup;
    private String electricityRRNum;

    private Integer totalStudyrooms;
    private Integer totalBedroomsLocked;
    private Integer totalStudyroomsLocked;
    private Integer totalAttachedBathroomsLocked;
    private Integer totalCommonBathroomsLocked;
    private Integer totalUtilityArea;
    private Integer totalUtilityAreaLocked;
    private Integer totalBalconiesLocked;
    private Integer totalServantRooms;
    private Integer totalServantRoomsLocked;
    private Integer totalServantBathrooms;
    private Integer totalServantBathroomsLocked;
    private List<RoomForOwnerCheckout> rooms;
    private List<BathroomForOwnerCheckout> bathrooms;

    private String[] cots;

    public HouseForOwnerCheckout() {
        this.furnishings = new Furnishings();
        rooms = new ArrayList<>();
        bathrooms = new ArrayList<>();
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
    public ListingStatus getListingStatus() {
        return listingStatus;
    }

    @JsonProperty
    public void setListingStatus(ListingStatus listingStatus) {
        this.listingStatus = listingStatus;
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

    public String getGasConnectionType() {
        return gasConnectionType;
    }

    public void setGasConnectionType(String gasConnectionType) {
        this.gasConnectionType = gasConnectionType;
    }

    public List<RoomForOwnerCheckout> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomForOwnerCheckout> rooms) {
        this.rooms = rooms;
    }

    public List<BathroomForOwnerCheckout> getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(List<BathroomForOwnerCheckout> bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getTotalStudyrooms() {
        return totalStudyrooms;
    }

    public void setTotalStudyrooms(Integer totalStudyrooms) {
        this.totalStudyrooms = totalStudyrooms;
    }

    public Integer getTotalBedroomsLocked() {
        return totalBedroomsLocked;
    }

    public void setTotalBedroomsLocked(Integer totalBedroomsLocked) {
        this.totalBedroomsLocked = totalBedroomsLocked;
    }

    public Integer getTotalStudyroomsLocked() {
        return totalStudyroomsLocked;
    }

    public void setTotalStudyroomsLocked(Integer totalStudyroomsLocked) {
        this.totalStudyroomsLocked = totalStudyroomsLocked;
    }

    public Integer getTotalAttachedBathroomsLocked() {
        return totalAttachedBathroomsLocked;
    }

    public void setTotalAttachedBathroomsLocked(Integer totalAttachedBathroomsLocked) {
        this.totalAttachedBathroomsLocked = totalAttachedBathroomsLocked;
    }

    public Integer getTotalCommonBathroomsLocked() {
        return totalCommonBathroomsLocked;
    }

    public void setTotalCommonBathroomsLocked(Integer totalCommonBathroomsLocked) {
        this.totalCommonBathroomsLocked = totalCommonBathroomsLocked;
    }

    public Integer getTotalUtilityArea() {
        return totalUtilityArea;
    }

    public void setTotalUtilityArea(Integer totalUtilityArea) {
        this.totalUtilityArea = totalUtilityArea;
    }

    public Integer getTotalUtilityAreaLocked() {
        return totalUtilityAreaLocked;
    }

    public void setTotalUtilityAreaLocked(Integer totalUtilityAreaLocked) {
        this.totalUtilityAreaLocked = totalUtilityAreaLocked;
    }

    public Integer getTotalBalconiesLocked() {
        return totalBalconiesLocked;
    }

    public void setTotalBalconiesLocked(Integer totalBalconiesLocked) {
        this.totalBalconiesLocked = totalBalconiesLocked;
    }

    public Integer getTotalServantRooms() {
        return totalServantRooms;
    }

    public void setTotalServantRooms(Integer totalServantRooms) {
        this.totalServantRooms = totalServantRooms;
    }

    public Integer getTotalServantRoomsLocked() {
        return totalServantRoomsLocked;
    }

    public void setTotalServantRoomsLocked(Integer totalServantRoomsLocked) {
        this.totalServantRoomsLocked = totalServantRoomsLocked;
    }

    public Integer getTotalServantBathrooms() {
        return totalServantBathrooms;
    }

    public void setTotalServantBathrooms(Integer totalServantBathrooms) {
        this.totalServantBathrooms = totalServantBathrooms;
    }

    public Integer getTotalServantBathroomsLocked() {
        return totalServantBathroomsLocked;
    }

    public void setTotalServantBathroomsLocked(Integer totalServantBathroomsLocked) {
        this.totalServantBathroomsLocked = totalServantBathroomsLocked;
    }

    public String[] getCots() {
        return cots;
    }

    public void setCots(String[] cots) {
        this.cots = cots;
    }


    public String getCarParkSlotNumber() {
        return carParkSlotNumber;
    }

    public void setCarParkSlotNumber(String carParkSlotNumber) {
        this.carParkSlotNumber = carParkSlotNumber;
    }

    public String getLockedWithOwnerBelongings() {
        return lockedWithOwnerBelongings;
    }

    public void setLockedWithOwnerBelongings(String lockedWithOwnerBelongings) {
        this.lockedWithOwnerBelongings = lockedWithOwnerBelongings;
    }

    public String getFurnishingDescription() {
        return furnishingDescription;
    }

    public void setFurnishingDescription(String furnishingDescription) {
        this.furnishingDescription = furnishingDescription;
    }

    public String getFlatPowerBackupCapacity() {
        return flatPowerBackupCapacity;
    }

    public void setFlatPowerBackupCapacity(String flatPowerBackupCapacity) {
        this.flatPowerBackupCapacity = flatPowerBackupCapacity;
    }

    public boolean getHasPipedGasAvailability() {
        return hasPipedGasAvailability;
    }

    public void setHasPipedGasAvailability(boolean hasPipedGasAvailability) {
        this.hasPipedGasAvailability = hasPipedGasAvailability;
    }

    public int getNumberOfGasCylinders() {
        return numberOfGasCylinders;
    }

    public void setNumberOfGasCylinders(int numberOfGasCylinders) {
        this.numberOfGasCylinders = numberOfGasCylinders;
    }

    public String getCookingGasConnectionDetails() {
        return cookingGasConnectionDetails;
    }

    public void setCookingGasConnectionDetails(String cookingGasConnectionDetails) {
        this.cookingGasConnectionDetails = cookingGasConnectionDetails;
    }

    public String getOtherTenancyRestrictions() {
        return otherTenancyRestrictions;
    }

    public void setOtherTenancyRestrictions(String otherTenancyRestrictions) {
        this.otherTenancyRestrictions = otherTenancyRestrictions;
    }

    public String getSellingPoints() {
        return sellingPoints;
    }

    public void setSellingPoints(String sellingPoints) {
        this.sellingPoints = sellingPoints;
    }

    public String getMarketingDescription() {
        return marketingDescription;
    }

    public void setMarketingDescription(String marketingDescription) {
        this.marketingDescription = marketingDescription;
    }

    public int getPropertyOnFloor() {
        return propertyOnFloor;
    }

    public void setPropertyOnFloor(int propertyOnFloor) {
        this.propertyOnFloor = propertyOnFloor;
    }

    public int getFloorsInProperty() {
        return floorsInProperty;
    }

    public void setFloorsInProperty(int floorsInProperty) {
        this.floorsInProperty = floorsInProperty;
    }

    public boolean getIsBrandNewFlat() {
        return isBrandNewFlat;
    }

    public void setIsBrandNewFlat(boolean isBrandNewFlat) {
        this.isBrandNewFlat = isBrandNewFlat;
    }

    public boolean getHasFlatPowerBackup() {
        return hasFlatPowerBackup;
    }

    public void setHasFlatPowerBackup(boolean hasFlatPowerBackup) {
        this.hasFlatPowerBackup = hasFlatPowerBackup;
    }

    public boolean isHasPipedGasAvailability() {
        return hasPipedGasAvailability;
    }

    public void setBrandNewFlat(boolean isBrandNewFlat) {
        this.isBrandNewFlat = isBrandNewFlat;
    }

    public boolean isHasFlatPowerBackup() {
        return hasFlatPowerBackup;
    }

    public String getElectricityRRNum() {
        return electricityRRNum;
    }

    public void setElectricityRRNum(String electricityRRNum) {
        this.electricityRRNum = electricityRRNum;
    }

    public String getGasAgencyConsumerNumber() {
        return gasAgencyConsumerNumber;
    }

    public void setGasAgencyConsumerNumber(String gasAgencyConsumerNumber) {
        this.gasAgencyConsumerNumber = gasAgencyConsumerNumber;
    }

    public String getGasAgencyName() {
        return gasAgencyName;
    }

    public void setGasAgencyName(String gasAgencyName) {
        this.gasAgencyName = gasAgencyName;
    }

    public String getGasAgencyContact() {
        return gasAgencyContact;
    }

    public void setGasAgencyContact(String gasAgencyContact) {
        this.gasAgencyContact = gasAgencyContact;
    }
}
