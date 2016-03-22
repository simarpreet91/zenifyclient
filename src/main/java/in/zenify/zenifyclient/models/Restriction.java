package in.zenify.zenifyclient.models;

/**
 * Created by mohit on 01/04/15.
 */
public final class Restriction {

    private Boolean isPositive;
    private String display;

    public Restriction() {}

    public Restriction(Boolean isPositive, String display) {
        this.isPositive = isPositive;
        this.display = display;
    }

    public Boolean getIsPositive() {
        return isPositive;
    }

    public void setIsPositive(Boolean isPositive) {
        this.isPositive = isPositive;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Restriction{" +
                "isPositive=" + isPositive +
                ", display='" + display + '\'' +
                '}';
    }
}
