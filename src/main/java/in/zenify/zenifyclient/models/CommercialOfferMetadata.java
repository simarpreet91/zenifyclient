package in.zenify.zenifyclient.models;

/**
 * Created by tanay on 21/07/15.
 */
public class CommercialOfferMetadata {

    private String SDPaymentTerms;

    public CommercialOfferMetadata() {
    }

    public CommercialOfferMetadata(String SDPaymentTerms) {
        this.SDPaymentTerms = SDPaymentTerms;
    }

    public String getSDPaymentTerms() {
        return SDPaymentTerms;
    }

    public void setSDPaymentTerms(String SDPaymentTerms) {
        this.SDPaymentTerms = SDPaymentTerms;
    }

    @Override
    public String toString() {
        return "CommercialOfferMetadata{" +
                "SDPaymentTerms='" + SDPaymentTerms + '\'' +
                '}';
    }
}
