class Solution {
    //You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] = nums[i] and ans[i+n] == nums[i] for 0 <= i < n.
    public int[] getConcatenation(int[] nums) {
        
        int[] ans = new int[nums.length * 2];

        for(int i  = 0; i < ans.length; i++){
            ans[i] = nums[i-nums.length < 0 ? i : i - nums.length];
        }
     return ans;
    }
}