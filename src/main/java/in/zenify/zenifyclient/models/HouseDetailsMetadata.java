package in.zenify.zenifyclient.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by mohit on 23/03/15
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class HouseDetailsMetadata {

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

    private String ownerName;
    private Date ownerLeaseStartDate;
    private List<ProofDocument> ownershipProofs;

    public HouseDetailsMetadata() {
    }

    public HouseDetailsMetadata(String carParkSlotNumber, String lockedWithOwnerBelongings, String furnishingDescription, String flatPowerBackupCapacity, boolean hasPipedGasAvailability, int numberOfGasCylinders, String cookingGasConnectionDetails, String gasAgencyName, String gasAgencyConsumerNumber, String gasAgencyContact, String otherTenancyRestrictions, String sellingPoints, String marketingDescription, int propertyOnFloor, int floorsInProperty, boolean isBrandNewFlat, boolean hasFlatPowerBackup, String electricityRRNum, String ownerName, Date ownerLeaseStartDate, List<ProofDocument> ownershipProofs) {
        this.carParkSlotNumber = carParkSlotNumber;
        this.lockedWithOwnerBelongings = lockedWithOwnerBelongings;
        this.furnishingDescription = furnishingDescription;
        this.flatPowerBackupCapacity = flatPowerBackupCapacity;
        this.hasPipedGasAvailability = hasPipedGasAvailability;
        this.numberOfGasCylinders = numberOfGasCylinders;
        this.cookingGasConnectionDetails = cookingGasConnectionDetails;
        this.gasAgencyName = gasAgencyName;
        this.gasAgencyConsumerNumber = gasAgencyConsumerNumber;
        this.gasAgencyContact = gasAgencyContact;
        this.otherTenancyRestrictions = otherTenancyRestrictions;
        this.sellingPoints = sellingPoints;
        this.marketingDescription = marketingDescription;
        this.propertyOnFloor = propertyOnFloor;
        this.floorsInProperty = floorsInProperty;
        this.isBrandNewFlat = isBrandNewFlat;
        this.hasFlatPowerBackup = hasFlatPowerBackup;
        this.electricityRRNum = electricityRRNum;
        this.ownerName = ownerName;
        this.ownerLeaseStartDate = ownerLeaseStartDate;
        this.ownershipProofs = ownershipProofs;
    }

    public HouseDetailsMetadata(HouseDetailsMetadata other) {
        this.carParkSlotNumber = other.carParkSlotNumber;
        this.lockedWithOwnerBelongings = other.lockedWithOwnerBelongings;
        this.furnishingDescription = other.furnishingDescription;
        this.flatPowerBackupCapacity = other.flatPowerBackupCapacity;
        this.hasPipedGasAvailability = other.hasPipedGasAvailability;
        this.numberOfGasCylinders = other.numberOfGasCylinders;
        this.cookingGasConnectionDetails = other.cookingGasConnectionDetails;
        this.gasAgencyName = other.gasAgencyName;
        this.gasAgencyConsumerNumber = other.gasAgencyConsumerNumber;
        this.gasAgencyContact = other.gasAgencyContact;
        this.otherTenancyRestrictions = other.otherTenancyRestrictions;
        this.sellingPoints = other.sellingPoints;
        this.marketingDescription = other.marketingDescription;
        this.propertyOnFloor = other.propertyOnFloor;
        this.floorsInProperty = other.floorsInProperty;
        this.isBrandNewFlat = other.isBrandNewFlat;
        this.hasFlatPowerBackup = other.hasFlatPowerBackup;
        this.electricityRRNum = other.electricityRRNum;
        this.ownerName = other.ownerName;
        this.ownerLeaseStartDate = other.ownerLeaseStartDate;
        this.ownershipProofs = other.ownershipProofs;
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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getOwnerLeaseStartDate() {
        return ownerLeaseStartDate;
    }

    public void setOwnerLeaseStartDate(Date ownerLeaseStartDate) {
        this.ownerLeaseStartDate = ownerLeaseStartDate;
    }

    public boolean isHasPipedGasAvailability() {
        return hasPipedGasAvailability;
    }

//    public boolean isBrandNewFlat() {
//        System.out.println("getter2");
//        return isBrandNewFlat;
//    }

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

    public List<ProofDocument> getOwnershipProofs() {
        return ownershipProofs;
    }

    public void setOwnershipProofs(List<ProofDocument> ownershipProofs) {
        this.ownershipProofs = ownershipProofs;
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

    @JsonIgnore
    public   List<String> getFurnishingDescriptionList() {

        String[] split = furnishingDescription.split("\r\n");
        return Arrays.asList(split);
    }
}

