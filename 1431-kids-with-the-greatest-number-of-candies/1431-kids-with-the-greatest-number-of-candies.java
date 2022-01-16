class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int cand) {
        ArrayList<Boolean> res = new ArrayList<>();
        
        int maxC = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > maxC)
                maxC = num;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] + cand >= maxC)
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }
}