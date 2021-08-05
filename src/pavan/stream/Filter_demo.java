package pavan.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_demo { 
    public static void main(String[] args) {

        ArrayList<Integer> numList =new ArrayList<Integer>();
        numList.add(10);
        numList.add(15);
        numList.add(20);
        numList.add(25);
        numList.add(30);

        List<Integer>numL = Arrays.asList(10,15,26,30);

        List<Integer>evenNumL= new ArrayList<Integer>();

        //without STREAM
//        for (int n  : numL) {
//            if(n % 2==0){
//               evenNumL.add(n);
//            }
//        }
//        System.out.println(evenNumL);
//
//
//        //with STREAM -1
//
//       evenNumL= numL.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println("evenNumL = " + evenNumL);
//
//        //with STREAM -2
//        numL.stream().filter(m->m%2==0).forEach(m-> System.out.print(m + " "));

        //with STREAM -3
        numL.stream().filter(m->m%2==0).forEach(System.out::print);
    }
}
