class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        combisum(res, k, n, 1, new ArrayList<>());
        return res;
    }
    private void combisum(List<List<Integer>> res, int k, int n, int i, List<Integer> cur){
        if(n == 0 && k == 0){
            res.add(new ArrayList<>(cur));
        }
        if(i > n || k == 0 || i == 10){
            return;
        }
        cur.add(i);
        combisum(res, k - 1, n - i, i + 1, cur);
        cur.remove(cur.size() - 1);
        combisum(res, k, n, i + 1, cur);
    }
}
