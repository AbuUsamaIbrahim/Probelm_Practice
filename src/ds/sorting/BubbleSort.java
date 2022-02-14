package ds.sorting;

public class BubbleSort {


    public static void main(String [] args){
        int[] arr = {3,5,1,2,9};
        System.out.print("Before Bubble Sort : ");
        printArr(arr);
        BubbleSort bs = new BubbleSort();
        bs.bubbleSortPart(arr,arr.length-1);
        System.out.print("After Bubble Sort : ");
        printArr(arr);
    }

    void bubbleSortPart(int[] arr,int length){
        if(length == 0 )
            return;
        if (length == 1)
            return;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+" , ");
            }

        }
        System.out.println();
    }
}
