package Stringprg;

public class Reverse2 {
    public static void main(String[] args) {
        String str="Java Learnig";
        String str1="Java Coding";

        String rev="";
        char a[]=str.toCharArray();
        int len=a.length;

        for (int i=len-1;i>=0;i--)
        {
            rev=rev+a[i];

        }
        System.out.println(rev);
    }



}
