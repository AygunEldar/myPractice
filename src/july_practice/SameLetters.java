package july_practice;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(checkSame("abc","cba"));
    }
    public static boolean checkSame(String word1, String word2){
        if(word1.length() != word2.length()){

            return false;
        }
        String[] letter1 = word1.split("");
        String[] letter2 = word2.split("");

          Arrays.sort(letter1);
          Arrays.sort(letter2);

          String a ="";
          String b ="";

        for (int i = 0; i < letter1.length; i++) {
            a +=letter1[i];

        }
        for (int j = 0; j < letter2.length; j++) {
            b += letter2[j];
        }
     return a.equals(b);
    }

}
