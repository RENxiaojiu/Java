方法一：
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String a = str.toUpperCase();
        String b = str.toLowerCase();
        System.out.println(a);
        System.out.println(b);
    }

方法二：
class Solution {
    public String toLowerCase(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] += 32;
            }
        }
        String a = String.valueOf(arr);
        return a;
    }
}