// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int[] count=new int[26];
//         if(t.length()!=s.length())return false;
//         for(int i=0;i<s.length();i++){
//             char a=s.charAt(i);
//             count[a-'a']++;
//         }
//         for(int i=0;i<t.length();i++){
//             char a=t.charAt(i);
//             if(count[a-'a']==0)return false;
//             count[a-'a']--;
//         }
//         return true;
//     }
// }