// Last updated: 8/6/2025, 10:09:42 AM
class Solution {
    public int countDays(int days, int[][] meetings) {
        return count(days,meetings);
    }
    public static int count(int days, int[][]arr){
        Arrays.sort(arr, Comparator.comparingInt(row -> row[0]));
        int count = 0;
        count+=arr[0][0]-1;
        int max = arr[0][1];
        for(int row = 0;row<arr.length-1;row++){
            if(max<arr[row+1][0]){
                count+=arr[row+1][0]-max-1;
            }
                max = Math.max(max,arr[row+1][1]);
        }
        count+=days-max;
        return count;

    }

}