package arrayPractice.PatternPrint;

import java.util.Collections;

//    to print pattern
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
public class Pattern3 {
    public static void main(String[] args) {
        //no of rows =9
        //col=

        int n=5;
//        for(int i=0;i<2*n;i++)
//        {
//            if(i>n) {
//                System.out.print(String.join("", Collections.nCopies(2*n-i, "* ")));
//                }
//                    else  {
//                            System.out.print(String.join("", Collections.nCopies(i,"* ")));
//                        }
//
//            System.out.println();
//
//        }
        //imp,make a diff variable for printing column
        int c=0;
        for (int i = 0; i <2*n ; i++) {
//            if(i>n)
//            {
//                 c=2*n-i;
//            }
//               else
//                    c=i;
                 c=i>n?2*n-i:i;
                    for (int j = 0; j <c ; j++) {
                    System.out.print(" *");
                }
            System.out.println();
        }
    }
}
