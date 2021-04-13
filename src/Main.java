import java.time.LocalDate;
import java.time.Month;

public class Main {


    public static void main(String[] args) {
        Material[] material = new Material[10];
        material[0] = new CrispyFlour(1, "i",LocalDate.of(2020, Month.JANUARY, 10) , 20000, 3 );
        material[1] = new CrispyFlour(1, "t",LocalDate.of(2020, Month.JANUARY, 10) , 25000, 3 );
        material[2] = new CrispyFlour(1, "t",LocalDate.of(2020, Month.JANUARY, 10) , 30000, 3 );
        material[3] = new CrispyFlour(1, "t",LocalDate.of(2020, Month.JANUARY, 10) , 20000, 3 );
        material[4] = new CrispyFlour(1, "t",LocalDate.of(2020, Month.JANUARY, 10) , 30000, 3 );

        material[5] = new Meat(1, "n", LocalDate.of(2021, Month.APRIL, 10), 300000, 2);
        material[6] = new Meat(1, "n", LocalDate.of(2021, Month.APRIL, 10), 300000, 2);
        material[7] = new Meat(1, "n", LocalDate.of(2021, Month.APRIL, 10), 300000, 2);
        material[8] = new Meat(1, "n", LocalDate.of(2021, Month.APRIL, 10), 300000, 2);
        material[9] = new Meat(1, "n", LocalDate.of(2021, Month.APRIL, 10), 300000, 2);

        Manager hai = new Manager(material);

        double sumMeat = 0;
        double sumCrispyFlour = 0;
        for (int i = 0; i < material.length; i++) {
            if (material[i] instanceof Meat) sumMeat += hai.discountMeat();
            else sumCrispyFlour += hai.discountCrispyFlour();
        }

        System.out.println(hai.discountCrispyFlour());
    }
}
