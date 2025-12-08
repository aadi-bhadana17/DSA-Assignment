// class Solution {
//     public char getMaxOccuringChar(String s) {
//         // code here
//         int n=s.length();
//         HashMap<Character,Integer> mp=new HashMap<>();
//         char res='z';
//         int count=0;
//         for(int i=0;i<n;i++){
//             char temp=s.charAt(i);
//             mp.put(temp,mp.getOrDefault(temp,0)+1);
//             if(mp.get(temp)>count){
//                 res=temp;
//                 count=mp.get(temp);
//             }else if(mp.get(temp)==count){
//                 if(temp<res)res=temp;
//             }
//         }
//         return res;
        
//     }
// }