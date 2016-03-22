package in.zenify.zenifyclient.models;

/**
 * Created by mohit on 21/03/15.
 */
public enum FurnishingCategory {
    FULLY_FURNISHED, SEMI_FURNISHED, PARTIALLY_FURNISHED,UN_FURNISHED;

    public String toStringCustom() {
        if (this == FurnishingCategory.SEMI_FURNISHED)
            return "SEMI_FURNISHED";
        else if (this == FurnishingCategory.FULLY_FURNISHED)
            return "FULLY_FURNISHED";
        else if (this == FurnishingCategory.PARTIALLY_FURNISHED)
            return "PARTIALLY_FURNISHED";
        else
            return null;
    }
}
