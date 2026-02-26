package sesion13.bt6;

public class Medicine {
    public String drugId;
    public String drugName;
    public double unitPrice;
    public int quantity;
    public Medicine(String drugId, String drugName, double unitPrice, int quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public String getDrugId() {
        return drugId;
    }
    public String getDrugName() {
        return drugName;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotalPrice() {
        return unitPrice * quantity;
    }
    @Override
    public String toString() {
        return String.format("%-10s %-20s %-10.2f %-10d %-10.2f",
                drugId, drugName, unitPrice, quantity, getTotalPrice());
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }
}
