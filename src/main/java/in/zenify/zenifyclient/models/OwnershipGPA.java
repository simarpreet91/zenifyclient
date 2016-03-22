package in.zenify.zenifyclient.models;

import java.util.Date;

/**
 * Created by tanay on 03/07/15.
 */
public class OwnershipGPA extends Person{

    private String gpaId;
    private String relationWithOwner;
    private String profession;
    private String company;
    private String verificationStatus;
    private String emailSubscriptionType;
    private String smsSubscriptionType;
    private String metadata;
    private String selfRefId;
    private boolean linkedWithAgreement;

    public OwnershipGPA(Person other) {
        super(other);
    }

    public OwnershipGPA() {
    }

    public OwnershipGPA(String firstName, String primaryEmail, String secondaryEmail, String address,String primaryPhone, String secondaryPhone, String sex, Date dob,String gpaId, String relationWithOwner, String profession, String company, String verificationStatus, String emailSubscriptionType, String smsSubscriptionType, String metadata,String selfRefId,boolean linkedWithAgreement) {
        super(firstName, primaryEmail, secondaryEmail, address,primaryPhone, secondaryPhone, sex,dob);
        this.gpaId = gpaId;
        this.relationWithOwner = relationWithOwner;
        this.profession = profession;
        this.company = company;
        this.verificationStatus = verificationStatus;
        this.emailSubscriptionType = emailSubscriptionType;
        this.smsSubscriptionType = smsSubscriptionType;
        this.metadata = metadata;
        this.selfRefId = selfRefId;
        this.linkedWithAgreement = linkedWithAgreement;
    }

    public String getGpaId() {
        return gpaId;
    }

    public void setGpaId(String gpaId) {
        this.gpaId = gpaId;
    }

    public String getRelationWithOwner() {
        return relationWithOwner;
    }

    public void setRelationWithOwner(String relationWithOwner) {
        this.relationWithOwner = relationWithOwner;
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
}
