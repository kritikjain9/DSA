class Solution {
    public int[] plusOne(int[] arr) {
        int[] res = new int[arr.length];
        int[] brr = new int[arr.length];
        
        brr[arr.length - 1] = 1;
        
        int a = arr.length - 1, b = brr.length - 1;
        int carry = 0;
        
        int k = res.length - 1;
        
        while(k >= 0){
            
            int dig = arr[a] + brr[b] + carry;
            // carry = 0;
            
            carry = dig / 10;
            res[k] = dig % 10;
            
            a--;
            b--;
            k--;
        }
        
        if(carry > 0){
            int[] newRes = new int[res.length + 1];
            newRes[0] = carry;
            for(int i = 1; i < newRes.length; i++){
                newRes[i] = res[i-1];
            }
            return newRes;
        }
        
        // System.out.println(Arrays.toString(res));
        return res;
        
    }
}