package arrayPractice.PatternPrint;

import java.util.Collections;

//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
public class Pattern4 {
    public static void main(String[] args) {
        int n=5;
        String star="";
        String space="";
        for (int i = 0; i <2*n ; i++) {
            int s=i>n?i-n:n-i;
            int str=i>n?2*n-i:i;
            for (int j = 0; j <s ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <str ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

          //method 2 for interviews
        for (int i = 0; i < 2*n; i++) {
              int s=i>n?i-n:n-i;
              int str=i>n?2*n-i:i;
              space=String.join("", Collections.nCopies(s," "));
              star=String.join("",Collections.nCopies(str,"* "));
            System.out.println(space+star);
        }
    }
}
