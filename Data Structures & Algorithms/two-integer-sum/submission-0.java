class Solution {
   
   //Given an array of integers nums and an integer target, return the indices i and j such that
   //nums[i] + nums[j] == target and i != j.
   //You may assume that every input has exactly one pair of indices i and j that satisfy the 
   //condition. Return the answer with the smaller index first. 
    public int[] twoSum(int[] nums, int target) {
        
        int[] index = new int[2];

        for(int i = 0; i < nums.length; i++){
          for(int x = i+1; x < nums.length; x++){
            if(nums[i] + nums[x] == target){
                index[0] = i;
                index[1] = x;
            }
          }
        }
        return index;
    }
}
