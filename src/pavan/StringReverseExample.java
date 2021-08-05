package pavan;

public class StringReverseExample {

    public static void main(String[] args) {

        reverseWord("ABCD"); //for loop
        revChar("book"); //charArray
        revWithBuff("PAVAN"); //StringBuffer
    }

    public static void reverseWord(String word){

        String reverse = "";
        for (int i = word.length()-1; i >=0; i--) {

            reverse += word.charAt(i);
        }
        System.out.println(reverse);

    }
    //VERSION 2

    public static void revChar(String a){

        String rev= "";
        char [] letters = a.toCharArray();

        for (int i = a.length()-1; i >=0 ; i--) {
            rev += letters[i]   + " ";

        }
        System.out.println(rev);
    }

   // VERSION 3 STRING BUFFER CLASS

    public static void revWithBuff(String str){

  StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }






}
