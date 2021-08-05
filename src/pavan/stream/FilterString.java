package pavan.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Ali","Veli","Azer","Elgun","Edo");

        List<String>longNames = new ArrayList<String>();

        // 1 version

//      longNames =  names.stream().filter(n->n.length()>2 && n.length() <5 ) .collect(Collectors.toList());
//
//        System.out.println(longNames);

        //2 VERSION

     //   names.stream().filter(n->n.length()>2 && n.length() <5).forEach(n-> System.out.println(n));

        //  3 VERSION

        names.stream().filter(n->n.length() > 2 && n.length() < 5).forEach(System.out::println);
    }
}
