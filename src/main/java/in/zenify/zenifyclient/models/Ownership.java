package in.zenify.zenifyclient.models;

import java.util.Date;

/**
 * Created by tanay on 03/07/15.
 */
public class  Ownership extends Person{

    private String ownershipId;
    private String houseId;
    private String profession;
    private String company;
    private String pan;

    private String refSex;
    private String refName;
    private String refRelation;

    private String gpaId;

    private String verificationStatus;
    private String emailSubscriptionType;
    private String smsSubscriptionType;

    private float rentRatio;
    private String metadata;
    private String agreementId;
    private String selfRefId;
    private boolean linkedWithAgreement;

    public Ownership(String firstName, String secondName, String lastName, String primaryEmail, String secondaryEmail, String primaryPhone, String secondaryPhone, String sex, Date dob, String address, String ownershipId, String houseId, String profession, String company, String pan, String refSex, String refName, String refRelation, String gpaId, String verificationStatus, String emailSubscriptionType, String smsSubscriptionType, String metadata,String agreementId,String selfRefId,boolean linkedWithAgreement ) {
        super(firstName, secondName, lastName, primaryEmail, secondaryEmail, primaryPhone, secondaryPhone, sex, dob, address);
        this.ownershipId = ownershipId;
        this.houseId = houseId;
        this.profession = profession;
        this.company = company;
        this.pan = pan;
        this.refSex = refSex;
        this.refName = refName;
        this.refRelation = refRelation;
        this.gpaId = gpaId;
        this.verificationStatus = verificationStatus;
        this.emailSubscriptionType = emailSubscriptionType;
        this.smsSubscriptionType = smsSubscriptionType;
        this.metadata = metadata;
        this.agreementId = agreementId;
        this.selfRefId = selfRefId;
        this.linkedWithAgreement = linkedWithAgreement;
    }

    public Ownership(Person other) {
        super(other);
    }

    public Ownership(Ownership other) {
        super(other);
        this.ownershipId = other.ownershipId;
        this.houseId = other.houseId;
        this.profession = other.profession;
        this.company = other.company;
        this.pan = other.pan;
        this.refSex = other.refSex;
        this.refName = other.refName;
        this.refRelation = other.refRelation;
        this.gpaId = other.gpaId;
        this.verificationStatus = other.verificationStatus;
        this.emailSubscriptionType = other.emailSubscriptionType;
        this.smsSubscriptionType = other.smsSubscriptionType;
        this.rentRatio = other.rentRatio;
        this.metadata = other.metadata;
        this.agreementId = other.agreementId;
        this.selfRefId = other.selfRefId;
        this.linkedWithAgreement = other.linkedWithAgreement;
    }

    public Ownership() {
    }

    public String getOwnershipId() {
        return ownershipId;
    }

    public void setOwnershipId(String ownershipId) {
        this.ownershipId = ownershipId;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getRefSex() {
        return refSex;
    }

    public void setRefSex(String refSex) {
        this.refSex = refSex;
    }

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public String getRefRelation() {
        return refRelation;
    }

    public void setRefRelation(String refRelation) {
        this.refRelation = refRelation;
    }

    public String getGpaId() {
        return gpaId;
    }

    public void setGpaId(String gpaId) {
        this.gpaId = gpaId;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getEmailSubscriptionType() {
        return emailSubscriptionType;
    }

    public void setEmailSubscriptionType(String emailSubscriptionType) {
        this.emailSubscriptionType = emailSubscriptionType;
    }

    public String getSmsSubscriptionType() {
        return smsSubscriptionType;
    }

    public void setSmsSubscriptionType(String smsSubscriptionType) {
        this.smsSubscriptionType = smsSubscriptionType;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getSelfRefId() {
        return selfRefId;
    }

    public void setSelfRefId(String selfRefId) {
        this.selfRefId = selfRefId;
    }

    public boolean isLinkedWithAgreement() {
        return linkedWithAgreement;
    }

    public void setLinkedWithAgreement(boolean linkedWithAgreement) {
        this.linkedWithAgreement = linkedWithAgreement;
    }

    @Override
    public String toString() {
        return "Ownership{" +
                "ownershipId='" + ownershipId + '\'' +
                ", houseId='" + houseId + '\'' +
                ", profession='" + profession + '\'' +
                ", company='" + company + '\'' +
                ", pan='" + pan + '\'' +
                ", refSex='" + refSex + '\'' +
                ", refName='" + refName + '\'' +
                ", refRelation='" + refRelation + '\'' +
                ", gpaId='" + gpaId + '\'' +
                ", verificationStatus='" + verificationStatus + '\'' +
                ", emailSubscriptionType='" + emailSubscriptionType + '\'' +
                ", smsSubscriptionType='" + smsSubscriptionType + '\'' +
                ", rentRatio=" + rentRatio +
                ", metadata='" + metadata + '\'' +
                ", agreementId='" + agreementId + '\'' +
                ", selfRefId='" + selfRefId + '\'' +
                ", linkedWithAgreement=" + linkedWithAgreement +
                '}' +
                super.toString();
    }
}
