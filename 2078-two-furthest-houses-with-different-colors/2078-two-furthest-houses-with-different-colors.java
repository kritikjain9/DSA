class Solution {
    public int maxDistance(int[] arr) {
        int n = arr.length;
        
        int fh = 0, lh = n - 1;
        if(arr[fh] != arr[lh]){
            return lh;
        }
        
        while(arr[fh] == arr[lh]){
            lh -= 1;
        }
        
        int s = 0, e = n - 1;
        while(arr[s] == arr[e]){
            s += 1;
        }
        s = n - s - 1;
        return (s > lh) ? s : lh;
        
    }
}