package recursion;
public class Solution_7_fibonacci {
    public int nthFibonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}