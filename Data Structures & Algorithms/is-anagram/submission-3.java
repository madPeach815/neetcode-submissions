//Given two strings s and t, return true if the two strings are anagrams of each other, 
//otherwise return false. 
//Two strings are anagrams if they contain the same characters, with each character appearing the same number of times, regardless of order. 

class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, 1);
            } else{
                map.put(c, map.get(c) + 1);
            }
        }
    Map<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(!map2.containsKey(c)){
                map2.put(c, 1);
            } else{
                map2.put(c, map2.get(c) + 1);
            }
        }

        return map.equals(map2);

    }
}
