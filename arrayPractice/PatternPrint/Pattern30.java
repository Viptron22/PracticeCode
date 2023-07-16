package arrayPractice.PatternPrint;

import java.sql.SQLOutput;
import java.util.Collections;

//            1
//          2 1 2
//        3 2 1 2 3
//      4 3 2 1 2 3 4
//    5 4 3 2 1 2 3 4 5
public class Pattern30 {
    public static void main(String[] args) {
        int n=5;
        int num=0;
        for(int i=1;i<=n;i++)
        {

            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }

                    for(int x=i;x>=1;x--){
                    System.out.print(x);

                }
                for(int x=2;x<=i;x++){
                    System.out.print(x);
                }

            System.out.println();
        }
    }
}
