class Main{
    public static void main(String[] args) {
       int [] nums = {1,2,3,4,5,6,7,8,9,0};

       //multi Dimensinal Array

        int [][] myNumbers  = {{1,2,3} , {4,5,6,}};
        System.out.println("This is a number" +     " " + myNumbers[1][0]);
       for(int i : nums){
           System.out.println(i*2);
       }
    }
}