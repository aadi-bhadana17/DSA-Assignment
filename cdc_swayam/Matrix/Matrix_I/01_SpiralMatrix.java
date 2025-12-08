// class Solution {
//     public ArrayList<Integer> spirallyTraverse(int[][] arr) {
//         // code here
//         ArrayList<Integer> res=new ArrayList<Integer>();
//         int n=arr.length;int m=arr[0].length;
//         int len=n/2;if(n%2==0)len--;
//         boolean[][] visited=new boolean[n][m];
//         int a1=0;int b1=0;
//         int a2=0;int b2=m-1;
//         int a3=n-1;int b3=m-1;
//         int a4=n-1;int b4=0;
        
//         for(int i=0;i<=len;i++){
//             for(int j=b1;j<=b2;j++){
//                 if(visited[a1][j])return res;
//                 res.add(arr[a1][j]);visited[a1][j]=true;visited[a1][j]=true;
//             }
            
//             for(int j=a1+1;j<=a3;j++){
//                 if(visited[j][b2])return res;visited[j][b2]=true;
//                 res.add(arr[j][b2]);
//             }
//             for(int j=b2-1;j>=b1;j--){
//                 if(visited[a3][j])return res;visited[a3][j]=true;
//                 res.add(arr[a3][j]);
//             }
//             for(int j=a3-1;j>a1;j--){
//                 if(visited[j][b4])return res;
//                 res.add(arr[j][b4]);visited[j][b4]=true;
//             }
//             a1++;b1++;
//             a2++;b2--;
//             a3--;b3--;
//             a4--;b4++;
//         }
    
//         return res;
//     }
// } 
