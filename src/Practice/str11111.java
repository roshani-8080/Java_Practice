package Practice;

public class str11111 {
    public static void main(String[] args) {
        String str = "Roshani Indalkar";

        String rev = "";
        int length= str.length();

        /*for(int i=length-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);

        }

        System.out.println(rev);
*/
        for(int i=0;i<length;i--)
        {
            rev=rev+str.charAt(i);

        }

        System.out.println(rev);

    }
}
