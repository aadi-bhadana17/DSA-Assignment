// class Solution {
//     public int[] asteroidCollision(int[] arr) {
//         ArrayDeque<Integer> s=new ArrayDeque<Integer>();
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             int temp=arr[i];
//             boolean check=false;
//             while(s.isEmpty()==false&&(s.peekLast()>0&&temp<0)){
//                 if(Math.abs(s.peekLast())==Math.abs(temp)){
//                     s.removeLast();check=true;break;
//                 }else if(Math.abs(s.peekLast())>Math.abs(temp)){
//                     check=true;break;
//                 }else{
//                     s.removeLast();
//                 }
//             }
//             if(!check)s.addLast(temp);
//         }
//         int x=0;
//         int[] res=new int[s.size()];
//         while(s.isEmpty()==false){
//             res[x++]=s.removeFirst();
//         }
//         // System.out.println(s);
        
//         return res;
//     }
// }