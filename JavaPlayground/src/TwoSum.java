import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String [] args){
        TwoSum obj = new TwoSum();
        int[] out = obj.twoSum2(new int[] {1, 2, 3}, 4);
        System.out.println(Arrays.toString(out));

    }

    public int[] twoSum1(int [] nums, int target){
        System.out.println("Inside twoSum Method");
        for (int i=0; i < nums.length; i++){
            for (int j=i+1;j < nums.length; j+=1){
                if( nums[i] + nums[j] == target ){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for (int i=0; i < nums.length; i++ ){
            System.out.println(i);
            int other_ele = target - nums[i];
            if(map.containsKey(other_ele) && map.get(other_ele) != i) {
                return new int[] {i, map.get(other_ele)};
            }
        }

        return null;
    }
}
