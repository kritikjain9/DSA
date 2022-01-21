class Solution {
    public int[] intersect(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < A.length && j < B.length){
            if(A[i] == B[j]){
                list.add(A[i]);
                i++; j++;
            }
            else if(A[i] < B[j])
                i++;
             else
                j++;
        }
        
        return list.stream().mapToInt(k -> k).toArray();
    }
}