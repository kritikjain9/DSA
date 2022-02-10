class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j] && !(al.contains(nums1[i])))
                    al.add(nums1[i]);
            }
        }
        return al.stream().mapToInt(i -> i).toArray();
    }
}