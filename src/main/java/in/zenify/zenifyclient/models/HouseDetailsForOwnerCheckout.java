package in.zenify.zenifyclient.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by trapti on 2/10/16.
 */
public class HouseDetailsForOwnerCheckout {
    private HouseDetails houseDetails;
    private List<Room> rooms;
    private List<Bathroom> bathrooms;

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

    private String[] cots;

    public HouseDetailsForOwnerCheckout() {
        houseDetails = new HouseDetails();
        rooms = new ArrayList<>();
        bathrooms = new ArrayList<>();
    }

    public HouseDetails getHouseDetails() {
        return houseDetails;
    }

    public void setHouseDetails(HouseDetails houseDetails) {
        this.houseDetails = houseDetails;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Bathroom> getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(List<Bathroom> bathrooms) {
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
}
