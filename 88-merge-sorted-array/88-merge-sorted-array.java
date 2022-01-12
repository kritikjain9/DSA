class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] n1Copy = new int[m];
        for(int i = 0; i < m; i++){
            n1Copy[i] = nums1[i];
        }
        
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(n1Copy[i] <= nums2[j]){
                nums1[k] = n1Copy[i];
                i++; k++;
            }
            else{
                nums1[k] = nums2[j];
                j++; k++;
            }
        }
        
        for(int rem = i;  rem < m; rem++){
            nums1[k] = n1Copy[rem];
            k++;
        }
        
        for(int rem = j;  rem < n; rem++){
            nums1[k] = nums2[rem];
            k++;
        }
        
    }
}