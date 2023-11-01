class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[]arr1 = new int[n];
        arr1[0] = arr[0];
        for(int i = 1;i<n;i++){
            arr1[i] = arr1[i-1]^arr[i];
        }
        int[]res = new int[queries.length];
        for(int i = 0;i < queries.length;i++){
            int x = queries[i][0];
            int y = queries[i][1];

            res[i] = arr[x]^arr1[x]^arr1[y];
        }
        return res;
    }
}
