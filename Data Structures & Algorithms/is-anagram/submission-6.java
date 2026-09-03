//Given two strings s and t, return true if the two strings are anagrams of each other, 
//otherwise return false. 
//Two strings are anagrams if they contain the same characters, with each character appearing the same number of times, regardless of order. 

class Solution {
    public boolean isAnagram(String s, String t) {

    if(s.length() == t.length()){
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();

    for(int i = 0; i < s.length(); i++){
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);
        map1.put(c1, map1.getOrDefault(c1, 0) +1);
        map2.put(c2, map2.getOrDefault(c2, 0) +1);
    }
    return map1.equals(map2);
    }
    return false;
    }
}
