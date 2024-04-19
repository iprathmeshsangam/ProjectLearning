package OOPS.InheritanceTwo;

public class Car {

    String Type;
    String Color;
    double Power;


    Car(){
        this.Type = "Sedan";
        this.Color = "Black";
        this.Power = 116.78;
    }

    Car(String Type , String Color, double Power){
        this.Type = Type;
        this.Color = Color;
        this.Power = Power;
    }

    public  void Information(){
        System.out.println("These are the Information of the car");
    }
}
