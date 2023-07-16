package arrayPractice;

public class FactorialCalculator {
    public static void main(String[] args)
    {
        System.out.println("factorial of 5 is="+factorial(5));
    }
      public static long factorial(int num)
      {
        long sum=1;
            for(int i=1;i<=num;i++) {
                sum *= i;
            }
          return sum;
          }

}
