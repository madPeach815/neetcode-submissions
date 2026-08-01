//Given two strings s and t, return true if the two strings are anagrams of each other, 
//otherwise return false. 
//An Anagram is a string that contains the exact same characters as another string, but the 
//order of the characters can be different. 

class Solution {
    public boolean isAnagram(String s, String t) {

        //null check
        if(s == null || t == null){
            return false;
        }

        //first check if they are exactly same.
        if(s.equals(t)){
            return true;
        }
        //check if they has different length.
        if(s.length() != t.length()){
            return false;
        }

        //otherwise, we can sort the string order and compare if they are equal.
        //let's make them as a char array.
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        //we can also make char array and put each one using a loop.
        //char[] sArr = new char[s.length()];
        //for(int i = 0; i < sArr.length; i++){
        //sArr[i] = s.charAt(i); }

        //now we need to sort.
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}
