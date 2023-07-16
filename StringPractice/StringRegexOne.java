package StringPractice;
/*Q. Can you write a regular expression to check if
String is a number?*/
public class StringRegexOne {
      public static boolean numberRegex(String str )
      {
          String reg="[0-9]+";
            if(str.matches(reg))
            {
                return true;
            }
             else
                 return false;
      }

      public static void main(String[] args)
      {
          String data="123j5";
          System.out.println(numberRegex(data));

      }
}
