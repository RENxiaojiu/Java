class Solution {
    public String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        int a = arr.length;
        int left = 0;
        int right = a - 1;
        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        S = String.valueOf(arr);
        return S;
    }
}