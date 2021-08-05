package pavan.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUniqueObj {
    public static void main(String[] args) {

        //stream -> distinct()
       List<String> car = Arrays.asList("car","bus","metro","car","bus");
//       List<String> secondCarList = car.stream().distinct().collect(Collectors.toList());//we collect uniques toa new LIST
//
//        System.out.println(secondCarList);

        car.stream().distinct().forEach(n-> System.out.print(n + " ")); //removes duplicates means keeps in it others

        System.out.println("****************");

        //stream - > count()
        long count = car.stream().distinct().count();
        System.out.println(count);

        System.out.println("$$$$$$$$$$$$$$$$$$$");

        // stream -> limit().collect(Collectors.toList())

        List<String>limited = car.stream().limit(2).collect(Collectors.toList());
        System.out.println(limited);

   // OR
        car.stream().limit(3).forEach(n-> System.out.print(n + " "));


    }
}
