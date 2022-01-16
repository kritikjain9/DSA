class Solution {
    public int mostWordsFound(String[] arr) {
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            
            int len = arr[i].split(" ").length;
            
            if(len > maxLen)
                maxLen = len;
        }
        return maxLen;
    }
}