/*

LEETCODE - 73 

IN THIS QUESTION WE HAVE TO FIRST FIND THAT WHERE THE 0 IS PRESENT IN THE MATRIX.....THEN PUT 0 IN ALL
THE CORRESPOINDINF ROW AND COLUMN 
APPROACH -->
TRAVERSE THROUGHT THE ARRAY AND FIND THE INDEX WHERE THERE IS 0  .....THEN PUT THAT INDEX IN TWO DIFFERENT HASHSET
ONE FOR ROW AND OTHER FOR COLUMN THEN AGAIN TRAVSERSE THROUGH THE WHOLE ARRAY AND IF ANY OF THE INDEX AMONG I AND J 
IS ENCOUNTERED PLACE 0 THERE......

 */
import java.util.*;
class SetMatrixZero{
    public static void SetZero(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;

        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row.contains(i) || col.contains(j)){
                    arr[i][j] =0;
                }
            }
        }

    }
}