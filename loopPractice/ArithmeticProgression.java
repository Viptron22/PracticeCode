package loopPractice;
import java.util.*;
public class ArithmeticProgression {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int start ,end,difference;
        System.out.println("enter the start ,end and difference of the ap series-");
        start=sc.nextInt();
        end=sc.nextInt();
        difference=sc.nextInt();
        System.out.print("the ap is:"+start+",");
        for(int i=start;i<end;){
            i=i+difference;
            System.out.print(i+",");
        }System.out.print(end);
    }
}

