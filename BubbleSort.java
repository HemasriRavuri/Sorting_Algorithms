import java.util.Arrays;
public class BubbleSort {
    /* This is a stable sorting algorithm
    This is sorting the array in Ascending order
     * This is one of the sorting algorithm
     * To check if the array is not swapped then stop the sorting process
     */
   
    public static void main(String[] args) {
        int[] arr={9,-2,0,-53,98};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
      
    }
    static void bubble(int[] arr){
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
            if(!swapped){
                break;
            }
        }
    }
}
