package Methods;

public class MethodOverloading {

    //With method overloading, multiple methods can have the same name with different parameters:

    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        int newNumb = plusMethod(8,5);
        double newNumb2 = plusMethod(8.5, 6.5);
        System.out.println("Int : " + newNumb);
        System.out.println("double : " + newNumb2);
    }
}
