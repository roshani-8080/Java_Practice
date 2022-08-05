package Stringprg;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str= "Welcome To Java";//main string
        String []s =str.split(" ");//spliting string into multiple words

        String rev="";


        for(String w:s)
        {
         String revword="";
         for(int i=w.length()-1;i>=0;i--)
         {
             revword=revword+w.charAt(i);

         }
         rev=rev+revword+" ";

        }

        System.out.println(rev);

    }
      /*  //Approach 2
        String str= "Welcome To Java";
        String []s =str.split("\\s");
        String revWord="";
        for(String w:s)
        {
            StringBuilder sb= new StringBuilder(w);
            sb.reverse();
            revWord=revWord+sb.toString()+" ";

        }
        System.out.println(revWord);
*/
    }
