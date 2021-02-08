class Solution {
    public int strStr(String haystack, String needle) {
        // 借鉴其他人的思路和代码
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i < n - m + 1; i++) {
            String sub = haystack.substring(i, i + m);
            if (sub.equals(needle)) return i;
        }
        return -1;
    }
}
