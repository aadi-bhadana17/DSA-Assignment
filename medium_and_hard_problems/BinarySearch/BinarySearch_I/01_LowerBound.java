class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int s=0;int e=arr.length-1;int mid=0;
        while(s<=e){
            mid=(s+(e-s)/2);
            if(arr[mid]>target){
                e=mid-1;
            }else if(arr[mid]<target){
                s=mid+1;
            }else{
                while(mid-1>=0&&arr[mid-1]==arr[mid])mid--;
                return mid;
            }
        }
        
        if(s==arr.length)return arr.length;
        return s;
    }
}