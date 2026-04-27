// Last updated: 4/27/2026, 10:50:32 PM
class Solution {
    public int[] sortByReflection(int[] nums) {
        String[] a=new String[nums.length];
        int j=0;
        for(int x:nums){
            a[j]=Integer.toBinaryString(x);
            j++;
        }
        int[] b=new int[nums.length];
        int k=0;
        for(String x:a){
            String rev=reverse(x);
            b[k]=Integer.parseInt(rev,2);
            k++;
        }
        int[][] arr=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=b[i];
        }
        Arrays.sort(arr,(p,q)->{
            if(p[1]==q[1]){
                return p[0]-q[0];
            }
            return p[1]-q[1];
        });
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=arr[i][0];
        }
        
        return ans;
    }
    private String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}