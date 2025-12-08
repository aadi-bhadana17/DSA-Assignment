// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         int[] count=new int[256];
//         int[] count1=new int[256];
//         int n=s.length();
//         for(int i=0;i<n;i++){
//             char x=s.charAt(i);
//             char y=t.charAt(i);
            
//             if(count[x]!=0&&count[x]!=y||count1[y]!=0&&count1[y]!=x){
//                 return false;
//             }else{
//                 count[x]=y;
//                 count1[y]=x;
//             }
//         }
//         return true;
//     }
// }