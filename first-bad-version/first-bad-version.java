/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int st = 1, end = n;
        while(st < end){
            int mid = st + (end - st) / 2;
            //logic
            
            if(isBadVersion(mid)){
                end = mid;
            }
            else{
                st = mid + 1;
            }
        }
        return st;
    }
}