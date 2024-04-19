package OOPS.Ineritance;

public class BoXPrice extends BoxWeight {

    int price;

    BoXPrice(){
        super();
        this.price = 35000;
    }

    BoXPrice(double l, double h , double w , double weight , int price){
        super(l,h,w,weight);
        this.price = price;
    }

    BoXPrice(double side , double weight , int price){
        super(side, weight);
        this.price = price;
    }


    BoXPrice(BoXPrice other){
        this.price = other.price;
        this.w = other.w;
        this.h = other.h;
        this.l = other.l;
    }
}
