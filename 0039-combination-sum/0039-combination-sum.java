class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    
    private void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> res){
        
        if(index == candidates.length){
            if(target == 0)
                ans.add(new ArrayList<>(res));
            return;
        }
        
        if(candidates[index] <= target){
            res.add(candidates[index]);
            findCombinations(index, candidates, target - candidates[index], ans, res);
            res.remove(res.size() - 1);
        }
        findCombinations(index + 1, candidates, target, ans, res);
    }
}