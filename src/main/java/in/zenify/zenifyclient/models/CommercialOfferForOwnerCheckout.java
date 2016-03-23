package in.zenify.zenifyclient.models;

import java.util.Date;

/**
 * Created by tanay on 07/07/15.
 */
public class CommercialOfferForOwnerCheckout {

    private String offerId;
    private String acquisitionId;
    private RentalType program;
    private int rent;
    private RentType rentType;
    private int maintenanceCharges;
    private int securityDeposit;
    private float percentIncrement;
    private int rentPaymentDate;
    private RentPaymentType rentPaymentType;
    private String contractDuration;
    private float serviceFee;
    private float tenantFinderFee;
    private float tdsPercent;
    private int initialGracePeriodDays;
    private int intermediateGracePeriodDays;
    private Date offerGenDate;
    private String publishingStatus;
    private boolean linkedWithAgreement;

    public CommercialOfferForOwnerCheckout() {
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getAcquisitionId() {
        return acquisitionId;
    }

    public void setAcquisitionId(String acquisitionId) {
        this.acquisitionId = acquisitionId;
    }

    public RentalType getProgram() {
        return program;
    }

    public void setProgram(RentalType program) {
        this.program = program;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public int getMaintenanceCharges() {
        return maintenanceCharges;
    }

    public void setMaintenanceCharges(int maintenanceCharges) {
        this.maintenanceCharges = maintenanceCharges;
    }

    public int getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(int securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public float getPercentIncrement() {
        return percentIncrement;
    }

    public void setPercentIncrement(float percentIncrement) {
        this.percentIncrement = percentIncrement;
    }

    public int getRentPaymentDate() {
        return rentPaymentDate;
    }

    public void setRentPaymentDate(int rentPaymentDate) {
        this.rentPaymentDate = rentPaymentDate;
    }

    public RentPaymentType getRentPaymentType() {
        return rentPaymentType;
    }

    public void setRentPaymentType(RentPaymentType rentPaymentType) {
        this.rentPaymentType = rentPaymentType;
    }

    public String getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(String contractDuration) {
        this.contractDuration = contractDuration;
    }

    public float getServiceFee() {
        return serviceFee;
    }

    public float getTenantFinderFee() {
        return tenantFinderFee;
    }

    public float getTdsPercent() {
        return tdsPercent;
    }

    public void setTdsPercent(float tdsPercent) {
        this.tdsPercent = tdsPercent;
    }

    public int getInitialGracePeriodDays() {
        return initialGracePeriodDays;
    }

    public void setInitialGracePeriodDays(int initialGracePeriodDays) {
        this.initialGracePeriodDays = initialGracePeriodDays;
    }

    public Date getOfferGenDate() {
        return offerGenDate;
    }

    public void setOfferGenDate(Date offerGenDate) {
        this.offerGenDate = offerGenDate;
    }

    public String getPublishingStatus() {
        return publishingStatus;
    }

    public void setPublishingStatus(String publishingStatus) {
        this.publishingStatus = publishingStatus;
    }

    public int getIntermediateGracePeriodDays() {
        return intermediateGracePeriodDays;
    }

    public void setIntermediateGracePeriodDays(int intermediateGracePeriodDays) {
        this.intermediateGracePeriodDays = intermediateGracePeriodDays;
    }

    public void setTenantFinderFee(float tenantFinderFee) {
        this.tenantFinderFee = tenantFinderFee;
    }

    public void setServiceFee(float serviceFee) {
        this.serviceFee = serviceFee;
    }

    public boolean isLinkedWithAgreement() {
        return linkedWithAgreement;
    }

    public void setLinkedWithAgreement(boolean linkedWithAgreement) {
        this.linkedWithAgreement = linkedWithAgreement;
    }
}
