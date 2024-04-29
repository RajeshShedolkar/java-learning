import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {
    public static void main(String [] args){
        DuplicateElement obj = new DuplicateElement();
        int[] nums = new int[] {1, 2, 3};
        boolean out = obj.checkDuplicate(nums);
        System.out.println(Arrays.toString(nums) + " Duplicate element present: "+out);
    }

    public boolean checkDuplicate(int[] nums){
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
           if (!map.containsKey(nums[i]) ){
               map.put(nums[i], true);
           }else{
               return true;
           }
        }
        return false;
    }
}
