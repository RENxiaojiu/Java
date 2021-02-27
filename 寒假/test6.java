class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        long count = 10;
        long num = 0;
        long y = x;
        while (x != 0) {
            num = x % 10 + count * num;
            x /= 10;
        }
        return y == num;
    }
}