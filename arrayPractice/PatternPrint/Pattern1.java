package arrayPractice.PatternPrint;

import java.util.Collections;

/*pattern to print
*
* eqilateral triangle of stars
*        *
*       * *
*      * * *
*     * * * *
*    * * * * *
* */
public class Pattern1 {
    public static void main(String[] args) {
        String space=" ";
        String star="* ";

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <5-i ; j++) {
                System.out.print(" ");
            }
                for (int j = 0; j <=i ; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }

//      very easy method
//        for(int i=0;i<5;i++){
//
//               String result = String.join("", Collections.nCopies(5-i, space))+String.join("", Collections.nCopies(i, star));
//                System.out.print(result);
//
//            System.out.println();
//        }
    }
}
