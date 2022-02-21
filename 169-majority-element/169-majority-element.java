class Solution {
    public int majorityElement(int[] arr) {
//         int tar = arr.length / 2;
//         HashMap<Integer, Integer> hm = new HashMap<>();
        
//         for(int i = 0; i < arr.length; i++){
//             if(hm.containsKey(arr[i])){
//                 hm.put(arr[i], hm.get(arr[i]) + 1);
//             }
//             else
//                 hm.put(arr[i], 1);
            
//             if(hm.get(arr[i]) >= tar)
//                     return arr[i];
//         }
//         return -1;
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
}