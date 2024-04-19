package OOPS.Ineritance.Herarichial;

public class Main {
    public static void main(String[] args) {
        Box square  = new Box(3, 4,7);
        BoxColor colorSquare = new BoxColor(3,"Black");
        BoxColor colorSquare2 = new BoxColor(10,21,38,"Yellow");
        int Area = colorSquare2.w * colorSquare2.l * colorSquare2.h;
        System.out.println("This new box is " + colorSquare2.Color + " in color and has a Area of " + Area);
//        System.out.println(square.l + " " + square.w + " " + square.h);
    }
}
