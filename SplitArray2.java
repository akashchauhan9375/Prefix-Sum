/*
 

This is the optimized approach to solve this problem 
time complexity will be O(N) 
 */



class SplitArray2{
    public static boolean Split(int arr[]){
        int leftSum =0;
        int rightSum =0;
        

        for(int num : arr){
            rightSum += num;
        }

        for(int i=0;i<arr.length;i++){
            rightSum -= arr[i];
            if(rightSum == leftSum){
                return true;
            }
            leftSum += arr[i];
        }
        return false;
    }
}

/*
 Another approach to solve this problem
class Solution {
    public boolean pivotIndex(int[] nums) {
        int totalSum =0;
        int sum =0;

        for(int num : nums){
            totalSum += num;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] == totalSum - (sum*2)){
                return true ;
            }
            sum += nums[i];
        }
        return false;
    }
}

 */