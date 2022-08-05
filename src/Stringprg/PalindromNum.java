package Stringprg;

import java.util.Scanner;

public class PalindromNum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int num=sc.nextInt();
        int num1=num;

        int temp=0;
        while (num!=0)
        {
            temp=temp*10 +num%10;
            num=num/10;

        }
        if (num1==temp)
        {
            System.out.println("Palindrom");
        }
        else {
            System.out.println("Not Palindrom");
        }


        /*int a = 16461;
        int temp1=0;
        int  num2=a;

        while (num2!=0)
        {
            temp1=temp1*10 +num2%10;
            num2=num2/10;

        }
        if (num2==temp1)
        {
            System.out.println("Palindrom");
        }
        else {
            System.out.println("Not Palindrom");
        }
*/
    }

}
