// class StockSpanner {
//     Stack<int[]> s;
//     public StockSpanner() {
//         s=new Stack<int[]>();
//     }
    
//     public int next(int price) {
//         int count=1;
//         while(s.isEmpty()==false&&s.peek()[0]<=price){
//             count+=s.pop()[1];
//         }
//         s.push(new int[]{price,count});
//         return count;
//     }
// }