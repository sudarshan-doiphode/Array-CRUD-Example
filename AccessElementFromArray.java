public class AccessElementFromArray {
    public static void main(String[] args) {
        int[] array = {2,1,4,5,6};

        /*
        1. To print elements from array we can use loops like for, for each (enhanced for) and while
        2. We can also use Arrays.toString() method to print array in array structure.
        */

        System.out.println("Elements of Array are :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("Elements from array with foreach (enhanced for loop)");
        for(int element: array){
            System.out.print(element + " ");
        }

        System.out.println("Elements with while loop");
        int i =0;
        while(i<array.length){
            System.out.print(array[i] + " ");
            i++;
        }
    }
}
