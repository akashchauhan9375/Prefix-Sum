/*
 
leetcode -238
//In this question we have to find the array which has product of elements except itself of a given array
Brute force approach 


 */
import java.util.*;
class ProductExceptSelf{

    public static int[] Product(int arr[]){
       
        int res[] = new int[arr.length];
        Arrays.fill(res,1);
        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr.length;j++){
                
                if(i!=j){
                 res[j] *= arr[i];
                }
                
                
            }
        
            
        }
        return res;
        
        
    }
    public static void main(String st[]){
        int arr[] = {1,2,3,4};
        int res[] = Product(arr);
        for(int val: res){
            System.out.println(val);
        }

    }
}