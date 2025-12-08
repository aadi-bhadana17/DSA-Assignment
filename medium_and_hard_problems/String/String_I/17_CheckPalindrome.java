// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder res=new StringBuilder();
//         int n=s.length();
//         // System.out.println((char)('b'-'a'+'A'));
        
//         // System.out.println(s);
//         for(int i=0;i<n;i++){
//             char temp=s.charAt(i);
//             if(temp>='A'&&temp<='Z'){
//                 temp=(char)(temp-'A'+'a');
//             }
//             if((temp>='a'&&temp<='z')||(temp>='0'&&temp<='9')){
//                 res.append(temp);
//             }
//         }
//         //  System.out.println(res+" "+res.reverse());
//         int a=0;int b=res.length()-1;
//         while(a<b){
//             if(res.charAt(a)!=res.charAt(b)){
//                 return false;
//             }
//             a++;b--;
//         }
//         return true;
//     }
// }