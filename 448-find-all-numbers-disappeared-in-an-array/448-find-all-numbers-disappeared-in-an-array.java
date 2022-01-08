class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        
        Arrays.sort(nums);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(!hs.contains(i)){
                al.add(i);
            }
        }
        return al;
    }
}