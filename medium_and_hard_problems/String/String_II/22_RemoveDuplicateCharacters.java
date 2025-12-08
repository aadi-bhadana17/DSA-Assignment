// class Solution {
//     String removeDups(String s) {
//         boolean[] count=new boolean[26];
//         int n=s.length();StringBuilder res=new StringBuilder();
//         for(int i=0;i<n;i++){
//             char temp=s.charAt(i);
//             if(count[temp-'a']==false){
//                 count[temp-'a']=true;
//                 res.append(temp);
//             }
//         }
//         return res.toString();
        
//     }
// }