
public class MyClass {
    public static void main(String args[]) {
        String s ="Ind12ia45";
        String ss = "";
        String in = "";
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)>64){
                ss += s.charAt(i);
            }else{
                in=in+s.charAt(i);
            }
        }
        System.out.println(ss+"my"+in);
    }
}
