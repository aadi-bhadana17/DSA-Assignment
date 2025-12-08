class Solution {
    public void merge(int[] arr, int m, int[] arr2, int n) {
        int[] res=new int[m+n];
        int i=0;
        int j=0;int x=0;
        while(i<m&&j<n){
            if(arr[i]<arr2[j]){
                res[x]=arr[i];i++;x++;
            }else if(arr[i]>arr2[j]){
                res[x]=arr2[j];j++;x++;
            }else{
                res[x]=arr[i];x++;
                res[x]=arr2[j];x++;i++;j++;
            }
        }
        while(i<m){
            res[x]=arr[i];i++;x++;
        }
        while(j<n){
            res[x]=arr2[j];j++;x++;
        }
        x=0;
        for(int k:res){
            arr[x]=k;x++;
        }
    }
}