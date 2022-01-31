class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int num : arr){
            ts.add(num);
        }
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int rank = 1;
        for(int num : ts){
            hm.put(num, rank++);
        }
        
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            res[i] = hm.get(arr[i]);
        }
        
        return res;
    }
}