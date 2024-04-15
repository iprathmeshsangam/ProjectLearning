
//this is a class
class Main{


    //This is a Method
    public static void main(String[] args) {
       int [] nums = {1,2,3,4,5,6,7,8,9,0};

       //multi Dimensinal Array
        int [][] nums2 = {{1,2,3,},{4,5,6}};
        for (int i = 0 ; i < nums2.length ; i++){
            for (int j = 0 ; j < nums2[i].length; j++){
                System.out.println(nums2[i][j]);
            }
        }

        String [] names = {"Prathmesh","Pragati","Pratiksha"};
        for (int i = 0; i < names.length ; i++){
            System.out.println(names[i]);
        }
    }
}