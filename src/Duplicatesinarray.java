public class Duplicatesinarray {
    public static void main(String[] args) {
        String s[]={"Java","selenium","c","c++","Java","c"};

        for (int i=0;i<s.length;i++)
        {
            for(int j=i+1; j<s.length;j++)
            {
                if (s[i]==s[j])
                {
                    System.out.print("duplicate"+ " "+s[i]);
                }
            }
        }

    }
}
