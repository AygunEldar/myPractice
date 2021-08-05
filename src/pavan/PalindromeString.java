package pavan;
import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  your word");
        String word = scan.next();
        String org_word = word;
        String rev= "";

        for (int i = word.length()-1; i >=0 ; i--) {
            rev +=""+word.charAt(i);

        }
        if(rev.equals(word)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
