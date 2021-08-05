package pavan;

public class CountOddAndEven {
    public static void main(String[] args) {
        int num =1234569;
        int evenCount = 0;
        int oddCount = 0;

        while(num > 0 ){
             int rem = num %10;
             if(rem %2 ==0){
                 evenCount++;
             }else {
                 oddCount++;
             }
             num = num/10;
        }
        System.out.println("Number of even : " +evenCount);
        System.out.println("Number of odd : " +oddCount);

    }
}
