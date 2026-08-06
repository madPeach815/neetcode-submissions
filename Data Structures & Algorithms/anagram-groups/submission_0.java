class Solution {

//Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order. An anagram is a string that contains.the exact same characters as another string, but the order of the characters can be different. 
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

      for(int i = 0; i < strs.length; i++){
        //We don't need new here. toCharArray() includes it. 
        char[] c = strs[i].toCharArray();
        Arrays.sort(c);
        //New String that hold the sorted String for key. 
        String key = String.valueOf(c);

        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(strs[i]);
      }

    List<List<String>> result = new ArrayList<>();
    result.addAll(map.values());
    return result;

    }
}
