import java.time.LocalDate;

public class Manager {
    Material[] materials;

    public Manager(Material[] materials) {
        this.materials = materials;
    }

    public Material[] getMaterials() {
        return materials;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

    public double discountMeat() {
        double discount = 0;
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] instanceof Meat) {
                if (materials[i].getExpiryDate().isAfter(LocalDate.now().plusDays(5)))
                    discount = materials[i].getAmount() * 0.7;

                else if (materials[i].getExpiryDate().isAfter(LocalDate.now().plusDays(3)))
                    discount = materials[i].getAmount() * 0.5;

                else discount = materials[i].getAmount() * 0.9;
            }
        }
        return discount;
    }

    public double discountCrispyFlour() {
        double discount = 0;
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] instanceof CrispyFlour) {
                if (materials[i].getExpiryDate().isAfter(LocalDate.now().plusMonths(4)))
                    discount = materials[i].getAmount() * 0.8;
                else if (materials[i].getExpiryDate().isAfter(LocalDate.now().plusMonths(2)))
                    discount = materials[i].getAmount() * 0.6;
                else discount = materials[i].getAmount() * 0.95;
            }
        }
        return discount;
    }

    public double totalBeforeDiscount(){
        double total = discountMeat() + discountCrispyFlour();
        return total;
    }

    public double totalDiscount(){
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] instanceof Meat) sum1 += materials[i].getAmount();
            else sum2 = materials[i].getAmount();
        }
        return sum1 + sum2;
    }
}





