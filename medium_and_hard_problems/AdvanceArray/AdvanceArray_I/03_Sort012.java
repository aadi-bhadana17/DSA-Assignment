class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int i=0,j=0,k=n-1;
        while(j<=k){
            if(arr[j]==2){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;k--;
            }else if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;i++;j++;
            }else{
                j++;
            }
        }
    }
}