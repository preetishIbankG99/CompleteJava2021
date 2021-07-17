package ArrayProgrammes;

public class PrintSumOfElementsOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40};
        System.out.println("Number Of Elements of Given Array::::"+arr.length);
    int sum=0;
    for (int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
        System.out.println(" "+sum);
    }
}
