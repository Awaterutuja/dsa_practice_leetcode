// Given an integer array nums of length n and an integer target, find three integers in nums such that the 
//sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

 

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// Example 2:

// Input: nums = [0,0,0], target = 1
// Output: 0
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

import java.util.Arrays;

public class ThreeSumCloset {
    public int threeSumCloset(int[] nums, int target){
        Arrays.sort(nums);
        int closetSum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length-2;i++){
           int start= i+1, end= nums.length-1;
           while(start<end){
             int sum = nums[i] +nums[start]+ nums[end];
             if(sum==target)
                return sum;
             if(Math.abs(target-sum) < Math.abs(target- closetSum))
                closetSum = sum;
            

             if(sum < target)
                start++;
             else
                end--;
           }
        }
        return closetSum;
    }
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        ThreeSumCloset obj = new ThreeSumCloset();
        System.out.println(obj.threeSumCloset(nums, target));
    }
}
