package in.zenify.zenifyclient.models;

import java.util.List;

/**
 * Created by tanay on 29/07/15.
 */
public class OwnerCheckoutMetadata {

    String houseDetailsMsg;
    String complexDetailsMsg;
    String agreementRejectionMsg;
    String offerRejectionMsg;
    String rsdRejectionMsg;
    String missingFittings;
    String displayMsg;
    HouseDetailsForOwnerCheckout houseDetailsForOwnerCheckout;
    CommercialOffer commercialOffer;
    List<Ownership> ownerships;
    List<OwnershipGPA> ownershipGPAs;
    List<BankAccount> bankAccounts;
    List<ProofDocument> proofDocuments;
    String agreementId;

    public OwnerCheckoutMetadata() {
    }

    public OwnerCheckoutMetadata(String houseDetailsMsg, String complexDetailsMsg, String agreementRejectionMsg,
                                 String offerRejectionMsg, String rsdRejectionMsg, String missingFittings, String displayMsg,
                                 HouseDetailsForOwnerCheckout houseDetailsForOwnerCheckout, CommercialOffer commercialOffer,
                                 List<Ownership> ownerships, List<OwnershipGPA> ownershipGPAs,
                                 List<BankAccount> bankAccounts, List<ProofDocument> proofDocuments, String agreementId) {
        this.houseDetailsMsg = houseDetailsMsg;
        this.complexDetailsMsg = complexDetailsMsg;
        this.agreementRejectionMsg = agreementRejectionMsg;
        this.offerRejectionMsg = offerRejectionMsg;
        this.rsdRejectionMsg = rsdRejectionMsg;
        this.missingFittings = missingFittings;
        this.displayMsg = displayMsg;
        this.houseDetailsForOwnerCheckout = houseDetailsForOwnerCheckout;
        this.commercialOffer = commercialOffer;
        this.ownerships = ownerships;
        this.ownershipGPAs = ownershipGPAs;
        this.bankAccounts = bankAccounts;
        this.proofDocuments = proofDocuments;
        this.agreementId = agreementId;
    }
    
    

    @Override
	public String toString() {
		return "OwnerCheckoutMetadata [houseDetailsMsg=" + houseDetailsMsg + ", complexDetailsMsg=" + complexDetailsMsg + ", agreementRejectionMsg="
				+ agreementRejectionMsg + ", offerRejectionMsg=" + offerRejectionMsg + ", rsdRejectionMsg=" + rsdRejectionMsg + ", missingFittings="
				+ missingFittings + ", displayMsg=" + displayMsg + ", houseDetailsForOwnerCheckout=" + houseDetailsForOwnerCheckout
				+ ", commercialOffer=" + commercialOffer + ", ownerships=" + ownerships + ", ownershipGPAs=" + ownershipGPAs + ", bankAccounts="
				+ bankAccounts + ", proofDocuments=" + proofDocuments + ", agreementId=" + agreementId + "]";
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

    public HouseDetailsForOwnerCheckout getHouseDetailsForOwnerCheckout() {
        return houseDetailsForOwnerCheckout;
    }

    public void setHouseDetailsForOwnerCheckout(HouseDetailsForOwnerCheckout houseDetailsForOwnerCheckout) {
        this.houseDetailsForOwnerCheckout = houseDetailsForOwnerCheckout;
    }

    public CommercialOffer getCommercialOffer() {
        return commercialOffer;
    }

    public void setCommercialOffer(CommercialOffer commercialOffer) {
        this.commercialOffer = commercialOffer;
    }

    public List<Ownership> getOwnerships() {
        return ownerships;
    }

    public void setOwnerships(List<Ownership> ownerships) {
        this.ownerships = ownerships;
    }

    public List<OwnershipGPA> getOwnershipGPAs() {
        return ownershipGPAs;
    }

    public void setOwnershipGPAs(List<OwnershipGPA> ownershipGPAs) {
        this.ownershipGPAs = ownershipGPAs;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<ProofDocument> getProofDocuments() {
        return proofDocuments;
    }

    public void setProofDocuments(List<ProofDocument> proofDocuments) {
        this.proofDocuments = proofDocuments;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }
}
