// class MyQueue {
//     Stack<Integer> temp;
//     Stack<Integer> s;
//     public MyQueue() {
//         s=new Stack<Integer>();
//         temp=new Stack<Integer>();
//     }
    
//     public void push(int x) {
//         while(!s.isEmpty()){
//             temp.push(s.pop());
//         }
//         s.push(x);
//          while(!temp.isEmpty()){
//             s.push(temp.pop());
//         }
//     }
    
//     public int pop() {
//         return s.pop();
//     }
    
//     public int peek() {
//         return s.peek();
//     }
    
//     public boolean empty() {
//         return s.isEmpty();
//     }
// }
