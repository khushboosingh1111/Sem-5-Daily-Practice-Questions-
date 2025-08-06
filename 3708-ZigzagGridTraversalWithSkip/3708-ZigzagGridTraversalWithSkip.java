// Last updated: 8/6/2025, 10:09:17 AM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        return ZigZag(grid);
    }
    public List<Integer> ZigZag(int[][]arr){
        List<Integer> ll = new ArrayList<>();
        for(int row = 0;row<arr.length; row++){
            if(row%2==0){
                for(int col = 0; col<arr[0].length; col++){
                    if(col%2==0){
                        ll.add(arr[row][col]);
                    }
                }
            }else{
                for(int col = arr[0].length-1; col>=0; col--){
                    if(col%2!=0){
                        ll.add(arr[row][col]);
                    }
                }
            } 
        }
        return ll;
    }
}