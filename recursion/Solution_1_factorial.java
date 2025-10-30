package recursion;
public class Solution_1_factorial {
  
    int factorial(int n) {
      if(n==1) return 1;
      
      return n*factorial(n-1);
    }
}
