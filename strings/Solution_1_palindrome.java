package strings;
public class Solution_1_palindrome {
    public boolean isPalindrome(String s) {
        if(s.length()<=1) return true;
        String st = s.replaceAll("[^a-zA-Z0-9]","");
        st=st.toLowerCase();

        int i=0, j=st.length()-1;

        while(i<=j){
            if(st.charAt(i)==st.charAt(j)){
                i++;
                j--;
            }
            else return false;
        } return true;
    }
}