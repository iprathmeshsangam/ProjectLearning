package OOPS.Ineritance;

public class Main {

    public static void main(String[] args) {
//        Box box = new Box(4.0,9.0,6.0);
//        System.out.println(box.l + " "+ box.h + " "+ box.w);
////        System.out.println();
////        System.out.println(());

        Box myBox = new BoxWeight(1,2,3,4);
        double Area = myBox.l * myBox.h * myBox.w;
        System.out.println("Area of a Box is " + Area);
    }


}
