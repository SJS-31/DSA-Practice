class RecCombinationSum {

    public static void solve(int[]candidates, ArrayList<Integer> output,int target, int index, ArrayList<ArrayList<Integer>> ans) {
        
       if(index==candidates.length) {
           if (target == 0) {
            ans.add(new ArrayList<>(output));
            
        }
        return;
       }
       

        
        
        if(candidates[index]<=target){
        int element = candidates[index];
        output.add(element);
        solve(candidates, output, target-element, index, ans);
        output.remove(output.size() - 1); // Backtrack
        }
        

        
        
        solve(candidates, output, target, index+1, ans);

    
    }

   
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        int index =0;
        
        solve(candidates, output, target, index, ans);
        // Collections.sort(ans);
        return new ArrayList<>(ans);
    }
}