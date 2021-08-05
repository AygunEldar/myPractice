package pavan.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterRemoveNulls {
    public static void main(String[] args) {

        List<String> words1 = Arrays.asList("cup",null,"forest","sky","book",null,"theatre");
        
        List<String>words2 =new ArrayList<String>();
        
       words2 = words1.stream().filter(n->n != null).collect(Collectors.toList());
        System.out.println("words2 = " + words2);
    }
}
