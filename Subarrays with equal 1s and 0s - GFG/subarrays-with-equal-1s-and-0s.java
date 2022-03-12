// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        int sum = 0;
        int res = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, 1);
        
        for(int num : arr){
            if(num == 0){
                sum += -1;
            }else{
                //num == 1
                sum += 1;
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, 1);
            }else{
                res += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            }
        }
        return res;
    }
}


