package loopPractice;

public class Pattern12 {
    public static void main(String[] args){
        int i, j, n = 5;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (j + i > 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }

            }


            System.out.println(" ");
        }System.out.print("_ ");
          for(i=4;i>=1;i--){
              for(j=1;j<=4;j++){
                  if(i+j>4)
                  System.out.print("* ");
                   else
                        System.out.print("_ ");
              }

              System.out.println();

          }
    }
}
