package Methods;

public class MethodsJava {
    static void display(int age){
        //code
        if(age <= 18){
            System.out.println("Access Denied : You are younger");
        }
        else {
            System.out.println("Access granted : You are Older");
        }
    }

    public static void main(String[] args) {
        //calling method

        display(19);
    }
}
