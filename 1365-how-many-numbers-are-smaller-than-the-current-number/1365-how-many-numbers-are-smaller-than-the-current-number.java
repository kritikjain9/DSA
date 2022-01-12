class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int freq = 0;
            for(int j = 0; j < res.length; j++){
                if(arr[i] == arr[j]){
                    continue;
                }else if(arr[i] > arr[j]){
                    freq++;
                }
                res[i] = freq;
            }
        }
        return res;
    }
}