
/*
 
leetcode 238 
Optimized Approach with time complexity O(n)
in this problem we have to find the array which consist of product of elemnts Except self


APPROACH -->
  WE WILL CALCULATE THE LEFT PRODUCT AND RIGHT PRODUCT AND ON MULTIPLYING BOTH WE WILL GET DESIRED RESULT
  AS WE WANT THE PRODUCT OF ALL THE ELEMENTS WE WILL GET IT BY DIVIDING IN TWO PARTS AS LEFT AND RIGHT PRODUCT
  AND AGAIN MULTIPLYING THESE TWO TO GET THE PRODUCT OF ALL THE ELEMENTS....WE ARE NOT INVOLVING SELF ELEMENT BECAUSE
  ONLY LEFT AND RIGHT PRODUCT IS CALCULATED
 */


class ProductExceptSelf2{
    public static int[] product(int nums[]){
        int left[] = new int[nums.length];
        int right [] = new int[nums.length];

        left[0] = 1;
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1] *nums[i-1];
        }

        right[nums.length-1] = 1;
        for(int i=nums.length-2;i>=0;i--){
            right[i] = right[i+1] * nums[i+1];
        }

        int ans[] = new int [nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
    public static void main(String st[]){
        int nums [] = {1,2,3,4};
       int res [] = product(nums);
       for(int i=0;i<nums.length;i++){
        System.out.println(res[i]);
       }

    }
}