方法一：
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.contains(ransomNote)) {
            return true;
        } else {
            return false;
        }
    }
}


方法二：
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine ==null) {
            return false;
        }
        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray();
        for (int i = 0; i < ransomNote.length(); i++) {
            int j = 0;
            for (;j < magazine.length();) {
                if (a[i] == b[j]) {
                    b[j] = '\0';
                    break;
                } else {
                    j++;
                }
            }
            if (j == magazine.length()) {
                return false;
            }
        }
        return true;
    }
}