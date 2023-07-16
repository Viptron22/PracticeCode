package StringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatching {

        public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int count=0;
            for(int i=0;i<items.size();i++)
            {
                List<String> row=items.get(i);
                switch(ruleKey){
                    case "type" -> {
                        if(row.get(0).equals(ruleValue)){
                            count++;
                        }
                    }
                    case "color" -> {
                        if(row.get(1).equals(ruleValue)){
                            count++;
                        }
                    }
                    case "name" -> {
                        if(row.get(2).equals(ruleValue)){
                            count++;
                        }
                    }
                }
            }
            return count;
        }

       public static void main(String[] args){
            //List<List<String>> test={{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
            List<List<String>> test=new ArrayList<>();
            test.add(Arrays.asList("phone", "blue", "pixel"));
            test.add(Arrays.asList("computer","silver","lenovo"));
            test.add(Arrays.asList("phone","gold","iphone"));
            String ruleKey="color";
            String ruleValue="silver";
            System.out.println(countMatches(test,ruleKey,ruleValue));
        }

}
