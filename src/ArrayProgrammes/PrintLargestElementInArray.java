package ArrayProgrammes;

public class PrintLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 43, 49, 89, 73, 21, 99};
        //initialize max with first element of array
        int max = arr[0];
        //loop through array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Largest Element in array:::" + max);
    }
}