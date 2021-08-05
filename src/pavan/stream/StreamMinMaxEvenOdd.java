package pavan.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMinMaxEvenOdd {
    public static void main(String[] args) {
        List<Integer>num = Arrays.asList(4,8,9,7,6,2,3,5,4,12);

        //count even odd
        long num1 = num.stream().filter(n->n%2==0).count();
        System.out.println(num1);

        long num2= num.stream().filter(n->n%3==0).count();
        System.out.println(num2);


        //min max


        List<String>stringList = Arrays.asList("A","B","C","1","2","3");
       Object arr[] =  stringList.stream().toArray();
        System.out.println(arr.length);
        for(Object things : arr){
            System.out.print(things +" ");
        }
    }
}
