/*

Leetcode - 3432

 You are given an integer array nums of length n.
A partition is defined as an index i where 0 <= i < n - 1, splitting the array into two non-empty subarrays such that:
Left subarray contains indices [0, i].
Right subarray contains indices [i + 1, n - 1].
Return the number of partitions where the difference between the sum of the left and right subarrays is even.
Example 1:
Input: nums = [10,10,3,7,6]
Output: 4
Explanation:
The 4 partitions are:
--> [10], [10, 3, 7, 6] with a sum difference of 10 - 26 = -16, which is even.
--> [10, 10], [3, 7, 6] with a sum difference of 20 - 16 = 4, which is even.
--> [10, 10, 3], [7, 6] with a sum difference of 23 - 13 = 10, which is even.
--> [10, 10, 3, 7], [6] with a sum difference of 30 - 6 = 24, which is even.


SOLUTION-->
In this question first we will calculate the total sum then we calculate the leftSum and rightSum using for loop and on each iteration
we will be checking the difference of leftSum and rightSum is divisible by 2 or not....If yes then we will increase the 
counter with 1.
 */

class Partition{
    public static int CountPartition(int arr[]){
    int count =0;
    int totalSum =0;
    for(int i=0;i<arr.length;i++){
        totalSum += arr[i];
    }
    int leftSum = 0;
    for(int j=0;j<arr.length-1;j++){
        leftSum += arr[j];

        if(leftSum -((totalSum-leftSum)) % 2 == 0){
            count++;
        }
    }
    return count;
}
}