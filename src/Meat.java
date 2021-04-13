import java.time.LocalDate;

public class Meat extends Material implements Discount{
    public double weight;

    public Meat(int id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    double getAmount() {
        return getCost() * weight;
    }
    @Override
    LocalDate getExpiryDate() {
        return getManufacturingDate() ;
    }


    @Override
    public double getRealMoney() {
        return getAmount();
    }
}
