package Stringprg;

public class finalkey {
    public static void main(String[] args) {
        int array[] = {0, 0, 1, 30, 20,25, 0,1,1};
        int temp;

        for(int i=0; i<array.length-2; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
       for(int a:array)
        {
            System.out.println(a+" ");
        }
        /*System.out.println("----------------");
            System.out.println(array[array.length-1]);*/

    }
}
