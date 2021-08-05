package pavan;

public class SwappingNumberExample {
    public static void main(String[] args) {

        //version
        int a = 10;
        int b = 20;
        int temp=0;
        System.out.println("before swapping a= " +a +" b= "+ b);
        temp = a;
        a=b;
        b=temp;
        System.out.println("after swapping a= " +a +" b= "+ b);

        //version 2
        a= a +b;
        b=a+b;
        a= a-b;

        //version 3
        //here a  or b should not be  ZERO  0

        a=a*b;
        b=a/b;
        a=a/b;

        //VERSION 4
        // BITWISE XOR  ^
        a=a^b;
        b=a^b;
        a=a^b;

        //version 5  Single statement
        b = a + b - (a=b);
        System.out.println("after swapping a= " +a + " b=  " +b);
    }
}
