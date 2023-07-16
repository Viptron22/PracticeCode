package arrayPractice.PatternPrint;
//pattern print
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5;

import java.util.Collection;
import java.util.Collections;

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = 1; j <=i+1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //String.join method
//        int count=0;
//        for (int i = 0; i <5 ; i++) {
//
//            System.out.print(String.join("", Collections.nCopies(i,String.valueOf(count++))));
//            System.out.println();
//        }
    }
}
