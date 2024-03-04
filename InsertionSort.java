import java.util.Arrays;
public class InsertionSort {
    // This is an insertion sotting algorithm
    /* This algo. uses the approach of inserting the element at it's correct index position
     * This is very adaptive
     * Time Complexity-WorstCase-O(N^2) and Best Case-O(N)
     */
    public static void main(String[] args) {
        int[] arr={8,4,-9,-7,9,-2,-1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        // In every step L.H.S of array is sorted
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                // This will break inner loop if jth element is <not less thanj-1
                else{
                    break;
                }
            }

       }
    }
}
