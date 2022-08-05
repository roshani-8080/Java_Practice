public class charOccurances {

        public static void main(String args[])
        {

            String input = "aaaabbccAAdd";
            //char[] search = input.charAt();             // Character to search is 'a'.

            int count=0;
            for(int i=0; i<input.length(); i++)
            {
                if(input.charAt(i) == input.charAt(i))
                    count++;
            }

            System.out.println(count);
           // System.out.println("The Character '"+search+"' appears "+count+" times.");
        }

}
