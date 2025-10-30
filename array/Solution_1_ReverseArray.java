package array;
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution_1_ReverseArray 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
       int res[] = new int[arr.size()];
       for(int i=0; i<=m; i++) {
           res[i] = arr.get(i);
       }
        int idx = m+1;
       for(int i=arr.size()-1; i>m; i--){
           res[idx++] = arr.get(i);
       }

        arr.clear();
        for(int x : res) {
            arr.add(x);
        }
    }
}
