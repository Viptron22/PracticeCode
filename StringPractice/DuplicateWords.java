package StringPractice;
//Q. Write a function to find out duplicate words in a
//given string?
public class DuplicateWords {
      public static void main(String[] args)
      {
          String string = "Big black bug bit a big black dog on his big black nose";
          duplicateWordFinder(string);
      }

         public static void duplicateWordFinder(String line)
         {
             line=line.toLowerCase();
             int count=1;
             String[] words=line.split(" ");
               for(int i=0;i<words.length;i++)
               {
                   count=1;
                   for(int j=i+1;j<words.length;j++)
                   {
                       if(words[i].equals(words[j]))
                       {
                           count++;
                           words[j]="0";
                       }
                   }
                   if(count>1&&words[i]!="0")
                   {
                       System.out.println("Duplicate word is= "+words[i]+" ,its count is"+count);
                   }
               }
         }
}
