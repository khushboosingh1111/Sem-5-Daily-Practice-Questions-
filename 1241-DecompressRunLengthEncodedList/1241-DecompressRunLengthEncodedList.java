// Last updated: 8/6/2025, 10:11:31 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
          List<Integer> ans = new ArrayList<>();
        int len = 0;

        for(int i=0; i<nums.length; i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            len += freq;

            while(freq != 0){
                ans.add(val);
                freq --;
            }
        }

        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = ans.get(i);
        }
        
        return arr;
        /*ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                a.add(nums[i+1]);

            }
        }
        int [] arr=new int[a.size()];
        for(int k=0;k<arr.length;k++){
            arr[k]=a.get(k);
        }
        return arr;*/
    }
}