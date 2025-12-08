
// class Sol {
//     int getCount(String s, int n) {
//         // your code here
//         Stack<Character> mp=new Stack<>();
//         for(int i=0;i<s.length();i++){
//             char temp=s.charAt(i);
//             while(!mp.isEmpty()&&mp.peek()==temp){
//                 mp.pop();
//             }
//             mp.push(temp);
//         }
//         int[] count=new int[256];
//         while(mp.isEmpty()==false)count[mp.pop()]++;
        
//         int res=0;
//         for(int i=0;i<256;i++){
//             if(count[i]==n)res++;
//         }
//         return res;
//     }
// }
