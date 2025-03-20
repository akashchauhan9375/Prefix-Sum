
/*
 LEETCODE -73
 BRUTE FORCE APPROACH
 SET -1 TO THE CORRESPONDING ROW AND COLUMN WHERE YOU FIND ZERO AND THEN AFTER CHANGE -1 TO 0
 */


// class SetZeroElement{
     
    

//    public static void setRow(int arr[][]){
//     int m = arr.length;
//     int n = arr[0].length;
//     for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             if(arr[i][j] == 0){
//                 for(int k=0;k<n;k++){
//                     arr[i][k] = -1;
//                 }
//             }
//         }
//     }
//    }

//    public static void setCol(int arr[][]){
//     int m = arr.length;
//     int n = arr[0].length;
//     for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             if(arr[i][j] == 0){
//                 for(int k=0;k<m;k++){
//                     arr[k][j] = -1;
//                 }
//             }
//         }
//     }
//    }

//    public static void setZero(int arr[][]){
//     int m = arr.length;
//     int n = arr[0].length;

//     for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             if(arr[i][j] == -1){
//                 arr[i][j] = 0;
//             }
//         }
//     }
//    }

//    public static void print(int arr[][]){
//     int m = arr.length;
//     int n= arr[0].length;
//     for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             System.out.print(arr[i][j] + " ");
//         }
//     }
//    }
//    public static void main(String st[]){
//     int arr[][] = {{1,1,1},{1,0,1},{1,1,1},{1,1,1}};
//     setRow(arr);
//     setCol(arr);
//     setZero(arr);
//     print(arr);


//    }
// }

class SetZeroElement{
    public static void Set(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;

        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 0){
                    for(int k=0;k<n;k++){
                        if(arr[i][k]!=0){
                            arr[i][k] = -1;
                        }
                        
                    }
                    for(int k=0;i<m;k++){
                        if(arr[k][j]!=0){
                            arr[k][j] = -1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
    }
}