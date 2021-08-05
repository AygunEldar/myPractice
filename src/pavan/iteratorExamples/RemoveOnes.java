package pavan.iteratorExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveOnes {
    public static void main(String[] args) {

        List<Integer> listNum = new ArrayList<>();
        listNum.addAll(Arrays.asList(1,1,1,2,3,5,1,4,1,8,9,1,1,7));
        Iterator<Integer> it = listNum.iterator();
        while (it.hasNext()){
            int num =it.next();
            if(num == 1 ){
                it.remove();
            }

        }
        System.out.println(listNum);

        System.out.println("*********************");


        List<String> listNames = new ArrayList<>();
        listNames.addAll(Arrays.asList("Ahmed","Ali","Arif","Edo","Ahmed","Azik","Ahmed"));
        Iterator<String> itName = listNames.iterator();
        while (itName.hasNext()){
            String word =itName.next();
            if(word.equals("Ahmed") ){
                itName.remove();
            }

        }
        System.out.println(listNames);

    }

}
