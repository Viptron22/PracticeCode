package loopPractice;

public class Pattern11 {
    public static void main(String[] args) {
        int i, j, n = 5;
        for (i = 1; i <= 2*n-1; i++) {
            if (i > n) {
                for(j=1;j<=2*n-i;j++){
                    if(i+j<=10){
                        System.out.print("* ");
                    }else
                        System.out.print("_ ");
                }
            }else
               for (j = 1; j <= 5; j++) {

                if (j + i > 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }

            }
//               for(j=5;j>=i;j--){
//                   System.out.print(" *");
//               }

            System.out.println();
        }
    }
}
