class Solution {
    public int lengthOfLastWord(String s) {
        char[] a = s.toCharArray();
        int count = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == ' ' && count != 0) {
                break;
            } else if (a[i] != ' ') {
                count++;
            }
        }
        return count;
    }
}