
// class Solution {
//     String removeSpecialCharacter(String s) {
//         String str=s.toLowerCase();
//         int n=s.length();
//         StringBuilder res=new StringBuilder();
//         for(int i=0;i<n;i++){
//             char temp=str.charAt(i);
//             if(temp>='a'&&temp<='z'){
//                 res.append(s.charAt(i));
//             }
//         }
//         if(res.length()==0){
//             res.append(-1);return res.toString();
//         }
//         return res.toString();
        
//     }
// }