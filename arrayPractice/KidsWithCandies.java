package arrayPractice;

import java.util.ArrayList;
import java.util.List;

class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result=new ArrayList<Boolean>(candies.length);
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            candies[i]+=extraCandies;
            if(candies[i]>=max)
            {
                max=candies[i];
                result.add(i,true);
            }
            else
                result.add(i,false);
        }
        return result;
    }
   public static void main(String[] args)
    {
        int[] cand={2,3,5,1,3};
        int extraCand=4;
        System.out.println(kidsWithCandies(cand,extraCand).toString());
    }
}
