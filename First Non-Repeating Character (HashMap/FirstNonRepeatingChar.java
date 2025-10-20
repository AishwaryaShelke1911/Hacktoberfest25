import java.util.*;

public class FirstNonRepeatingChar {

    public static char findFirstUnique(String str) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeating character
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '_'; // Return '_' if no unique character exists
    }

    public static void main(String[] args) {
        String str = "hacktoberfest";
        char result = findFirstUnique(str);

        if (result != '_')
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found.");
    }
}
