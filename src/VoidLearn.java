public class VoidLearn {

    static int myMethod(int x ,int y){
        return x + 5 + y;
    }


    //void is used when Method is not returning anything
    public static void main(String[] args) {
        int z = myMethod(3,8);
        System.out.println(z);
    }
}
