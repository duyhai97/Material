import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public CrispyFlour(int quantity) {
//        this.quantity = quantity;
//    }

    public CrispyFlour(int id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }




    @Override
    double getAmount() {
        return quantity * getCost();

    }

    @Override
    LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        return getAmount();
    }

}
