class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer, Boolean> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i], false);
        }else {
            return true;
        }
       }
        return false;
    }
}