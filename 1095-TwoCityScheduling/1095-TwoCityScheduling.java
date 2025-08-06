// Last updated: 8/6/2025, 10:11:44 AM
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int[] arr=new int[costs.length];
        int total =0;
        for(int i=0;i<arr.length;i++){
            total+=costs[i][0];
            arr[i]=costs[i][0]-costs[i][1];
        }
        Arrays.sort(arr);
        int sub=0;
        for(int i=arr.length-1;i>=arr.length/2;i--)sub+=arr[i];
        return total-sub;
        
        
    }
   

}