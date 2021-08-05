package pavan.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    double price;
    public Product(int id,String name,double price){

        this.id=id;
        this.name=name;
        this.price=price;
    }
}

public class Stream_Constructor {
    public static void main(String[] args) {

        List<Product>productList = new ArrayList<Product>();

        productList.add(new Product(1,"HP laptop",2500));
        productList.add(new Product(2,"Dell laptop",2000));
        productList.add(new Product(3,"Lenova laptop",3500));
        productList.add(new Product(1,"Sony laptop",4000));

       productList.stream()
               .filter(each->each.price > 2600)//filtering
               .forEach(pr-> System.out.println(pr.price)); //iterating
    }
}
