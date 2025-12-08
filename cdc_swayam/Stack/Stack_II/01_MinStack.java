// class MinStack {
//     Stack<Integer> s;
//     Stack<Integer> t;int min=(int)Math.pow(2,31);
//     public MinStack() {
//         s=new Stack<Integer>();
//         t=new Stack<Integer>();
//     }
    
//     public void push(int val) {
//         s.push(val);
//         if(min==(int)Math.pow(2,31))min=(int)val;
//         else
//         min=Math.min(min,(int)val);

//         t.push(min);
//     }
    
//     public void pop() {
        
//         int k= s.pop();
//         t.pop();
//         if(t.isEmpty())min=(int)Math.pow(2,31);
//         else min=(int)t.peek();
//     }
    
//     public int top() {
//         return (int)s.peek();
//     }
    
//     public int getMin() {
//         int a=(int)t.peek();
//         return a;
//     }
// }