
public class Exercise3 {
    public static void main(String[] args)
    {
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Compare the two strings.
        int result = str1.compareTo(str2);
        

        // Display the results of the comparison.
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                    " is less than " +
                    "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                    " is equal to " +
                    "\"" + str2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                    " is greater than " +
                    "\"" + str2 + "\"");
        }
    }
}

    /*public static void main(String[] args) {

        String str = "w3resource.com";
        System.out.println("Original String : " + str);

        // codepoint before index 1

        int val1 = str.codePointBefore(1);

        // codepoint before index 9
        int val2 = str.codePointBefore(9);

        // prints character before index1 in string
        System.out.println("Character(unicode point) = " + val1);
        // prints character before index9 in string
        System.out.println("Character(unicode point) = " + val2);
    }*/
