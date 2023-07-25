import java.util.ArrayList;
import java.util.Collections;

public class RecSubset {
    public static void solve(ArrayList<Integer> arr, ArrayList<Integer> output, int index, ArrayList<Integer> ans) {
        
        if(index>=arr.size())
        {
            
            int temp=0;
            for(int i=0; i<output.size(); i++)
            {
              temp = temp + output.get(i);
            }
            ans.add(temp);
            return;
        }
        
        // solve(arr, output, index+1, ans);
        
        // int element = arr.get(index);
        // output.add(element);
        // solve(arr, output, index+1, ans);

        output.add(arr.get(index));
        solve(arr, output, index + 1, ans);

        output.remove(output.size() - 1); // Remove the last element
        solve(arr, output, index + 1, ans);
    }
    
    public static void main(String[] args){
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        ArrayList<Integer> output = new ArrayList<>();
        int index =0;
        
        solve(arr, output, index, ans);
        Collections.sort(ans);
        System.out.println(ans);

    }
}
