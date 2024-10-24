package DSThroughJava.searching;
public class SearchIn2dArrays {
    static void searching2d(int [][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                  System.out.println(arr[row][col]);
                }
                else{
                    System.out.println("Not found4");
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr= {
                    {33,33,664,3},
                    {44,66,3,4,5},
                    {55,7,33,88,76}
        };
        int target = 54;
        SearchIn2dArrays.searching2d(arr, target);
    }
}
