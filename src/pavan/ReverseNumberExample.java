package pavan;

import java.util.Scanner;

public class ReverseNumberExample {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");

        int num= scan.nextInt();
        int rev =0;
         //version 1

        while(num!=0){
            rev= rev*10 + rev%10;
            rev = rev / 10;
        }


        //VERSION 3

      //  StringBuffer sb = new StringBuffer(String.valueOf(num));
        //System.out.println(sb.reverse());

    }

}
