public class strrev {
    public static void main(String[] args) {

        String s = "I love my country";

        //Solution 1
/*
         String reverse="";
        for(int i = s.length()-1;i>=0;i--){
            reverse = reverse + s.charAt(i);
       // System.out.println(s.charAt(i));
    }
    System.out.println(reverse);
}*/

        // Solution 2

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        System.out.println(sb.reverse());

        // Solution 3

    StringBuffer sb1= new StringBuffer();
    sb1.append(s);
    System.out.println(sb1.reverse());
    }

}