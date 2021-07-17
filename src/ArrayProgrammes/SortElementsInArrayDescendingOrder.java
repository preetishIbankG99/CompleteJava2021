package ArrayProgrammes;

public class SortElementsInArrayDescendingOrder {
    public static void main(String[] args) {
        //initialize array
        int[]arr=new int[]{4,25,6,12};
        int temp=0;
        //Display original array
        System.out.println("Elements of Original Array:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //sort array in ascending
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of Array in Descending order::");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
