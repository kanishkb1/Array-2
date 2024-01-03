//Brute-force approach- We can search for every number and if any number is missing will return the list.
//Time complexity- O(N*N)
//Space Complexity- O(1)

//Optimized Approach: We mark the presence of each number by negating the value at the corresponding index in the array.
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        
        //if the value at 'idx' is positive, it means value present at the number(idx+1) is present and negates the value of current element
        for(int i=0;i<nums.length;i++){
                int idx = Math.abs(nums[i]) - 1;
                if(nums[idx]>0){
                    nums[idx] = nums[idx] * -1;
                }
        }

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
            
        }
        return result;
    }
}