package ArrayProgrammes;

public class PrintArrayOddPosition {
    public static void main(String[] args) {
        int[]arr=new int[]{10,20,30,40,50,60};

        //loop through the array by incrementing value of i
        for (int i=1;i<arr.length;i=i+2){

            System.out.println(arr[i]+"");
        }
    }
}
