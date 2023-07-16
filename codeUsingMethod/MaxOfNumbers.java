package codeUsingMethod;

import java.util.*;

class MaxOfNumbers{

static int max(int...num){
	/* if(num.length==0)
	 *    return Integer.MIN_VALUE;
	 *    else
	 *      int maxi=num[0]
	 *       for(int i=;i<num.length;i++){
	 *       if(num[i]>maxi)
	 *         maxi=num[i];
	 *       
	 *       }
	 * 
	 */
int maxi=0;
   for(int x:num){
    if(x>maxi)
     {maxi=x;
	 }
}
   return maxi;


}
       public static void main(String[] args){
	   System.out.println("maximum of the numbers are "+max(1,377,8));
	   
	   
	   }
	   


}