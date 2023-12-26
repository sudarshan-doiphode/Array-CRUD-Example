import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        /*
        ways to Declare an array :
        int[] array = new int[5] ---> array declare with fixed size
        int array[] = new int[5] ---> array declare with fixed size
        int array[] = {1,2,4,5} ---> array with Initialized elements

        Note: you can use square bracket before or after variable
         * */
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter the elements in an array");
        for (int range = 0; range < array.length; range++) {
            array[range] = scanner.nextInt();
        }
        System.out.println("Here is newly created array : ");
        System.out.println(Arrays.toString(array));
    }
}
