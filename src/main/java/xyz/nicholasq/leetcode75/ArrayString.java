package xyz.nicholasq.leetcode75;

public class ArrayString {

    // https://leetcode.com/problems/merge-strings-alternately
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        var count = 0;
        while (count < word1.length() || count < word2.length()) {
            if (count < word1.length()) {
                result.append(word1.charAt(count));
            }
            if (count < word2.length()) {
                result.append(word2.charAt(count));
            }
            count++;
        }
        return result.toString();
    }
}
