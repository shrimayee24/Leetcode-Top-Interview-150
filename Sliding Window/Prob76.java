//minimum window substring
class Prob76 {
    public String minWindow(String s, String t) {
        // Step 1: Edge case check
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        // Step 2: Store how many times each char appears in 't'
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        // Step 3: Variables for window tracking
        int left = 0;        // left pointer
        int right = 0;       // right pointer
        int required = need.size();  // number of unique chars needed
        int formed = 0;      // number of unique chars that meet their required count

        Map<Character, Integer> windowCounts = new HashMap<>();
        int minLen = Integer.MAX_VALUE;  // track smallest window length
        int start = 0;                   // start index of smallest window

        // Step 4: Expand the right pointer (move the window)
        while (right < s.length()) {
            char c = s.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            // If the current char's count matches what's needed, increment 'formed'
            if (need.containsKey(c) && windowCounts.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            // Step 5: Try to shrink window from the left while it still satisfies 't'
            while (left <= right && formed == required) {
                // Update the result if current window is smaller
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Remove the leftmost char (shrink window)
                char leftChar = s.charAt(left);
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);

                // If that character was part of 't' and now count < needed, decrease 'formed'
                if (need.containsKey(leftChar) && windowCounts.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                // Move left pointer ahead to shrink window
                left++;
            }

            // Expand right side of the window
            right++;
        }

        // Step 6: Return the smallest window substring found
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
