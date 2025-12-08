class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int pivot=findPivot(arr);
         System.out.println(pivot);
        if(pivot==-1){
            return search(0,n-1,arr,target);
        }else{
            return Math.max(search(0,pivot-1,arr,target),search(pivot,n-1,arr,target));
        }
    }
    int search(int s,int e,int[] arr,int target){
        int mid=0;
        while(s<=e){
            mid=(s+(e-s)/2);
            if(arr[mid]>target){
                e=mid-1;
            }else if(arr[mid]<target){
                s=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    int findPivot(int[] arr){
        int s=0;int e=arr.length-1;int mid=0;
        while(s<=e){ 
            mid=(s+(e-s)/2);
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }else{
                e=mid-1;
            }
            // System.out.println(s+" "+e);
        }
        if(s==arr.length)return -1;
        return s;
    }
}
