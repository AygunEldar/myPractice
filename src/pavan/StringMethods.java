package pavan;

public class StringMethods {
    public static void main(String[] args) {

        //length()
        String word = "Welcome";
        System.out.println(word.length());

        //concat()
        String a = "Welcome to ";
        String b = "training";
        System.out.println(a+ b);
        System.out.println(a.concat(b));

        System.out.println("welcome to " + "training");
        System.out.println(("Welcome to ".concat(" new training")));

        //equals

        //contains
        System.out.println("a.contains(\"e\") = " + a.contains("e")); //true
        System.out.println("a.contains(\"el\") = " + a.contains("el"));//true
        System.out.println("a.contains(\"del\") = " + a.contains("del"));//false
        System.out.println(b.contains("rain")); //false



        //substring
        System.out.println(a.substring(3));
        System.out.println(b.substring(1,5));

        //











    }

}
