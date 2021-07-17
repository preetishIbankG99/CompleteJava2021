package ArrayProgrammes;

public class PrintArrayInReverseOrder {
    public static void main(String[] args) {
        int[]arr=new int[]{10,20,30,40};
        System.out.println("Elements of Given Array::::");
        //loop through the array by incrementing value of i
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+"");
        }
    }
}
