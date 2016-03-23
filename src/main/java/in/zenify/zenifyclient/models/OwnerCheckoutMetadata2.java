package in.zenify.zenifyclient.models;

import java.util.List;

/**
 * Created by tanay on 29/07/15.
 */
public class OwnerCheckoutMetadata2 {

    String houseDetailsMsg;
    String complexDetailsMsg;
    String agreementRejectionMsg;
    String offerRejectionMsg;
    String rsdRejectionMsg;
    String missingFittings;
    String displayMsg;
    HouseForOwnerCheckout house;
    CommercialOfferForOwnerCheckout commercialOffer;
    String agreementId;

    public OwnerCheckoutMetadata2() {
    }

    public OwnerCheckoutMetadata2(String houseDetailsMsg, String complexDetailsMsg, String agreementRejectionMsg,
                                 String offerRejectionMsg, String rsdRejectionMsg, String missingFittings, String displayMsg,
                                 HouseForOwnerCheckout house, CommercialOfferForOwnerCheckout commercialOffer, String agreementId) {
        this.houseDetailsMsg = houseDetailsMsg;
        this.complexDetailsMsg = complexDetailsMsg;
        this.agreementRejectionMsg = agreementRejectionMsg;
        this.offerRejectionMsg = offerRejectionMsg;
        this.rsdRejectionMsg = rsdRejectionMsg;
        this.missingFittings = missingFittings;
        this.displayMsg = displayMsg;
        this.house = house;
        this.commercialOffer = commercialOffer;
        this.agreementId = agreementId;
    }

	public void setHouseDetailsMsg(String houseDetailsMsg) {
        this.houseDetailsMsg = houseDetailsMsg;
    }

    public String getHouseDetailsMsg() {
        return houseDetailsMsg;
    }

    public String getComplexDetailsMsg() {
        return complexDetailsMsg;
    }

    public void setComplexDetailsMsg(String complexDetailsMsg) {
        this.complexDetailsMsg = complexDetailsMsg;
    }

    public String getAgreementRejectionMsg() {
        return agreementRejectionMsg;
    }

    public void setAgreementRejectionMsg(String agreementRejectionMsg) {
        this.agreementRejectionMsg = agreementRejectionMsg;
    }

    public String getOfferRejectionMsg() {
        return offerRejectionMsg;
    }

    public void setOfferRejectionMsg(String offerRejectionMsg) {
        this.offerRejectionMsg = offerRejectionMsg;
    }

    public String getRsdRejectionMsg() {
        return rsdRejectionMsg;
    }

    public void setRsdRejectionMsg(String rsdRejectionMsg) {
        this.rsdRejectionMsg = rsdRejectionMsg;
    }

    public String getMissingFittings() {
        return missingFittings;
    }

    public void setMissingFittings(String missingFittings) {
        this.missingFittings = missingFittings;
    }

    public String getDisplayMsg() {
        return displayMsg;
    }

    public void setDisplayMsg(String displayMsg) {
        this.displayMsg = displayMsg;
    }

    public HouseForOwnerCheckout getHouse() {
        return house;
    }

    public void setHouse(HouseForOwnerCheckout house) {
        this.house = house;
    }

    public CommercialOfferForOwnerCheckout getCommercialOffer() {
        return commercialOffer;
    }

    public void setCommercialOffer(CommercialOfferForOwnerCheckout commercialOffer) {
        this.commercialOffer = commercialOffer;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }
}
