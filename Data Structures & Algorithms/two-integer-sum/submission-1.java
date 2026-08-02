class Solution {
   
   //Given an array of integers nums and an integer target, return the indices i and j such that
   //nums[i] + nums[j] == target and i != j.
   //You may assume that every input has exactly one pair of indices i and j that satisfy the 
   //condition. Return the answer with the smaller index first. 
    public int[] twoSum(int[] nums, int target) {
        
   //Okay. Can I use HashMap in this case? 

    //first Integer is the key, numbers in nums array. second Integer is the index. 
   Map<Integer, Integer> map = new HashMap<>();
   int[] twoIdx = new int[2];

    for(int i = 0; i < nums.length; i++){
        int numPiece = target - nums[i];

    //first, in map there are no number so nums[0] will be putting there. 
    //second time, nums[1], if targer - nums[i] is nums[0] it goes to else statement. 
    //if the numPiece is not nums[0] we put nums[1] in the map. 
        if(!map.containsKey(numPiece)){
            map.put(nums[i], i);
        } else{
            twoIdx[0] = map.get(numPiece);
            twoIdx[1] = i; 
            return twoIdx;
        }
    }
    return twoIdx;
    }
}
