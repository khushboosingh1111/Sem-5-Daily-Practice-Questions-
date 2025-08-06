// Last updated: 8/6/2025, 10:14:17 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i, j = 0;
        int[] temp = new int[nums.length];
        for(i = 0; i < nums.length; i++)
        {
            j = nums[i];
            temp[j-1] = -1;
        }
        for(i = 0; i < nums.length; i++)
        {
            if(temp[i] == 0)
                res.add(i+1);
        }
        return res;
    }
}