package in.zenify.zenifyclient.models;

/**
 * Created by mohit on 21/03/15.
 */
public enum HouseType {
    DUPLEX,TRIPLEX,SINGLE_FLOOR;


    @Override
    public String toString() {

        if (this == DUPLEX)
            return "Duplex";
        else if (this == SINGLE_FLOOR)
            return "Single Floor";
        else if (this == TRIPLEX)
            return "Triplex";
        else return null;
    }

}
