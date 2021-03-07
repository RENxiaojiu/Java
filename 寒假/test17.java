class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s == null || s.length() == 0) {
            return 0;
        }
        int a = 1;
        long ret = 0;
        int start = 0;
        if (s.charAt(0) == '+') {
            a = 1;
            start++;
        } else if (s.charAt(0) == '-') {
            a = -1;
            start++;
        }
        for (int i = start; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return (int) ret * a;
            }
            ret = ret * 10 + s.charAt(i) - '0';
            System.out.println(ret);
            if (a == 1 && ret > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (a == -1 && ret > Integer.MAX_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) ret * a;
    }
}