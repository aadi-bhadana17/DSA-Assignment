package array;
public class Solution_11_Selection {
    void selectionSort(int[] arr) {
        int n = arr.length;
        
        for(int i=0; i<n-1; i++) {
            int mn = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[mn]) mn = j;
            }
            int temp = arr[i];
            arr[i] = arr[mn];
            arr[mn] = temp;
        }
    }
}