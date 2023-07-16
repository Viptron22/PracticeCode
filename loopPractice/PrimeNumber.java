package loopPractice;

public class PrimeNumber {
    public static void main(String[] args){
        int n=13,i,j,count=0;
        for(i=1;i<=n&&count<3;i++){

            if(n%i==0){
                ++count;
            }

        }if(count>=3)
            System.out.println("the number is not  prime");
           else
                System.out.println("the number is prime");

    }
}
