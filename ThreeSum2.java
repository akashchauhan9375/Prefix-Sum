//**********************************Time complexity will be O(N^2) and space complexity will be O(N)*******************************

import java.util.*;
class ThreeSum2{

    public static boolean Sum(int arr[],int target){
        for(int i=0;i<arr.length-2;i++){
            Set<Integer> st = new HashSet<>();

            for(int j =i+1;j<arr.length-1;j++){
                int second = target -arr[i] - arr[j];
                
                if(st.contains(second)){
                    return true;
                }
                st.add(arr[j]);
            }
           
        }
        return false;
        
    }
    public static void main(String st[]){
        int arr[] = {1,2,3,4,5,6};
        int target = 12;
        System.out.println(Sum(arr,target));
    }
}