import java.util.Arrays;
public class SelesctionSort {
    /* Selection sort is one of the sorting algorithm
     * This is unstabled algorithm
     * This sorts the array in the Ascending order
     * This uses the approach of selecting a min/max element in the array
     * And swaps the element with it's correct index
     * Time Complexity->Worst Case-O(N^2) and Best Case O(N^2)
     */
    public static void main(String[] args) {
      int[] arr={2,3,1,5,4};
     Selection(arr);
      System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-1-i;
            int first=maxIndex(arr, 0,last); 
            swap(arr, first, last); 
           
        }
     }
    //  Swapping the elements
       static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    // finding max element
    static int maxIndex(int[] arr,int start,int end){
        start=0;
        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

}
