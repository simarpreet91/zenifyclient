package in.zenify.zenifyclient.models;

/**
 * Created by tanay on 28/07/15.
 */
public class ProofDocument {

    private String proofId;
    private ProofType proofType;
    private ProofDocumentType documentType;
    private String url;
    private String refId;
    private String verificationStatus;

    public ProofDocument(String proofId, ProofType proofType, ProofDocumentType documentType, String url, String refId, String verificationStatus) {
        this.proofId = proofId;
        this.proofType = proofType;
        this.documentType = documentType;
        this.url = url;
        this.refId = refId;
        this.verificationStatus = verificationStatus;
    }

    public ProofDocument() {
    }

    public void setProofType(ProofType proofType) {
        this.proofType = proofType;
    }

    public ProofDocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(ProofDocumentType documentType) {
        this.documentType = documentType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getProofId() {
        return proofId;
    }

    public void setProofId(String proofId) {
        this.proofId = proofId;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public ProofType getProofType() {
        return proofType;
    }

    @Override
    public String toString() {
        return "ProofDocument{" +
                "proofId='" + proofId + '\'' +
                ", proofType='" + proofType + '\'' +
                ", documentType='" + documentType + '\'' +
                ", url='" + url + '\'' +
                ", verificationStatus='" + verificationStatus + '\'' +
                '}';
    }
}
