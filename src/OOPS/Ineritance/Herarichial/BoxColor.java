package OOPS.Ineritance.Herarichial;

public class BoxColor extends Box{
    String Color;

    BoxColor(){
        super();
        this.Color = "Red";
    }

    BoxColor(int side , String color){
        this.l = side;
        this.h = side;
        this.w = side;
        this.Color = color;
    }

    BoxColor(int l , int w, int h , String color){
        this.l = l;
        this.w = w;
        this.h = h;
        this.Color = color;
    }


}
