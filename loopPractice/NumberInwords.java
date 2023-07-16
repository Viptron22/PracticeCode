package loopPractice;
import java.util.*;
class NumberInWords {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int r,r2,number;
        String revNumber = null;
        System.out.println("enter the number-");
        number=sc.nextInt();
        while(number!=0){
            r=number%10;
            revNumber=revNumber+r;
            number=number/10;

        }
        for(r2=revNumber.length()-1;r2>=0;r2--){


            switch (revNumber.charAt(r2)){
                case '0' -> System.out.print(" zero ");
                case '1' -> System.out.print(" one  ");
                case '2' -> System.out.print(" two  ");
                case '3'->  System.out.print(" three ");
                case '4' -> System.out.print(" four  ");
                case '5' -> System.out.print(" five ");
                case '6'-> System.out.print(" six ");
                case '7' -> System.out.print(" seven");
                case '8' -> System.out.print(" eight ");
                case '9' -> System.out.print(" nine ");
            }
        }

    }
}
