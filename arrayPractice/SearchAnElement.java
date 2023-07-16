package arrayPractice;
import java.util.*;
//using linear search
public class SearchAnElement {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
        int A[]={1,3,3,5,90,55};
        boolean t;
        int I[]=new int[A.length];
        int number;
        number=sc.nextInt();
        for(int i=0;i<A.length;i++){
            if(number==A[i]){
                System.out.print("the element is found at index "+i+" & ");
            //System.exit(0);//it will exit the program but it fill it once
            }

        }System.out.println("element not found");

    }

    }


