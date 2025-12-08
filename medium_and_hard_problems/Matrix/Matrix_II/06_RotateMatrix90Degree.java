class Solution {
    public void rotate(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int x=j;int y=i;
                if(x>i&&y<j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
        for(int i=0;i<m;i++){
            int s=0;int e=arr[i].length-1;
            while(s<e){
                int temp=arr[i][s];
                arr[i][s]=arr[i][e];
                arr[i][e]=temp;s++;e--;
            }
        }
    }
}
