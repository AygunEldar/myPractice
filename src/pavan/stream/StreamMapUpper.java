package pavan.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamMapUpper {
    public static void main(String[] args) {
        List<String> car1 = new ArrayList<String>();
        List<String>car2 = Arrays.asList("bus","car","metro","train");

        car1 =  car2.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(car1);
        System.out.println(car2);


        car2.stream().map(n->n.length()).forEach(len-> System.out.println(len));


    }
}
