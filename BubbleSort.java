import java.util.Arrays;
public class BubbleSort {
    /* This is a stable sorting algorithm
    This is sorting the array in Ascending order
    This can be done by the approach by swapping the adjacent elements
    Time Complexity->Worst case-O(N^2) and Best Case-O(N)
     */
   
    public static void main(String[] args) {
        int[] arr={9,-2,0,-53,98};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
      
    }
    static void bubble(int[] arr){
        // For checking the array is swapped or not
        boolean swapped;
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
           swapped=false;
            for(int j=1;j<=n-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            // This will break the inner loop if swapping is not done
            if(!swapped){
                break;
            }
        }
    }
}
