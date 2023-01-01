/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    let sum = 0;
    
    for(let i = 1; i < nums.length; i++){
        // console.log(num);
        nums[i] = nums[i] + nums[i - 1];
    }
    
    return nums;
};