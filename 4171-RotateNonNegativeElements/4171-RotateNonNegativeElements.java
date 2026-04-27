// Last updated: 4/27/2026, 10:50:24 PM
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        
        int n=nums.length;
        ArrayList<Integer> ll= new ArrayList<>();
        ArrayList<Integer> lr=new ArrayList<>();
        for(int i:nums){
            if(i>=0){
                ll.add(i);
            }
        }
        int size=ll.size();
        if(size==0){
            return nums;
        }
        k=k%size;
        for(int i=k;i<size;i++){
            lr.add(ll.get(i));
        }
        for(int i=0;i<k;i++){
            lr.add(ll.get(i));
        }
        int idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                nums[i]=lr.get(idx++);
            }
        }
        return nums;
    }
}