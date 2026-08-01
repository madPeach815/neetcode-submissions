//Given two strings s and t, return true if the two strings are anagrams of each other, 
//otherwise return false. 
//An Anagram is a string that contains the exact same characters as another string, but the 
//order of the characters can be different. 

class Solution {
    public boolean isAnagram(String s, String t) {

        //check the length first. because if they have different length, we don't even need to check
        //the spelling. 

        if(s.length() != t.length()){
            return false;
        }

        //check if s and t are exactly same word. so we can save time.
        if(s.equals(t)){
            return true;
        }

        //since it is comparing 2 Strings, it is btter we sort them and then compare. 
        //Before we sorting 2 arrays, we need to make this strings to char array. 
        //We can also use char[] sArr = s.toCharArray(); char[] tArr = t.toCharArray();
        //We can make string array but for time and memory, primitive char array is much better
        //choice. 
     char[] sArr = new char[s.length()];
        for(int i = 0; i < sArr.length; i++){
            sArr[i] = s.charAt(i);
            }
     char[] tArr = new char[t.length()];
        for(int i = 0; i < tArr.length; i++){
            tArr[i] = t.charAt(i);
             }

    Arrays.sort(sArr);
    Arrays.sort(tArr);

    //for comparing 2 arrays we need to use Arrays.equals();
    return Arrays.equals(sArr, tArr);

    }
}
