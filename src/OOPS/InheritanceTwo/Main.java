package OOPS.InheritanceTwo;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("SUV" , "Black",116.0);
        Car car2 = new Car("Sedan", "Red",116.78);
        BWM car3 = new BWM("Luxury","Grey",150.67,"BMW");
//        System.out.println("These are the properties of a car : " + car1.Type + " " + car1.Power + " " + car1.Color);
        System.out.println(car1.Color);
        System.out.println("These are the properties of Car2 : " + car2.Color + " " + car2.Type + " " + car2.Power);
        System.out.println(car3.Color + " " + car3.Type);
        System.out.println(car3.Color);

    }
}
