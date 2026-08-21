class Solution {

    //Return true if any value appears more than once in the array. 
    //otherwise return false
    public boolean hasDuplicate(int[] nums) {
        //use hashset. 
        
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
            } else {
                return true;
            }
        }
        return false;
}
}