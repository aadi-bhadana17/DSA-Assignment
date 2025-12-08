
// class Solution {
//     // Function to find equilibrium point in the array.
//     public static int findEquilibrium(int arr[]) {
//         // code here
//         int sum=0;
//         int n=arr.length;
//         for(int i:arr)sum+=i;
//         int a=0;
//         for(int i=0;i<n;i++){
            
//             if(sum-a-arr[i]==a){
//                 return i;
//             }
//             a+=arr[i];
//         }
//         return -1;
//     }
// }