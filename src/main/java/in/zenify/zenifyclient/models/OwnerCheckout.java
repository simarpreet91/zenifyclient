package in.zenify.zenifyclient.models;

import java.util.Date;

/**
 * Created by tanay on 06/07/15.
 */
public class OwnerCheckout {

    private String checkoutId;
    private String acquisitionId;
    private String housingComplexId;
    private String offerId;
    private String startStep;
    private String maxStepCompleted;
    private String latestStepCompleted;
    private String minStepAllowed;
    private String maxStepAllowed;
    private String flatNumber;
    private String checkoutEmail;
    private Date firstUpdated;
    private Date lastUpdated;
    private Date offerSendDate;
    private String complexDetailsVerificationStatus;//
    private String houseDetailsVerificationStatus;//
    private String stdFittingsStatus;//
    private String repairQuoteAcceptanceStatus;// TODO Not needed
    private String commercialTermsAcceptanceStatus;//
    private String agreementTermsAcceptanceStatus;//
    private OccupancyType currentOccupancyType;
    private String physicalVerificationPOCType;
    private Person physicalVerificationPOC;
    private String rsdAcceptanceStatus;//pending
    private Date rentStartDate;//null
    private OwnerCheckoutRecipientType checkoutRecipientType;
    private String checkoutRecipientId;
    private Date mainDoorKeyHandoverDate;
    private Date wholeFlatKeyHandoverDate;
    private Date vacancyStartDate;
    private boolean willResidentCooperateForSiteVisit;
    private Date phyVerificationSlotStart;//null
    private String metadata;
    private OwnerCheckoutStatus ownerCheckoutStatus;
    private OwnerCheckoutContext context;

    public OwnerCheckout(String checkoutId, String acquisitionId, String housingComplexId, String offerId, String startStep, String maxStepCompleted, String latestStepCompleted, String minStepAllowed, String maxStepAllowed, String flatNumber, String checkoutEmail, Date firstUpdated, Date lastUpdated, Date offerSendDate, String complexDetailsVerificationStatus, String houseDetailsVerificationStatus, String stdFittingsStatus, String repairQuoteAcceptanceStatus, String commercialTermsAcceptanceStatus, String agreementTermsAcceptanceStatus, OccupancyType currentOccupancyType, String physicalVerificationPOCType, Person physicalVerificationPOC, String rsdAcceptanceStatus, Date rentStartDate, OwnerCheckoutRecipientType checkoutRecipientType, String checkoutRecipientId, Date mainDoorKeyHandoverDate, Date wholeFlatKeyHandoverDate, Date vacancyStartDate, boolean willResidentCooperateForSiteVisit, Date phyVerificationSlotStart, String metadata, OwnerCheckoutStatus ownerCheckoutStatus,OwnerCheckoutContext context) {
        this.checkoutId = checkoutId;
        this.acquisitionId = acquisitionId;
        this.housingComplexId = housingComplexId;
        this.offerId = offerId;
        this.startStep = startStep;
        this.maxStepCompleted = maxStepCompleted;
        this.latestStepCompleted = latestStepCompleted;
        this.minStepAllowed = minStepAllowed;
        this.maxStepAllowed = maxStepAllowed;
        this.flatNumber = flatNumber;
        this.checkoutEmail = checkoutEmail;
        this.firstUpdated = firstUpdated;
        this.lastUpdated = lastUpdated;
        this.offerSendDate = offerSendDate;
        this.complexDetailsVerificationStatus = complexDetailsVerificationStatus;
        this.houseDetailsVerificationStatus = houseDetailsVerificationStatus;
        this.stdFittingsStatus = stdFittingsStatus;
        this.repairQuoteAcceptanceStatus = repairQuoteAcceptanceStatus;
        this.commercialTermsAcceptanceStatus = commercialTermsAcceptanceStatus;
        this.agreementTermsAcceptanceStatus = agreementTermsAcceptanceStatus;
        this.currentOccupancyType = currentOccupancyType;
        this.physicalVerificationPOCType = physicalVerificationPOCType;
        this.physicalVerificationPOC = physicalVerificationPOC;
        this.rsdAcceptanceStatus = rsdAcceptanceStatus;
        this.rentStartDate = rentStartDate;
        this.checkoutRecipientType = checkoutRecipientType;
        this.checkoutRecipientId = checkoutRecipientId;
        this.mainDoorKeyHandoverDate = mainDoorKeyHandoverDate;
        this.wholeFlatKeyHandoverDate = wholeFlatKeyHandoverDate;
        this.vacancyStartDate = vacancyStartDate;
        this.willResidentCooperateForSiteVisit = willResidentCooperateForSiteVisit;
        this.phyVerificationSlotStart = phyVerificationSlotStart;
        this.metadata = metadata;
        this.ownerCheckoutStatus = ownerCheckoutStatus;
        this.context = context;
    }

    public OwnerCheckout(String checkoutId, String acquisitionId, String housingComplexId, String offerId, String startStep, String maxStepCompleted, String latestStepCompleted, String minStepAllowed, String maxStepAllowed, String flatNumber, String checkoutEmail, String houseDetailsVerificationStatus, String stdFittingsStatus, String repairQuoteAcceptanceStatus, String commercialTermsAcceptanceStatus, String agreementTermsAcceptanceStatus, String complexDetailsVerificationStatus, String rsdAcceptanceStatus, OwnerCheckoutStatus ownerCheckoutStatus,OwnerCheckoutContext context) {
        this.checkoutId = checkoutId;
        this.acquisitionId = acquisitionId;
        this.housingComplexId = housingComplexId;
        this.offerId = offerId;
        this.startStep = startStep;
        this.maxStepCompleted = maxStepCompleted;
        this.latestStepCompleted = latestStepCompleted;
        this.minStepAllowed = minStepAllowed;
        this.maxStepAllowed = maxStepAllowed;
        this.flatNumber = flatNumber;
        this.checkoutEmail = checkoutEmail;
        this.houseDetailsVerificationStatus = houseDetailsVerificationStatus;
        this.stdFittingsStatus = stdFittingsStatus;
        this.repairQuoteAcceptanceStatus = repairQuoteAcceptanceStatus;
        this.commercialTermsAcceptanceStatus = commercialTermsAcceptanceStatus;
        this.agreementTermsAcceptanceStatus = agreementTermsAcceptanceStatus;
        this.complexDetailsVerificationStatus = complexDetailsVerificationStatus;
        this.rsdAcceptanceStatus = rsdAcceptanceStatus;
        this.ownerCheckoutStatus = ownerCheckoutStatus;
        this.context = context;
    }



    public OwnerCheckout() {
    }

    public OwnerCheckout(OwnerCheckout other) {
        this.checkoutId = other.checkoutId;
        this.acquisitionId = other.acquisitionId;
        this.housingComplexId = other.housingComplexId;
        this.offerId = other.offerId;
        this.startStep = other.startStep;
        this.maxStepCompleted = other.maxStepCompleted;
        this.latestStepCompleted = other.latestStepCompleted;
        this.minStepAllowed = other.minStepAllowed;
        this.maxStepAllowed = other.maxStepAllowed;
        this.checkoutEmail = other.checkoutEmail;
        this.firstUpdated = other.firstUpdated;
        this.lastUpdated = other.lastUpdated;
        this.offerSendDate = other.offerSendDate;
        this.complexDetailsVerificationStatus = other.complexDetailsVerificationStatus;
        this.houseDetailsVerificationStatus = other.houseDetailsVerificationStatus;
        this.stdFittingsStatus = other.stdFittingsStatus;
        this.repairQuoteAcceptanceStatus = other.repairQuoteAcceptanceStatus;
        this.commercialTermsAcceptanceStatus = other.commercialTermsAcceptanceStatus;
        this.agreementTermsAcceptanceStatus = other.agreementTermsAcceptanceStatus;
        this.currentOccupancyType = other.currentOccupancyType;
        this.physicalVerificationPOCType = other.physicalVerificationPOCType;
        this.physicalVerificationPOC = other.physicalVerificationPOC;
        this.rsdAcceptanceStatus = other.rsdAcceptanceStatus;
        this.rentStartDate = other.rentStartDate;
        this.checkoutRecipientType = other.checkoutRecipientType;
        this.checkoutRecipientId = other.checkoutRecipientId;
        this.mainDoorKeyHandoverDate = other.mainDoorKeyHandoverDate;
        this.wholeFlatKeyHandoverDate = other.wholeFlatKeyHandoverDate;
        this.vacancyStartDate = other.vacancyStartDate;
        this.willResidentCooperateForSiteVisit = other.willResidentCooperateForSiteVisit;
        this.phyVerificationSlotStart = other.phyVerificationSlotStart;
        this.metadata = other.metadata;
        this.ownerCheckoutStatus = other.ownerCheckoutStatus;
        this.context = other.context;
    }

    public OwnerCheckoutContext getContext() {
        return context;
    }

    public void setContext(OwnerCheckoutContext context) {
        this.context = context;
    }

    public String getCheckoutId() {
        return checkoutId;
    }

    public void setCheckoutId(String checkoutId) {
        this.checkoutId = checkoutId;
    }

    public String getAcquisitionId() {
        return acquisitionId;
    }

    public void setAcquisitionId(String acquisitionId) {
        this.acquisitionId = acquisitionId;
    }

    public String getHousingComplexId() {
        return housingComplexId;
    }

    public void setHousingComplexId(String housingComplexId) {
        this.housingComplexId = housingComplexId;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getCheckoutEmail() {
        return checkoutEmail;
    }

    public void setCheckoutEmail(String checkoutEmail) {
        this.checkoutEmail = checkoutEmail;
    }

    public Date getFirstUpdated() {
        return firstUpdated;
    }

    public void setFirstUpdated(Date firstUpdated) {
        this.firstUpdated = firstUpdated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Date getOfferSendDate() {
        return offerSendDate;
    }

    public void setOfferSendDate(Date offerSendDate) {
        this.offerSendDate = offerSendDate;
    }

    public String getMaxStepCompleted() {
        return maxStepCompleted;
    }

    public void setMaxStepCompleted(String maxStepCompleted) {
        this.maxStepCompleted = maxStepCompleted;
    }

    public String getLatestStepCompleted() {
        return latestStepCompleted;
    }

    public void setLatestStepCompleted(String latestStepCompleted) {
        this.latestStepCompleted = latestStepCompleted;
    }

    public String getStdFittingsStatus() {
        return stdFittingsStatus;
    }

    public void setStdFittingsStatus(String stdFittingsStatus) {
        this.stdFittingsStatus = stdFittingsStatus;
    }

    public String getMinStepAllowed() {
        return minStepAllowed;
    }

    public void setMinStepAllowed(String minStepAllowed) {
        this.minStepAllowed = minStepAllowed;
    }

    public String getMaxStepAllowed() {
        return maxStepAllowed;
    }

    public void setMaxStepAllowed(String maxStepAllowed) {
        this.maxStepAllowed = maxStepAllowed;
    }

    public String getStartStep() {
        return startStep;
    }

    public void setStartStep(String startStep) {
        this.startStep = startStep;
    }

    public String getComplexDetailsVerificationStatus() {
        return complexDetailsVerificationStatus;
    }

    public void setComplexDetailsVerificationStatus(String complexDetailsVerificationStatus) {
        this.complexDetailsVerificationStatus = complexDetailsVerificationStatus;
    }

    public String getHouseDetailsVerificationStatus() {
        return houseDetailsVerificationStatus;
    }

    public void setHouseDetailsVerificationStatus(String houseDetailsVerificationStatus) {
        this.houseDetailsVerificationStatus = houseDetailsVerificationStatus;
    }

    public String getCommercialTermsAcceptanceStatus() {
        return commercialTermsAcceptanceStatus;
    }

    public void setCommercialTermsAcceptanceStatus(String commercialTermsAcceptanceStatus) {
        this.commercialTermsAcceptanceStatus = commercialTermsAcceptanceStatus;
    }

    public String getAgreementTermsAcceptanceStatus() {
        return agreementTermsAcceptanceStatus;
    }

    public void setAgreementTermsAcceptanceStatus(String agreementTermsAcceptanceStatus) {
        this.agreementTermsAcceptanceStatus = agreementTermsAcceptanceStatus;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getRepairQuoteAcceptanceStatus() {
        return repairQuoteAcceptanceStatus;
    }

    public void setRepairQuoteAcceptanceStatus(String repairQuoteAcceptanceStatus) {
        this.repairQuoteAcceptanceStatus = repairQuoteAcceptanceStatus;
    }

    public String getRsdAcceptanceStatus() {
        return rsdAcceptanceStatus;
    }

    public void setRsdAcceptanceStatus(String rsdAcceptanceStatus) {
        this.rsdAcceptanceStatus = rsdAcceptanceStatus;
    }

    public Date getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(Date rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public OccupancyType getCurrentOccupancyType() {
        return currentOccupancyType;
    }

    public void setCurrentOccupancyType(OccupancyType currentOccupancyType) {
        this.currentOccupancyType = currentOccupancyType;
    }

    public String getPhysicalVerificationPOCType() {
        return physicalVerificationPOCType;
    }

    public void setPhysicalVerificationPOCType(String physicalVerificationPOCType) {
        this.physicalVerificationPOCType = physicalVerificationPOCType;
    }

    public Person getPhysicalVerificationPOC() {
        return physicalVerificationPOC;
    }

    public void setPhysicalVerificationPOC(Person physicalVerificationPOC) {
        this.physicalVerificationPOC = physicalVerificationPOC;
    }

    public OwnerCheckoutRecipientType getCheckoutRecipientType() {
        return checkoutRecipientType;
    }

    public void setCheckoutRecipientType(OwnerCheckoutRecipientType checkoutRecipientType) {
        this.checkoutRecipientType = checkoutRecipientType;
    }

    public String getCheckoutRecipientId() {
        return checkoutRecipientId;
    }

    public void setCheckoutRecipientId(String checkoutRecipientId) {
        this.checkoutRecipientId = checkoutRecipientId;
    }

    public Date getMainDoorKeyHandoverDate() {
        return mainDoorKeyHandoverDate;
    }

    public void setMainDoorKeyHandoverDate(Date mainDoorKeyHandoverDate) {
        this.mainDoorKeyHandoverDate = mainDoorKeyHandoverDate;
    }

    public Date getWholeFlatKeyHandoverDate() {
        return wholeFlatKeyHandoverDate;
    }

    public void setWholeFlatKeyHandoverDate(Date wholeFlatKeyHandoverDate) {
        this.wholeFlatKeyHandoverDate = wholeFlatKeyHandoverDate;
    }

    public Date getVacancyStartDate() {
        return vacancyStartDate;
    }

    public void setVacancyStartDate(Date vacancyStartDate) {
        this.vacancyStartDate = vacancyStartDate;
    }

    public boolean getWillResidentCooperateForSiteVisit() {
        return willResidentCooperateForSiteVisit;
    }

    public void setWillResidentCooperateForSiteVisit(boolean willResidentCooperateForSiteVisit) {
        this.willResidentCooperateForSiteVisit = willResidentCooperateForSiteVisit;
    }

    public Date getPhyVerificationSlotStart() {
        return phyVerificationSlotStart;
    }

    public void setPhyVerificationSlotStart(Date phyVerificationSlotStart) {

        this.phyVerificationSlotStart = phyVerificationSlotStart;
    }

    public String getPocName() {
        if(physicalVerificationPOC == null) {
            return null;
        }
        return physicalVerificationPOC.getName();
    }

    public String getPocEmail() {
        if(physicalVerificationPOC == null) {
            return null;
        }
        return physicalVerificationPOC.getEmail();
    }

    public String getPocPhone() {
        if(physicalVerificationPOC == null) {
            return null;
        }
        return physicalVerificationPOC.getPhone();
    }

    public OwnerCheckoutStatus getOwnerCheckoutStatus() {
        return ownerCheckoutStatus;
    }

    public void setOwnerCheckoutStatus(OwnerCheckoutStatus ownerCheckoutStatus) {
        this.ownerCheckoutStatus = ownerCheckoutStatus;
    }

    @Override
    public String toString() {
        return "OwnerCheckout{" +
                "checkoutId='" + checkoutId + '\'' +
                ", acquisitionId='" + acquisitionId + '\'' +
                ", offerId='" + offerId + '\'' +
                ", startStep=" + startStep +
                ", maxStepCompleted=" + maxStepCompleted +
                ", latestStepCompleted=" + latestStepCompleted +
                ", minStepAllowed=" + minStepAllowed +
                ", maxStepAllowed=" + maxStepAllowed +
                ", firstUpdated=" + firstUpdated +
                ", lastUpdated=" + lastUpdated +
                ", offerSendDate=" + offerSendDate +
                ", complexDetailsVerificationStatus='" + complexDetailsVerificationStatus + '\'' +
                ", houseDetailsVerificationStatus='" + houseDetailsVerificationStatus + '\'' +
                ", stdFittingsStatus='" + stdFittingsStatus + '\'' +
                ", repairQuoteAcceptanceStatus='" + repairQuoteAcceptanceStatus + '\'' +
                ", commercialTermsAcceptanceStatus='" + commercialTermsAcceptanceStatus + '\'' +
                ", agreementTermsAcceptanceStatus='" + agreementTermsAcceptanceStatus + '\'' +
                ", currentOccupancyType=" + currentOccupancyType +
                ", physicalVerificationPOCType='" + physicalVerificationPOCType + '\'' +
                ", physicalVerificationPOC=" + physicalVerificationPOC +
                ", rsdAcceptanceStatus='" + rsdAcceptanceStatus + '\'' +
                ", rentStartDate=" + rentStartDate +
                ", checkoutRecipientType=" + checkoutRecipientType +
                ", checkoutRecipientId='" + checkoutRecipientId + '\'' +
                ", mainDoorKeyHandoverDate=" + mainDoorKeyHandoverDate +
                ", wholeFlatKeyHandoverDate=" + wholeFlatKeyHandoverDate +
                ", vacancyStartDate=" + vacancyStartDate +
                ", willResidentCooperateForSiteVisit=" + willResidentCooperateForSiteVisit +
                ", phyVerificationSlotStart=" + phyVerificationSlotStart +
                ", metadata='" + metadata + '\'' +
                ", ownerCheckoutStatus=" + ownerCheckoutStatus +
                ", context=" + context +
                '}';
    }
}


