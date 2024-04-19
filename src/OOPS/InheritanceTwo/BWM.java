package OOPS.InheritanceTwo;

public class BWM extends  Car{
    String CoName = "BMW";


    BWM(){
        this.CoName = "BMW";
    }

    BWM (String Type, String Color, double Power , String CoName){
        super(Type,Color,Power);
        this.CoName = CoName;
    }
}
