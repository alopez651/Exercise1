//https://www.geeksforgeeks.org/reverse-an-array-in-java/
import java.util.Arrays;
import java.lang.StringBuffer;

public class Array {
    public static void main (String [] args){
        int[] array = {1, 2, 3, 4, 5, 6};
        aReverse(array);
        System.out.println(Arrays.toString(array));

        String[] array2 = {"Harry", "Ron", "Hermione"};
        aReverse2(array2);
        System.out.println(Arrays.toString(array2));

        for(int i =0; i < 3; i++){
            System.out.print(aReverse3(array2[i]) + ", ");
        }
    }
    //https://www.geeksforgeeks.org/reverse-an-array-in-java/
    public static void aReverse(int[] array){
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = temp;
        }
    }
    public static void aReverse2(String[] array2){
        int arr = array2.length;
        for(int i = 0; i< (arr/2); i++){
            String temp = array2[i];
            array2[i] = array2[arr - i -1];
            array2[arr - i -1]= temp;
        }
        return;
    }
    //https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html
    //https://stackoverflow.com/questions/7569335/reverse-a-string-in-java/7569380#7569380
    public static String aReverse3(String array2){
        return new StringBuffer(array2).reverse().toString();
    }

}
