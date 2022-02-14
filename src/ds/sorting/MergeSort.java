package ds.sorting;

public class MergeSort {


        public static int removeDuplicateElements(int arr[], int n){
            if (n==0 || n==1){
                return n;
            }
            int j = 0;//for next element
            for (int i=0; i < n-1; i++){
                if (arr[i] != arr[i+1]){
                    arr[j++] = arr[i];
                }
            }
            arr[j++] = arr[n-1];
            return j;
        }

        public static void main(String [] args){
        int[] arr = {3,2,9,4,1,-1,-7,-7,9,4,6,5,3};
        System.out.print("Before Marge Sort : ");

        printArr(arr);
            removeDuplicateElements(arr,arr.length);
        MergeSort ms = new MergeSort();
        ms.sortToMerge(arr,arr.length);
        System.out.print("After Marge Sort : ");
        printArr(arr);
    }

      void sortToMerge(int[] arr,int n){
        if(n<2) {
            return;
        }
        int mid = n/2;
        int l[] = new int[mid];
        int r[] = new int[n-mid];
        for(int i=0;i<mid;i++){
              l[i] = arr[i];
        }
        for(int j=mid;j<n;j++){
              r[j-mid] = arr[j];
        }
        sortToMerge(l,mid);
        sortToMerge(r,n-mid);
        merge(arr,l,r,mid,n-mid);

    }

    void merge(int[] arr,int[] l,int[] r,int left,int right){
        int i=0,j=0, k=0;
        while (i<left && j<right){
            if(l[i] <= r[j]){
                arr[k++] = l[i++];
            }else {
                arr[k++] = r[j++];
            }
        }
        while(i<left){
            arr[k++] = l[i++];
        }
        while(j<right){
            arr[k++] = r[j++];

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
