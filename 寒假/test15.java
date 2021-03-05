class Solution {
    public int thirdMax(int[] nums) {
        int first = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > first) {
                first = nums[i];
            }
        }
        int second = min;
        for (int i = 0; i < nums.length; i++) {
            if (first > nums[i] && second < nums[i]) {
                second = nums[i];
            }
        }
        int third = min;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < second && third < nums[i]) {
                third = nums[i];
            }
        }
        if (nums.length < 3 || min == second) {
            return first;
        }
        return third;
    }
}