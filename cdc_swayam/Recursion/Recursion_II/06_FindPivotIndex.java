// class Solution {
//     public int pivotIndex(int[] arr) {
//         int sum=0;
//         for(int i:arr)sum+=i;
//         return func(0,0,sum,arr);
//     }
//     int func(int temp,int x,int sum,int[] arr){
//         if(x==arr.length)return -1;
//         int a=temp;int b=sum-arr[x];
//         if(a==b)return x;
//         else return func(temp+arr[x],x+1,sum-arr[x],arr);

//     }
// }