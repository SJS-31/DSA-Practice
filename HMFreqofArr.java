import java.util.*;

public class HMFreqofArr {
    public static void main(String[] args) {
        int[] arr={1,1,2,1,8,5,5,3,3};

        Map<Integer, Integer> freq = new HashMap<>();

        for(var e:arr){
            if(!freq.containsKey(e)){
                freq.put(e, 1);
            }
            else{
                freq.put(e, freq.get(e)+1);
            }
        }
        System.out.println(freq.entrySet());

    }
}
