package OOPS.Ineritance.Herarichial;

public class BoxPrice extends Box{

    int cost;

    BoxPrice(int cost){
        super();
        this.cost = cost;
    }

    BoxPrice(int side , int cost){
        this.l = side;
        this.w = side;
        this.h = side;
        this.cost = cost;

    }

    BoxPrice(int l, int w , int h , int cost){
        this.l = l;
        this.w = w;
        this.h = h;
        this.cost = cost;
    }
}

