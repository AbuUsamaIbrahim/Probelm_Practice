package ds.sorting;

public class QuickSort {
    public static void main(String [] args){
        int[] arr = {3,5,1,2,9};
//        System.out.print("Before Quick Sort : ");
        System.out.print(sum(5));
//        printArr(arr);
//        QuickSort ms = new QuickSort();
//        ms.quickSort(arr,0,arr.length-1);
//        System.out.print("After Quick Sort : ");
//        printArr(arr);
    }

    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+" , ");
            }

        }
        System.out.println();
    }

    private void quickSort(int[] arr,int begin,int end){
        if(begin<end){
            int partitionIndex = partition(arr,begin,end);
            quickSort(arr,begin,partitionIndex-1);
            quickSort(arr,partitionIndex+1,end);
        }
    }

    private int partition(int[] arr,int begin,int end){
        int pivot = arr[end];
        int i = begin-1;
        for(int j = begin ; j<end ; j++){
            if(arr[j] <= pivot){
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }
   public static int sum(int num){
        int sumi =0;
        if(num==1){

            return 1;
        } return num*sum(num-1);



    }
}
