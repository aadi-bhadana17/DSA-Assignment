
// 16.Majority Element 
// class Solution {
//     public int majorityElement(int[] arr) {
//         int n=arr.length;
//         int num=arr[0];int count=1;
//         for(int i=1;i<n;i++){
//             if(arr[i]!=num&&count>=1){
//                 count--;
//                 if(count==0){
//                     count=1;
//                     num=arr[i];
//                 }
//             }else if(arr[i]==num)count++;
//         }
//         return num;
//     }

// }