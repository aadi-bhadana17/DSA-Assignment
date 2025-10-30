package recursion;
public class Solution_2_reverseExponentiation {
    public int reverseExponentiation(int n) {
        int x = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        int ans = power(x, rev);
        return ans;
    }

    private int power(int x, int rev) {
        if (rev == 0) return 1;

        int half = power(x, rev / 2);
        int result = half * half;

        if (rev % 2 != 0) result *= x;

        return result;
    }
}
