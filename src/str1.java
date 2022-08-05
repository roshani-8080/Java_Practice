public class str1 {
    public static void main(String[] args) {


        String s = "Java,Selenium,TestN";
        String[] s1 = s.split(",");
        for (int i=0;i<=s1.length-1;i++)
        {
            System.out.println(s1[i]);
        }
        /*for (String ss : s1) {
            System.out.println(ss);
        }
*/
    }
}
