package ArrayProgrammes;

public class PrintSmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 43, 49, 89, 73, 21, 99};
        //initialize max with first element of array
        int min = arr[0];
        //loop through array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Largest Element in array:::" + min);
    }
}
