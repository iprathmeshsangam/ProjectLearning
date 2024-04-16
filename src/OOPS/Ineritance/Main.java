package OOPS.Ineritance;

public class Main {

    public static void main(String[] args) {
//        Box box = new Box(4.0,9.0,6.0);
//        System.out.println(box.l + " "+ box.h + " "+ box.w);
////        System.out.println();
////        System.out.println(());

        BoxWeight myBox = new BoxWeight(4,5,6,7);
        double Area = myBox.h * myBox.w * myBox.l;
        System.out.println("Area of the box is " + Area + " The weight of myBox is " + myBox.weight);
    }


}
