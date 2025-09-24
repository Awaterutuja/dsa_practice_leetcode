
/*
    Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

    You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

    

    Example 1:

    Input: nums = [1,2,0]
    Output: 3
    Explanation: The numbers in the range [1,2] are all in the array.
    Example 2:

    Input: nums = [3,4,-1,1]
    Output: 2
    Explanation: 1 is in the array but 2 is missing.
    Example 3:

    Input: nums = [7,8,9,11,12]
    Output: 1
    Explanation: The smallest positive integer 1 is missing. 
*/
public class First_Missing_Positive {
        public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        int ans = nums.length;
        for(int i=0;i<n;i++){
//             i = 0, nums[0] = 3 → should go index 2 → [2, 1, 3]
// Now nums[0] = 2 → should go index 1 → [1, 2, 3]
// Now nums[0] = 1 → correct place → stop swapping.
            while(nums[i] >= 1 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){
                int idx = nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i] != i+1)
                return i+1;
        }

        return n+1;
    }
    public static void main(String[] args) throws Exception {
        First_Missing_Positive fmp = new First_Missing_Positive();
        int[] nums = {3,4,-1,1};
        int result = fmp.firstMissingPositive(nums);
        System.out.println("First missing positive: " + result);
    }
    
}
