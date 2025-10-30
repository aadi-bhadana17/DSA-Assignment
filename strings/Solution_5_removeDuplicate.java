package strings;

public class Solution_5_removeDuplicate {
    String removeDuplicates(String s) {
        char ch [] = new char[256];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(ch[c] == 0) {
                sb.append(c);
                ch[c]++;
            }
        }
        
        return sb.toString();
    }
}
