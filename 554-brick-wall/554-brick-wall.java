class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        //here, the least number of bricks will be the same as the most number of spaces
//         and its pretty obviuos that min bricks crossed = max empty spaces crossed
        
        int res = 0;
            
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < wall.size(); i++){
            //inner loops 
            int preSum = 0;
            
            List<Integer> currList = wall.get(i);
            for(int j = 0; j < currList.size() - 1; j++){
                preSum += currList.get(j);
                map.put(preSum, map.getOrDefault(preSum, 0) + 1);
                
                //checking if its the largest
                res = Math.max(res, map.get(preSum));
            }
        }
        
        return (wall.size() - res);
    }
}