class Solution {
    //You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] = nums[i] and ans[i+n] == nums[i] for 0 <= i < n.
    public int[] getConcatenation(int[] nums) {
        
        int[] ans = new int[nums.length * 2];

        for(int i  = 0; i < nums.length; i++){
           ans[i] = nums[i];
           ans[i + nums.length] = nums[i];
        }
     return ans;
    }
}