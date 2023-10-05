class Solution {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public int subarrayGCD(int[] nums, int k) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == k) {
                res++;
            }
            int gcd = nums[i];
            for (int j = i + 1; j < n; j++) {
                gcd = gcd(gcd, nums[j]);
                if (gcd == k) {
                    res++;
                }
            }
        }
        return res;   
    }
}
