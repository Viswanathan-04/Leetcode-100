class Solution {
    public void search(int index, int target, int[] arr, List<List<Integer>> ans, List<Integer> helper) {
        if (target == 0) {
            ans.add(new ArrayList<>(helper));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] > target) {
                break;
            }
            helper.add(arr[i]);
            search(i + 1, target - arr[i], arr, ans, helper);
            helper.remove(helper.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();
        search(0, target, candidates, ans, helper);
        return ans;
    }
}
