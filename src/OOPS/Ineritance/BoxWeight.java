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
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        //Used to call all the parameters from the parent class
        //Used to initiate Values present class
        this.weight = weight;
    }

    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }


    //Auto generated Constructor
}
