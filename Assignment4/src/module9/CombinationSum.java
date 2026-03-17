
package module9;
import java.util.*;
public class CombinationSum {
public static void main(String[] args) {

        int[] nums = {2,3,6,7};
        int target = 7;

        List<List<Integer>> result = new ArrayList<>();

        find(nums,target,0,new ArrayList<>(),result);

        System.out.println(result);
    }

    static void find(int[] nums,int target,int start,List<Integer> temp,List<List<Integer>> result){

        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }

        if(target<0) return;

        for(int i=start;i<nums.length;i++){

            temp.add(nums[i]);

            find(nums,target-nums[i],i,temp,result);

            temp.remove(temp.size()-1);
        }
    }
}

