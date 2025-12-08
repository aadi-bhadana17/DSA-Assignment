// class Solution {
//     public boolean isValid(String str) {
//         char[] arr=str.toCharArray();
//         Stack<Character> s=new Stack<>();
//         System.out.println(Arrays.toString(arr));
//         for(int i=0;i<arr.length;i++){
//             char temp=arr[i];
//             if(temp=='('||temp=='['||temp=='{'){
//                 s.push(temp);
//             }else{
//                 if(s.isEmpty()==false&&check(s.peek(),temp)){
//                     s.pop();
//                 }else{
//                     return false;
//                 }
//             }
//         }
//         if(!s.isEmpty())return false;
//         return true;
//     }
//     boolean check(char a,char b){
//         if(a=='('&&b==')')return true;
//         if(a=='['&&b==']')return true;
//         if(a=='{'&&b=='}')return true;
//         return false;
//     }
// }