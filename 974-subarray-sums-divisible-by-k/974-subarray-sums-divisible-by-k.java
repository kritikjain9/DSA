class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        if(arr.length == 1 && Math.abs(arr[0]) == k){
            return 1;
        }else if(arr.length == 1 && arr[0] != k){
            return 0;
        }
        
        //negative ka why kyun use ho raha hai
        int sum = 0, res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(sum, 1);
        
        for(int val : arr){
            sum += val;
            
            //hashmap processing
            int foundVal = sum % k;
            if(foundVal < 0){
                foundVal += k;
            }
            
            if(!map.containsKey(foundVal)){
                map.put(foundVal, 1);
            }
            else{
                res += map.get(foundVal);
                map.put(foundVal, map.get(foundVal) + 1);
            }
            
        }
        return res;
    }
}