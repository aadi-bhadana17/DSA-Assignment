package array;

import java.util.*;

public class Solution_13_intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums2) set.add(x);
        List<Integer> list = new ArrayList<>();
        
        for(int x : nums1) {
            if(set.contains(x)) {
                list.add(x);
                set.remove(x);
            }
            if(set.size() == 0) break;
        }

        int arr[] = new int[list.size()];
        int i = 0;
        for(int x : list) arr[i++] = x;
        return arr;
    }
}