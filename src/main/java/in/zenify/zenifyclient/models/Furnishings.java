package in.zenify.zenifyclient.models;

/**
 * Created by tanay on 03/07/15.
 */
public class Furnishings {
	private KitchenCabinetLocation kitchenCabinetLocation;
	private KitchenCabinetQuality kitchenCabinetQuality;
	private SofaType sofaType;
	private SofaQuality sofaQuality;
	private DiningTableType diningTableType;
	private TvCount tvCount;
	private String tvTypes;
	private WashingMachineType washingMachineType;
	private RefrigeratorType refrigeratorType;
	private Boolean microwave;
	private Boolean waterPurifier;
	private MattressPresent mattressPresent;
	private Boolean chimney;

	public Boolean getChimney() {
		return chimney;
	}

	public void setChimney(Boolean chimney) {
		this.chimney = chimney;
	}

	public MattressPresent getMattressPresent() {
		return mattressPresent;
	}

	public void setMattressPresent(MattressPresent mattressPresent) {
		this.mattressPresent = mattressPresent;
	}

	public Furnishings() {
	}

	public KitchenCabinetLocation getKitchenCabinetLocation() {
		return kitchenCabinetLocation;
	}

	public void setKitchenCabinetLocation(KitchenCabinetLocation kitchenCabinetLocation) {
		this.kitchenCabinetLocation = kitchenCabinetLocation;
	}

	public TvCount getTvCount() {
		return tvCount;
	}

	public void setTvCount(TvCount tvCount) {
		this.tvCount = tvCount;
	}

	public String getTvTypes() {
		return tvTypes;
	}

	public void setTvTypes(String tvTypes) {
		this.tvTypes = tvTypes;
	}

	public KitchenCabinetLocation getKitchenCabinet() {
		return kitchenCabinetLocation;
	}

	public void setKitchenCabinet(KitchenCabinetLocation kitchenCabinet) {
		this.kitchenCabinetLocation = kitchenCabinet;
	}

	public KitchenCabinetQuality getKitchenCabinetQuality() {
		return kitchenCabinetQuality;
	}

	public void setKitchenCabinetQuality(KitchenCabinetQuality kitchenCabinetQuality) {
		this.kitchenCabinetQuality = kitchenCabinetQuality;
	}

	public SofaType getSofaType() {
		return sofaType;
	}

	public void setSofaType(SofaType sofaType) {
		this.sofaType = sofaType;
	}

	public SofaQuality getSofaQuality() {
		return sofaQuality;
	}

	public void setSofaQuality(SofaQuality sofaQuality) {
		this.sofaQuality = sofaQuality;
	}

	public DiningTableType getDiningTableType() {
		return diningTableType;
	}

	public void setDiningTableType(DiningTableType diningTableType) {
		this.diningTableType = diningTableType;
	}

	public WashingMachineType getWashingMachineType() {
		return washingMachineType;
	}

	public void setWashingMachineType(WashingMachineType washingMachineType) {
		this.washingMachineType = washingMachineType;
	}

	public RefrigeratorType getRefrigeratorType() {
		return refrigeratorType;
	}

	public void setRefrigeratorType(RefrigeratorType refrigeratorType) {
		this.refrigeratorType = refrigeratorType;
	}

	public Boolean getMicrowave() {
		return microwave;
	}

	public void setMicrowave(Boolean microwave) {
		this.microwave = microwave;
	}

	public Boolean getWaterPurifier() {
		return waterPurifier;
	}

	public void setWaterPurifier(Boolean waterPurifier) {
		this.waterPurifier = waterPurifier;
	}

	@Override
	public String toString() {
		return "Furnishings{" +
				", kitchenCabinetLocation='" + kitchenCabinetLocation + '\'' +
				", kitchenCabinetQuality='" + kitchenCabinetQuality + '\'' +
				", sofaType='" + sofaType+ '\'' + ", sofaQuality='" + sofaQuality + '\'' +
				", diningTableType='" + diningTableType + '\'' + ", tvCount='" + tvCount + '\'' +
				", tvTypes='" + tvTypes + '\''  + ", refrigeratorType='" + refrigeratorType + '\'' +
				", washingMachineType='" + washingMachineType + '\'' + ", microwave='" + microwave + '\'' +
				", waterPurifier='" + waterPurifier + '\'' + ", mattress='" + mattressPresent + '\'' +
				", chimney='" + chimney + '\''  + '}';
	}
}
