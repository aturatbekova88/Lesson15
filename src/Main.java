//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //OOP

       Car car  = new Car();
       car.name = "Kia";
       car.model = "KS";
       car.colour = "white";
       car.probeg = 20000;
       car.year = 2024;

       car.drive();

        System.out.println(car.name);
        System.out.println(car.model);
        System.out.println(car.colour);
        System.out.println(car.probeg);
        System.out.println(car.year);

    }
}