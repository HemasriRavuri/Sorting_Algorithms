// package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={2,3,8,4,5,7};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
//        mergeSortInplace(arr,0,arr.length);
//        System.out.println(Arrays.toString(arr));
    }
    static  int[] mergeSort(int[] arr){
        if(arr.length==1){
            return  arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return  merge(left,right);
    }
//
     static int[] merge(int[] first, int[] second) {
        int[] mix=new int[first.length+second.length];
        int i=0,j=0;
        int k=0;
        while(i<first.length&&j<second.length){
            if (first[i] < second[j]) {
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
        k++;
       }
//        It may be possible that one of the array is not completed
//        copy all the  remaining elements in mix[]
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
//    Merge sort Algo Inplace
//static  void mergeSortInplace(int[] arr,int s,int e){
//        if(arr.length==0){
//            return;
//        }
//    if(e-s==1){
//        return ;
//    }
//    int mid=(s+e)/2;
//    mergeSortInplace(arr,s,mid);
//    mergeSortInplace(arr,mid,e);
//    mergeInplace(arr,s,mid,e);
//}

//     static void mergeInplace(int[] arr, int s, int m, int e) {
//        int[] mix = new int[e - s];
//        int i = s, j = m, k = 0;
//        while (i < m && j < e) {
//            if (arr[i] < arr[j]) {
//                mix[k] = arr[i];
//                i++;
//            } else {
//                mix[k] = arr[j];
//                j++;
//            }
//            k++;
//        }
////        It may be possible that one of the array is not completed
////        copy all the  remaining elements in mix[]
//            while (i < m) {
//                mix[k] = arr[i];
//                i++;
//                k++;
//            }
//            while (j < e) {
//                mix[k] = arr[j];
//                j++;
//                k++;
//            }
//
//           for (int l=0;l<mix.length;l++){
//               arr[s+l]=mix[l];
//           }
//
//    }

}
