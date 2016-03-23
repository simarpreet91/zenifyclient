package in.zenify.zenifyclient.models;

/**
 * Created by tanay on 09/07/15.
 */
public class RoomForOwnerCheckout {

	private String roomId;
	private String houseId;
	private RoomType roomType;
	private boolean isLocked;
	private CotType cotType;
	private WardrobeDoors wardrobeDoors;
	private Boolean wardrobeLofts;

	public RoomForOwnerCheckout(String roomId, String houseId, RoomType roomType, boolean isLocked, CotType cotType, WardrobeDoors wardrobeDoors,
			Boolean wardrobeLofts) {
		super();
		this.roomId = roomId;
		this.houseId = houseId;
		this.roomType = roomType;
		this.isLocked = isLocked;
		this.cotType = cotType;
		this.wardrobeDoors = wardrobeDoors;
		this.wardrobeLofts = wardrobeLofts;
	}

	public RoomForOwnerCheckout() {}

	public RoomForOwnerCheckout(String roomId, String houseId, RoomType roomType, boolean isLocked) {
		this.roomId = roomId;
		this.houseId = houseId;
		this.roomType = roomType;
		this.isLocked = isLocked;
	}

	public Boolean getWardrobeLofts() {
		return wardrobeLofts;
	}

	public void setWardrobeLofts(Boolean wardrobeLofts) {
		this.wardrobeLofts = wardrobeLofts;
	}

	public WardrobeDoors getWardrobeDoors() {
		return wardrobeDoors;
	}

	public void setWardrobeDoors(WardrobeDoors wardrobeDoors) {
		this.wardrobeDoors = wardrobeDoors;
	}

	public CotType getCotType() {
		return cotType;
	}

	public void setCotType(CotType cotType) {
		this.cotType = cotType;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
}
