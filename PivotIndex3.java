
// TC - O(N) and SC O()
/*
 This is also the most optimized approach to solve this problem 
in this approach first we calculates the total sum by iterating over the whole array and initialised one variable "sum with o"
and after it since we know that totalSum = sum(left) + sum(right) + num[i]
                            ==>> num[i] = totalSum - 2*sum
                    num[i] will return the element and i will return the index at which leftSum and rightSum will be equal..

 */

class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum =0;
        int sum =0;

        for(int num : nums){
            totalSum += num;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] == totalSum - (sum*2)){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}