package array;
public class Solution_10_Bubble {
    public void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            boolean swap = false;
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int a = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = a;
                    swap = true;
                }
            }
            if(!swap) return;
        }
    }
}