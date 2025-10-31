package recursion;
public class Solution_3_printNumber {
    static void printTillN(int n) {
       if(n==0) return;
       printTillN(n-1);
       System.out.print(n + " ");
    }
}