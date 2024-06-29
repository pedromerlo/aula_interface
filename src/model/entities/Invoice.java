package model.entities;

public class Invoice {
    private Double basciPaymente;
    private Double tax;
    public Invoice() {
    }
    public Invoice(Double basciPaymente, Double tax) {
        this.basciPaymente = basciPaymente;
        this.tax = tax;
    }
    public Double getBasciPaymente() {
        return basciPaymente;
    }
    public void setBasciPaymente(Double basciPaymente) {
        this.basciPaymente = basciPaymente;
    }
    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }
    
    public Double getTotalPayment(){
        return getBasciPaymente() + getTax();
    }
}
