// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    
    int count(int[] arr, int n, int tar) {
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == tar)
                count++;
        }
        return count;
    }
    
    int _count(int[] arr, int n, int tar) {
        int st = 0, end = arr.length - 1;
        
        int mid = (st + end) / 2;
        
        int lRes = leftBinarySearch(arr, tar, st, mid);
        int rRes = leftBinarySearch(arr, tar, mid, end);
        
        return lRes + rRes + 1;
        
    }
    
    int leftBinarySearch(int[] arr, int tar, int st, int end){
        int res = 0;
        while(st <= end){
            int mid = (st + end) / 2;
            if(arr[mid] == tar){
                res += 1;
                end = mid - 1;
            }
            else if(arr[mid] > tar){
                end = mid - 1;
            }
            else if(arr[mid] < tar){
                st = mid + 1;
            }
        }
        return res;
    }
    
    int rightBinarySearch(int[] arr, int tar, int st, int end){
        int res = 0;
        while(st <= end){
            int mid = (st + end) / 2;
            if(arr[mid] == tar){
                res += 1;
                st = mid + 1;
            }
            else if(arr[mid] > tar){
                end = mid - 1;
            }
            else if(arr[mid] < tar){
                st = mid + 1;
            }
        }
        return res;
    }
    
}