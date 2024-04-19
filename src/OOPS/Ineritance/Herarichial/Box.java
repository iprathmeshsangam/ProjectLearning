package OOPS.Ineritance.Herarichial;

public class Box {
    int l;
    int w;
    int h;

    Box(){
        this.l = 0;
        this.w = 1;
        this.h = 2;
    }

    Box(int side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(int l , int w, int h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    
}
