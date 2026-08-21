class Solution {
   
   //Given an array of integers nums and an integer target, return the indices i and j such that
   //nums[i] + nums[j] == target and i != j.
   //You may assume that every input has exactly one pair of indices i and j that satisfy the 
   //condition. Return the answer with the smaller index first. 
  
    public int[] twoSum(int[] nums, int target) {
        //nums[i] + nums[j] == target means target - nums[i] == nums[j]

        int[] index = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i], i);
            } else {
                index[0] = map.get(target - nums[i]);
                index[1] = i;
            }
        }
return index;
    }
}
