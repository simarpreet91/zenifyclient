package in.zenify.zenifyclient.models;

import java.util.Date;

/**
 * Created by tanay on 07/07/15.
 */
public class CommercialOffer {

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
    private String metadata;
    private String publishingStatus;
    private boolean linkedWithAgreement;
    private String error;

    public CommercialOffer(String offerId, String acquisitionId, RentalType program, int rent, RentType rentType, int maintenanceCharges, int securityDeposit, float percentIncrement, int rentPaymentDate, RentPaymentType rentPaymentType, String contractDuration, float serviceFee, float tenantFinderFee, float tdsPercent, int initialGracePeriodDays, int intermediateGracePeriodDays, Date offerGenDate, String metadata, String publishingStatus, boolean linkedWithAgreement) {
        this.offerId = offerId;
        this.acquisitionId = acquisitionId;
        this.program = program;
        this.rent = rent;
        this.rentType = rentType;
        this.maintenanceCharges = maintenanceCharges;
        this.securityDeposit = securityDeposit;
        this.percentIncrement = percentIncrement;
        this.rentPaymentDate = rentPaymentDate;
        this.rentPaymentType = rentPaymentType;
        this.contractDuration = contractDuration;
        this.serviceFee = serviceFee;
        this.tenantFinderFee = tenantFinderFee;
        this.tdsPercent = tdsPercent;
        this.initialGracePeriodDays = initialGracePeriodDays;
        this.intermediateGracePeriodDays = intermediateGracePeriodDays;
        this.offerGenDate = offerGenDate;
        this.metadata = metadata;
        this.publishingStatus = publishingStatus;
        this.linkedWithAgreement = linkedWithAgreement;
    }

    public CommercialOffer() {
    }

    public CommercialOffer(CommercialOffer other) {
        this.offerId = other.offerId;
        this.acquisitionId = other.acquisitionId;
        this.program = other.program;
        this.rent = other.rent;
        this.rentType = other.rentType;
        this.maintenanceCharges = other.maintenanceCharges;
        this.securityDeposit = other.securityDeposit;
        this.percentIncrement = other.percentIncrement;
        this.rentPaymentDate = other.rentPaymentDate;
        this.rentPaymentType = other.rentPaymentType;
        this.contractDuration = other.contractDuration;
        this.serviceFee = other.serviceFee;
        this.tenantFinderFee = other.tenantFinderFee;
        this.tdsPercent = other.tdsPercent;
        this.initialGracePeriodDays = other.initialGracePeriodDays;
        this.intermediateGracePeriodDays = other.intermediateGracePeriodDays;
        this.offerGenDate = other.offerGenDate;
        this.metadata = other.metadata;
        this.publishingStatus = other.publishingStatus;
        this.linkedWithAgreement = other.linkedWithAgreement;
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

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "CommercialOffer{" +
                "offerId='" + offerId + '\'' +
                ", acquisitionId='" + acquisitionId + '\'' +
                ", program=" + program +
                ", rent=" + rent +
                ", rentType=" + rentType +
                ", maintenanceCharges=" + maintenanceCharges +
                ", securityDeposit=" + securityDeposit +
                ", percentIncrement=" + percentIncrement +
                ", rentPaymentDate=" + rentPaymentDate +
                ", rentPaymentType=" + rentPaymentType +
                ", contractDuration='" + contractDuration + '\'' +
                ", serviceFee=" + serviceFee +
                ", tenantFinderFee=" + tenantFinderFee +
                ", tdsPercent=" + tdsPercent +
                ", initialGracePeriodDays=" + initialGracePeriodDays +
                ", intermediateGracePeriodDays=" + intermediateGracePeriodDays +
                ", offerGenDate=" + offerGenDate +
                ", metadata='" + metadata + '\'' +
                ", publishingStatus='" + publishingStatus + '\'' +
                ", linkedWithAgreement=" + linkedWithAgreement +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommercialOffer that = (CommercialOffer) o;

        if (rent != that.rent) return false;
        if (maintenanceCharges != that.maintenanceCharges) return false;
        if (securityDeposit != that.securityDeposit) return false;
        if (Float.compare(that.serviceFee, serviceFee) != 0) return false;
        if (Float.compare(that.tenantFinderFee, tenantFinderFee) != 0) return false;
        if (initialGracePeriodDays != that.initialGracePeriodDays) return false;
        if (intermediateGracePeriodDays != that.intermediateGracePeriodDays) return false;
        if (program != that.program) return false;
        if (rentType != that.rentType) return false;
        if (rentPaymentType != that.rentPaymentType) return false;
        return (contractDuration != null ? !contractDuration.equals(that.contractDuration) : that.contractDuration != null);
    }
}
