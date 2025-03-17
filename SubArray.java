
/*
 
LEETCODE - 3427
You are given an integer array nums of size n. For each index i where 0 <= i < n,
 define a subarray nums[start ... i] where start = max(0, i - nums[i]).
Return the total sum of all elements from the subarray defined for each index in the array.

SOLUTION -->
In this question we have find the sum of Subarray's sum whose indexing will start from max(0,i-arr[i]) to i
So first we will create a function which will calculate the Subarray sum of the given range......
we will create another function to return the resultant sum in which we will iterate over whole array and calculate 
the value for start index and this value will be passed to previously created function to calculate the sum
 */

class SubArray{

    public static int getSum(int arr[],int start,int end){
        int ans = 0;
        for(int j=start;j<=end;j++){
            ans += arr[j];
        }
        return ans;
    }
    public static int Sum(int arr[]){
            int sum =0;
            for(int i=0;i<arr.length;i++){
                int start = Math.max(0,i-arr[i]);
                sum += getSum(arr,start,i);

            }
            return sum;
        }
    }
