package pavan.iteratorExamples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveAhmed {
    public static void main(String[] args) {

        List<String> listNames =Arrays.asList("Ahmed","Arif","John","Ahmed","Sasha","Bob","Ahmed");
        removeAhmed(listNames);
    }
    public static void removeAhmed(List<String> names){

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String word = it.next();
            if(word.equals("Ahmed")){
                it.remove();
            }
        }
        System.out.println(names);
    }
}
