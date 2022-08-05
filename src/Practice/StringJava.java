package Practice;

public class StringJava {
    public static void main(str11111[] args) {


        String s = "Roshani is SDET Engineer";
        String rev = "";

        /*//String s1[] = s.split(" ");

        String rev = "";

        for (int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
        */

       /* StringBuilder sb= new StringBuilder(s);
        //sb.append(s);
        sb.reverse();
        rev=rev+sb.toString()+ " ";

        System.out.println(rev);*/

        StringBuffer sb =new StringBuffer(s);
        sb.reverse();
        rev=rev+sb.toString()+ " ";
        System.out.println(rev);


    }

}
