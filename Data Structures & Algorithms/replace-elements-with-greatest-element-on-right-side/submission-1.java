class Solution {
    public int[] replaceElements(int[] arr) {
        // max is -1. if arr[i] is bigger than max. max will get arr[i] and arr[i] will get max. if
        // arr[i] is smaller than max? arr[i] will get max.
       int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int newMax = Math.max(max, arr[i]);
            arr[i] = max;
            max = newMax;
        }
        return arr;
    }
}