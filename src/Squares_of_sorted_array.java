// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

// Example 1:

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
// Example 2:

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]


public class Squares_of_sorted_array {
    public int[] sortedSquare(int[] nums){
        int n= nums.length;
        int[] ans = new int[n];

        int start =0, end= n-1;
        int idx=n-1;
        while(start != end){
            if(Math.abs(nums[start]) < Math.abs(nums[end])){
                ans[idx--] =nums[end] * nums[end];
                end--;
            }else{
                ans[idx--] = nums[start] * nums[start];
                start++;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        Squares_of_sorted_array obj = new Squares_of_sorted_array();
        int[] result = obj.sortedSquare(nums);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
