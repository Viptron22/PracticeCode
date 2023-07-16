//program to calculate and return discount of sum of price for variable price list
package codeUsingMethod;
import java.util.*;
public class CalculateDiscount2 {
	static double discount(double...price) {
		double sum=0,disc = 0;
	   for(int i=0;i<price.length;i++) {
		   sum=sum+price[i];
	   }
	   if(sum<=500)
	   {    
		return disc=sum*0.1;  //10%discount for sum below 500
	   }
	   else if(sum>500&&sum<=1500)
	   {
		   return disc=sum*0.15;//15%percent discount
	   }
	   else
		   return disc=sum*0.16;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number of price list=");
		n=sc.nextInt();
		double[] price=new double[n];
		System.out.println("enter the prices=");
		for(int i=0;i<price.length;i++) {
			price[i]=sc.nextDouble();
			
		}
		 System.out.println("calculated discount on tota price is="+discount(price));
		 sc.close();
		
	}
	

}
