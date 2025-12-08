
// class Solution {
//     public void rotate(int[] arr, int k) {
//         int n=arr.length;
        
//         if(n==1)return;
//         if(k>=n)k=k%n;
//         int a=n-k;
//         if(a<0)return;
//         // System.out.println(k);
//          reverse(arr,0,a-1);
//          reverse(arr,a,n-1);
//          reverse(arr,0,n-1);

//     }
//     void reverse(int[] arr,int i,int j){
//         int temp=0;
//         while(i<=j){
//             temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;i++;j--;
//         }
//     }
// }