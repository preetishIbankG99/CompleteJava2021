package ArrayProgrammes;

public class PrintArray {
    public static void main(String[] args) {
        int[]arr=new int[]{10,20,30,40};
        System.out.println("Elements of Given Array::::");
        //loop through the array by incrementing value of i
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
}
