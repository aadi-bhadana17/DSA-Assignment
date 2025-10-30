package strings;
import java.util.*;

class Solution {

    public char getMaxOccurringChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int maxFreq = 0;
        char maxChar = '\0';

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }
}

public class Solution_4_getMaxOccurChar {
    public static void main(String[] args) {
        String s = "samplestring";
        Solution obj = new Solution();
        char ans = obj.getMaxOccurringChar(s);

        System.out.println("Max occurring character: " + ans);
    }
}