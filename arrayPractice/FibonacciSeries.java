package arrayPractice;

public class FibonacciSeries {
    public static void main(String[] arg){
       int f=0;
       int sec=1;
       int n=10;
       printFibonacci(f,sec,n);
    }

    public static void printFibonacci(int first,int second,int n){
        int c=0;
        System.out.print(first+","+second+",");
        for(int i=first;i<=n;i++)
        {
              c=first+second;
              System.out.print(c+",");
              first=second;
              second=c;
        }
    }


}
