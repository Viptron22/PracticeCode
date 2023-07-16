package loopPractice;
import java.util.*;
public class Factorial {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,fact=1;
        System.out.println("enter the number ");
        number = sc.nextInt();
        for(int i=number;i>=1;i--){
            fact=fact*i;
        }
    System.out.println("the factorial is :-"+fact);
    }
}

