package pavan.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMapInteger {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        List<Integer> res = Arrays.asList(4,8,9,7,2);
        res.stream().map(n->n *3 ).forEach(n->System.out.print(n + " "));
    }
}
