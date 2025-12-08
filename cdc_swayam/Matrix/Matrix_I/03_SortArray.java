class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return  nums;
    }
    void mergesort(int[] arr,int s,int e){
        if(s<e){
            int mid=s+(e-s)/2;
            mergesort(arr,s,mid);
            mergesort(arr,mid+1,e);
            mergeFunction(arr,s,mid,e);
        }
    }
    void mergeFunction(int[] arr,int s,int mid,int e){
        int[] left=new int[mid-s+1];int a=0;
        int[] right=new int[e-mid];int b=0;
        for(int i=s;i<=mid;i++)left[a++]=arr[i];
        for(int i=mid+1;i<=e;i++)right[b++]=arr[i];
        int c=s;
        a=0;b=0;
       
        while(a<(mid-s+1)&&b<(e-mid)){
            if(left[a]>right[b]){
                arr[c++]=right[b];
                b++;
            }else if(left[a]<right[b]){
                arr[c++]=left[a++];
            }else{
                arr[c++]=left[a++];
                arr[c++]=right[b++];
            }
        }
        while(a<(mid-s+1)){
            arr[c++]=left[a++];
        }
        while(b<(e-mid)){
            arr[c++]=right[b++];
        }

    }
}
