package ds.sorting;

public class SelectionSort {
    public static void main(String args[]){
        int[] arr = {3,2,9,4,1};
        System.out.print("Before Selection Sort : ");
        printArr(arr);
        SelectionSort ms = new SelectionSort();
        ms.SelectionAscendingSort(arr);
        System.out.print("After Selection Sort : ");
        printArr(arr);
    }

    void SelectionAscendingSort(final int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
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
