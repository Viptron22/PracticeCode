package loopPractice;
import java.util.*;
 class GeometricProgression {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        int a,r,n,term;
        System.out.println("enter statring numbers of the series  and the common ratio ");
        a=sc.nextInt();r=sc.nextInt();
        System.out.println("enter upto which you want to print the series");
        n=sc.nextInt();
        term=a;
        System.out.print("the series is "+a);
        for(int i=1;i<=n;i++){
            term=term*r;
           System.out.print(","+term);

        }

    }
}
