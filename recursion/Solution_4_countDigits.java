package recursion;
public class Solution_4_countDigits {
    static int evenlyDivides(int n) {
        return rec(n, n);
    }
    
    private static int rec(int n, int x) {
        if(x == 0) return 0;
        int a = x%10;
        if(a != 0 && n%a == 0) return 1 +  rec(n, x/10);
        else return 0 +  rec(n, x/10);
    }
}