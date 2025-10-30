package array;
public class Solution_7_removeDuplicates {
    public int removeDuplicates(int[] arr) {
        int a = 0;
        int k = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[a] != arr[i]) {
                a++;
                arr[a] = arr[i];k++;
            }
        }
        return k;
    }
}