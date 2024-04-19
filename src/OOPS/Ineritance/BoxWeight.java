package OOPS.Ineritance;

//Box Weight class is a Child class of Parent/Base class Box
public class BoxWeight extends  Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side); //What is Super? // Call the parent class constructor
        //Super() is an Object Class
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        //Used to call all the parameters from the parent class
        //Used to initiate Values present class
        this.weight = weight;
    }

    public  void Information(){
        System.out.println(this.weight);
    }



    //Use case of Super()
    //
    //Auto generated Constructor
}
