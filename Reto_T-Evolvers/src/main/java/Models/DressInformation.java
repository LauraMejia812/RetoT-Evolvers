package Models;

public class DressInformation {
    private String productName;
    private String quantity;

    public DressInformation(String productName, String quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public String getQuantity() {
        return quantity;
    }
}
