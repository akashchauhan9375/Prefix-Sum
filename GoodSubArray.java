/* 
 LEETCODE --> 523

 Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

A good subarray is a subarray where:
its length is at least two, and
the sum of the elements of the subarray is a multiple of k.
Note that:
A subarray is a contiguous part of the array.
An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.

SOLUTION -->

In this problem first we will be calculating the prefix Sum and then on dividing the prefix sum by k we will analyse
that remainder gets repeated and sometimes remainder will be zero....this means there will be the multiple of k between
the elements where remainder is repeated because dividend is created by adding the numbers only so there exist the multiple
of k......
We will iterate through the wgole array and calculate the prefixSum and finds the remiander on each iteration
After it we will check if rem is 0 and index is greater than or equal to 1 as 0 to index 1 will be 2 elements.
In next step we check if rem is present in HashMap or not if not then we will add it with index in HashMap and if yes then we 
will check that index value is equals to greater than 2. 
*/


import java.util.HashMap;
class GoodSubArray{
    public static boolean checkArray(int arr[],int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int prefix = 0;
        for(int i=0;i<arr.length;i++){
            prefix += arr[i];
            int rem = prefix % k;

            if(rem == 0 && i>=1){
                return true;
            }

            if(hm.containsKey(rem)){
                int idx = hm.get(rem);
                if(i-idx>=2){
                    return true;
                }
            }
            else{
                hm.put(rem,i);
            }
        }
        return false;
    }
}