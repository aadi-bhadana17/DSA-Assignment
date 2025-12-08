
// class Solution {
//     public int reverseExponentiation(int n) {
//         // code here
//         if(n==10)return 10;
//         return func(n,n);
//     }
//     static int func(int n,int x){
//         if(x==0){
//             return 1;
//         }else{
//             return n*func(n,x-1);
//         }
//     }
// }