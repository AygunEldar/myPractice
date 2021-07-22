package pavan;

public class SwappingNumbers {
    public static void main(String[] args) {
        System.out.println(swappingNumbers(3,5));
    }
    public static String swappingNumbers(int a, int b){
//        int c = a;
//        a=b;
//        b=c;
 a = a+b;  //a = 4+8  a=12

 b= a-b;  //b = 12-8  b = 4
 a=a-b;   // a= 12-4   a=8


         return "After swapping a= " +a+ " ,after swapping b = " +b;
    }

}
