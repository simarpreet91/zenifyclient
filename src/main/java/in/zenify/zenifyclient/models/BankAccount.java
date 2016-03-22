package in.zenify.zenifyclient.models;

/**
 * Created by tanay on 09/07/15.
 */
public class BankAccount {

    private String accountId;
    private String refId;
    private String refType;
    private String bankName;
    private String accountNo;
    private String ifsc;
    private String beneficiary;
    private BankAccountType accType;
    private String agreementId;
    private float rentPercent;
    private float securityDepositPercent;
    
    private String email;
    private String mobileNo;
    private String panNo;
    
    

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public BankAccount() {
    }

    public BankAccount(String accountId, String refId, String refType, String bankName, String accountNo, String ifsc, String beneficiary, BankAccountType accType, String agreementId, float rentPercent, float securityDepositPercent) {
        this.accountId = accountId;
        this.refId = refId;
        this.refType = refType;
        this.bankName = bankName;
        this.accountNo = accountNo;
        this.ifsc = ifsc;
        this.beneficiary = beneficiary;
        this.accType = accType;
        this.agreementId = agreementId;
        this.rentPercent = rentPercent;
        this.securityDepositPercent = securityDepositPercent;
    }

    public BankAccount(float rentPercent, float securityDepositPercent) {
        this.rentPercent = rentPercent;
        this.securityDepositPercent = securityDepositPercent;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public BankAccountType getAccType() {
        return accType;
    }

    public void setAccType(BankAccountType accType) {
        this.accType = accType;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public float getRentPercent() {
        return rentPercent;
    }

    public void setRentPercent(float rentPercent) {
        this.rentPercent = rentPercent;
    }

    public float getSecurityDepositPercent() {
        return securityDepositPercent;
    }

    public void setSecurityDepositPercent(float securityDepositPercent) {
        this.securityDepositPercent = securityDepositPercent;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;

        BankAccount that = (BankAccount) o;

        if (Float.compare(that.rentPercent, rentPercent) != 0) return false;
        if (Float.compare(that.securityDepositPercent, securityDepositPercent) != 0) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (refId != null ? !refId.equals(that.refId) : that.refId != null) return false;
        if (refType != null ? !refType.equals(that.refType) : that.refType != null) return false;
        if (bankName != null ? !bankName.equals(that.bankName) : that.bankName != null) return false;
        if (accountNo != null ? !accountNo.equals(that.accountNo) : that.accountNo != null) return false;
        if (ifsc != null ? !ifsc.equals(that.ifsc) : that.ifsc != null) return false;
        if (beneficiary != null ? !beneficiary.equals(that.beneficiary) : that.beneficiary != null) return false;
        if (accType != null ? !accType.equals(that.accType) : that.accType != null) return false;
        return !(agreementId != null ? !agreementId.equals(that.agreementId) : that.agreementId != null);

    }

    @Override
    public int hashCode() {
        int result = accountId != null ? accountId.hashCode() : 0;
        result = 31 * result + (refId != null ? refId.hashCode() : 0);
        result = 31 * result + (refType != null ? refType.hashCode() : 0);
        result = 31 * result + (bankName != null ? bankName.hashCode() : 0);
        result = 31 * result + (accountNo != null ? accountNo.hashCode() : 0);
        result = 31 * result + (ifsc != null ? ifsc.hashCode() : 0);
        result = 31 * result + (beneficiary != null ? beneficiary.hashCode() : 0);
        result = 31 * result + (accType != null ? accType.hashCode() : 0);
        result = 31 * result + (agreementId != null ? agreementId.hashCode() : 0);
        result = 31 * result + (rentPercent != +0.0f ? Float.floatToIntBits(rentPercent) : 0);
        result = 31 * result + (securityDepositPercent != +0.0f ? Float.floatToIntBits(securityDepositPercent) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", refId='" + refId + '\'' +
                ", refType='" + refType + '\'' +
                ", bankName='" + bankName + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", ifsc='" + ifsc + '\'' +
                ", beneficiary='" + beneficiary + '\'' +
                ", accType='" + accType + '\'' +
                ", agreementId='" + agreementId + '\'' +
                ", rentPercent=" + rentPercent +
                ", securityDepositPercent=" + securityDepositPercent +
                '}';
    }
}
