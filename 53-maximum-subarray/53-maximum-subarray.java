class Solution {
    public int maxSubArray(int[] arr) {
        int maxSum = arr[0], currSum = arr[0];
        int i = 1;
        
        while(i < arr.length){
            //if the some from previous terms is +ve, then we'll add the current element in that only
            
            
            
            if(currSum >= 0)
                currSum += arr[i];
            else
                //if the current sum is -ve, then its better that we start counting the new sum from our currrent element
                currSum = arr[i];
            
            if(currSum >= maxSum)
                maxSum = currSum;
            i++;
        }
        return maxSum;
    }
}