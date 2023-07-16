package loopPractice;
//* * * * *
//  * * * *
//    * * *
//      * *
//        *
public class Pattern6 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
//               for(j=5;j>=i;j--){
//                   System.out.print(" *");
//               }

            }System.out.println();
        }

    }
}