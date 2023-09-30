class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int  l = nums.length;
        int min_diff = nums[l-1] - nums[0];
        
        if(l == 1)
            return 0;
        
        for(int i=0;i<l-1;i++)
        {
            int a = Math.min(nums[0]+k , nums[i+1]-k);
            int b = Math.max(nums[l-1]-k , nums[i]+k);
            min_diff = Math.min(min_diff,b-a);
        }
        return min_diff;
    }
}
