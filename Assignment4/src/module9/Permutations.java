
package module9;
import java.util.*;
public class Permutations {
 public static void main(String[] args) {

        int[] nums = {1,2,3};

        List<List<Integer>> result = new ArrayList<>();

        permute(nums, new ArrayList<>(), result);

        System.out.println(result);
    }

    static void permute(int[] nums, List<Integer> temp, List<List<Integer>> result){

        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int n:nums){

            if(temp.contains(n)) continue;

            temp.add(n);
            permute(nums,temp,result);
            temp.remove(temp.size()-1);
        }
    }
}  

