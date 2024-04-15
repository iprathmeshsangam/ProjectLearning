public class AgeChecker {
    static void CheckAge(int age){
        if(age < 18){
            System.out.println("Access Denied: You cannot access the floor");
        }
        else {
            System.out.println("Access Granted : You are old enough");
        }
    }

    public static void main(String[] args) {
        CheckAge(17);
        CheckAge(18);
        CheckAge(20);
        CheckAge(15);
    }

}
