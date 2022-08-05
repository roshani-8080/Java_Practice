package Stringprg;

public class StartwithFuction {
    public static void main(String[] args) {
        String arr[]={"global", "tcs", "cts" , "compucom"};

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].startsWith("c"));
        }
    }
}
