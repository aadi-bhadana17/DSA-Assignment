// class Solution {
//     public int evaluatePostfix(String[] arr) {
//         // code here
//         Stack<Integer> s=new Stack<Integer>();
       
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             String x=arr[i];
//             if(x.equals("+")){
//                 int a=s.pop();
//                 int b=s.pop();
//                 s.push(a+b);
//             }else if(x.equals("-")){
//                 int a=s.pop();
//                 int b=s.pop();
             
//                 s.push(b-a);
//             }else if(x.equals("*")){
//                 int a=s.pop();
//                 int b=s.pop();
//                 s.push(b*a);
//             }else if(x.equals("/")){
//                 int a=s.pop();
//                 int b=s.pop();
//                 float temp=(float)b/a;
//                 if(temp<0){
//                     s.push((int)Math.floor(temp));
//                 }else{
//                     s.push((int)temp);
//                 }
//             }else if(x.equals("^")){
//                 int a=s.pop();
//                 int b=s.pop();
//                 float temp=(float)(Math.pow(b,a));
//                 if(temp<0){
//                     s.push((int)Math.floor(temp));
//                 }else{
//                     s.push((int)temp);
//                 }
                
//             }else{
//                 s.push(Integer.parseInt(x));
//             }
//         }
//         return s.pop();
//     }
// }