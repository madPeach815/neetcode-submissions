class Solution {
    
    //case insensitive, ignores num or " "
    //How to make ignore.. all other characters except letters.
    public boolean isPalindrome(String s) {

        String newS = s.toLowerCase();
        //Was it a car or a cat I saw? 
        //was it a car or a cat i saw?
        //0p
        ArrayList<Character> list = new ArrayList<>();

        //length 28 
        for (int i = 0; i < newS.length(); i++) {
            if ((newS.charAt(i) >= 'a' && newS.charAt(i) <= 'z') || (newS.charAt(i) >= '0' && newS.charAt(i) <= '9')){
                list.add(newS.charAt(i));
            }
        }
        //0p 2/2 = 1
        //wasitacaroracatisawv 19/2 = 9
        
        for (int i = 0; i < list.size()/2; i++){
            if (list.get(list.size() - 1 - i) != list.get(i)){
                return false;
            }
        }
        return true;
    }
}
