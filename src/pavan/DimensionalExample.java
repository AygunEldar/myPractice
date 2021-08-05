package pavan;

public class DimensionalExample {
    public static void main(String[] args) {
        int[][]a = new int [3][2];

         a[0][0]=10;
         a[0][1]=20;


         a[1][0]=30;
         a[1][1]=40;


         a[2][0]=50;
         a[2][1]=60;


        for (int r = 0; r <= 2 ; r++) {

            for (int c = 0; c <= 1; c++) {

                System.out.print(a[r][c]+" ");
            }

            System.out.println();
        }

//
      // int d [][] = {{2,5,4},{6,9,7,},{2,6,9},{7,1,3}};


    }
}
