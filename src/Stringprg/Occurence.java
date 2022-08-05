package Stringprg;

public class Occurence {
    public static void main(String[] args) {


        String str = "aAAABBBBaaabbbs";
        int counter[] = new int[256];
       for (int i = 0; i < str.length(); i++) {
            counter[(int) str.charAt(i)]++;
        }
//print Frequency of characters
        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0) {
//prints frequency of characters
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }
}

