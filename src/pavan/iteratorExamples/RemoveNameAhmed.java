package pavan.iteratorExamples;


import java.util.Arrays;
import java.util.List;

public class RemoveNameAhmed {

    public static void main(String[] args) {

        List<String> names = (Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeNameAhmed(names));
        // name.stream().filter(n->n.equals("Ahmed")).forEach(n-> System.out.println(n));


        // System.out.println(Arrays.asList(removeNameAhmed(name)));
    }

    public static List<String> removeNameAhmed(List<String> names) {

        names.removeIf(each -> each.equals("Ahmed"));
        return names;
    }
}
