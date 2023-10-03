class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max_diff = 0;
        if(nums.length == 1) {
            return 0;
        } 
        for(int i=0;i<nums.length-1;i++) {
            int curr_diff = nums[i+1]-nums[i];
            if(curr_diff > max_diff) {
                max_diff = curr_diff;
            }
        }
        return max_diff;
    }
}
