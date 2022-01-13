class Solution {
    public double average(int[] arr) {
        Arrays.sort(arr);
        double avg = 0, count = 0;
        for(int i = 1; i < arr.length - 1; i++){
            avg += arr[i];
            count++;
        }
        return (avg / count);
    }
}