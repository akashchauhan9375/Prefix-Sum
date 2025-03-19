
/*
 
Leetcode - 75
IN THIS QUESTION WE HAVE SORT THE ARRAY SUCH THAT ALL FREQUENCIES OF 0 SHOULD BE PRINT FIRST THEN 1'S FREQ AND SO ON
EX- [1,0,2,2,0,1,0,1,2] --> [0,0,0,1,1,1,2,2,2]
TIME COMPLEXITY WILL O(N)
 */


class SortColors{
    public static void Sort(int arr[]){
        int c0=0;
        int c1=0;
        int c2=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                c0++;
            }
            if(arr[i] == 1){
                c1++;
            }
            if(arr[i] == 2){
                c2++;
            }
        }
        
        int idx =0;
        for(int i=0;i<c0;i++){
            arr[idx++] = 0;
        }
        for(int i=0;i<c1;i++){
            arr[idx++] = 1;
        }
        for(int i=0;i<c2;i++){
            arr[idx++] = 2;
        }
    }
    public static void main(String st[]){
        int arr [] = {1,2,0,0,2,1,2,1};
        Sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

