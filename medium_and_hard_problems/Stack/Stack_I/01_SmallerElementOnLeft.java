// class Complete {

//     // Function for finding maximum and value pair
//     public static int[] Smallestonleft(int arr[], int n) {
//         Stack<Integer> s=new Stack<>();
//         int[] res=new int[arr.length];
//         Arrays.fill(res,-1);
//         int x=0;
//         for(int i=0;i<n;i++){
//             while(!s.isEmpty()&&arr[s.peek()]<arr[i]){
//                 res[i]=arr[s.pop()];
//             }
//             s.push(i);
//         }
//         return res;
//     }
// }
