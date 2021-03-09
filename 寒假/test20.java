class Solution {
    public int findUnsortedSubarray(int[] nums) {
    int n = nums.length;
    int i = 0;
    int j = n - 1;
    int[] temp = nums.clone();
    Arrays.sort(temp);
    while(i < n && nums[i] == temp[i]) i++;
    while(j > i && nums[j] == temp[j]) j--;
    return j - i + 1;  
    }
}