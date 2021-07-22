package july_practice;

public class ReverseSentence {
    public static void main (String [] args){
        reverseSentence("Java is fun");
    }
    public static void reverseSentence(String str){

        String [] word =str.split(" ");

        for(int i=word.length-1; i >= 0; i--){
            System.out.print(word[i]+ " ");
        }
    }


}
