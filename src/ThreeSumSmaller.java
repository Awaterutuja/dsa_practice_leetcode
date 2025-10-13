// Given an array arr[] of distinct integers of size n and a value sum, the task is to find the count of triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.


// Examples :
// Input: n = 4, sum = 2, arr[] = {-2, 0, 1, 3}
// Output:  2
// Explanation: Below are triplets with sum less than 2 (-2, 0, 1) and (-2, 0, 3). 
// Input: n = 5, sum = 12, arr[] = {5, 1, 3, 4, 7}
// Output: 4
// Explanation: Below are triplets with sum less than 12 (1, 3, 4), (1, 3, 5), (1, 3, 7) and (1, 4, 5).

import java.util.Arrays;

public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int targetSum){
        Arrays.sort(nums);
        int count =0;
        for(int i=0;i< nums.length-2;i++){
            int start= i+1, end= nums.length-1;
            while(start< end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum<targetSum){
                    count+= end-start;
                    start++;
                }else
                    end--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {5, 1, 3, 4, 7};
        int targetSum = 12; 
        ThreeSumSmaller obj = new ThreeSumSmaller();
        System.out.println(obj.threeSumSmaller(nums, targetSum));
    }
}
