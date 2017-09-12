package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 * */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int result = target-nums[i];
            if(resultMap.containsKey(result)){
                return new int[]{i, resultMap.get(result)};
            }
            resultMap.put(nums[i], i);
        }
        return new int[]{};
    }

    public int[] twoSum01(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int firstValue = nums[i];
            for(int j=i+1;j<nums.length;j++){
                int sum = firstValue+nums[j];
                if(target == sum){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
