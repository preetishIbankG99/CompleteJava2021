package ArrayProgrammes;

public class PrintDuplicateElementsOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40,10,40};
        System.out.println("Number Of Elements of Given Array::::"+arr.length);

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
if (arr[i]==arr[j]){
    System.out.println(arr[j]);
}

            }
        }

    }}
