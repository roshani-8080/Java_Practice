package Stringprg;
//repetative chars count
public class CountWords {
    public static void main(String[] args) {
        String str= "My string is aaaAAAABBBAAAAaaaa";

        int count= str.length();
        int count_afterremove= str.replace("a","").length();
        int count1=count-count_afterremove;
        System.out.println(count1);

    }
}
