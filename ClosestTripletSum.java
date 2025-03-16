// brute force approach to find the triplet with closest Sum

import java.util.*;
class ClosestTripletSum{
    static int closestSum(int[] arr, int target) {
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        int res = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int currSum = arr[i] + arr[j] + arr[k];
                    int currDiff = Math.abs(currSum - target);

                    if (currDiff < minDiff) {
                        res = currSum;
                        minDiff = currDiff;
                    }
                    
                    else if(currDiff == minDiff) {
                        res = Math.max(res, currSum);
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 2, 4};
        int target = 4;
        System.out.println(closestSum(arr, target));
    }
}
