
/*
 
LEETCODE --> 169
IN THIS QUES WE HAVE TO FIND THE MAJORITY ELEMENT....
MAJORITY ELEMENT IS THE ELEMENT THAT OCCURS NORE THAN n/2 TIMES WHERE n IS THE SIZE OF ARRAY 
SOLUTION --> THIS IS SOLVED BY MOORE'S VOTING THEORUM


 */

class MajorityElement{
    public static int majority(int arr[]){
        int n = arr.length;
        int cand =0;
        int count =0;
        for(int i=0;i<n;i++){
            if(count==0){
                cand = arr[i];
            }
            if(cand == arr[i]){
                count++;
            }
            else{
                count++;
            }
        }
        return cand;
    }
}