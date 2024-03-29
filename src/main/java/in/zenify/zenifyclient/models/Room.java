package in.zenify.zenifyclient.models;

/**
 * Created by tanay on 09/07/15.
 */
public class Room {

	private String roomId;
	private String houseId;
	private RoomType roomType;
	private boolean isLocked;
	private CotType cotType;
	private WardrobeDoors wardrobeDoors;
	private Boolean wardrobeLofts;

	public Room(String roomId, String houseId, RoomType roomType, boolean isLocked, CotType cotType, WardrobeDoors wardrobeDoors,
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

	public Room() {}

	public Room(String roomId, String houseId, RoomType roomType, boolean isLocked) {
		this.roomId = roomId;
		this.houseId = houseId;
		this.roomType = roomType;
		this.isLocked = isLocked;
	}

/*	public Room(String roomId, String houseId, RoomType roomType, boolean isLocked, WardrobeDoors wardrobeDoors, CotType cotType, Boolean wardrobeLofts) {
		this.roomId = roomId;
		this.houseId = houseId;
		this.roomType = roomType;
		this.isLocked = isLocked;
		this.wardrobeDoors = wardrobeDoors;
		this.cotType = cotType;
		this.wardrobeLofts = wardrobeLofts;
	}*/

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

	@Override
	public String toString() {

		return "Room{" + "roomId='" + roomId + '\'' + ", houseId='" + houseId + '\'' + ", roomType='" + roomType + '\'' + ", isLocked=" + isLocked
				+ '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Room room = (Room) o;

		if (isLocked != room.isLocked) return false;
		if (!houseId.equals(room.houseId)) return false;
		if (roomType != room.roomType) return false;
		if (cotType != room.cotType) return false;
		if (wardrobeDoors != room.wardrobeDoors) return false;
		return ((wardrobeLofts == null || wardrobeLofts == false) && room.wardrobeLofts != null && room.wardrobeLofts == true) ||
				((room.wardrobeLofts == null || room.wardrobeLofts == false) && wardrobeLofts != null && wardrobeLofts == true)
				? false : true;

	}
}
