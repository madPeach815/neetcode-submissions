class Solution {

    //Return true if any value appears more than once in the array. 
    //otherwise return false
    public boolean hasDuplicate(int[] nums) {
     
if(nums != null){
   
     Set<Integer> set = new HashSet<>();

     for(int i = 0; i < nums.length; i++){
        if(!set.contains(nums[i])){
            set.add(nums[i]);
        }else {
            return true;
        }
     }
    }

    return false;
}
}