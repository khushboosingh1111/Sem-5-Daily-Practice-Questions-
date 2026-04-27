// Last updated: 4/27/2026, 10:51:39 PM
class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int tmp=nums[i];
            if(!map.containsKey(tmp))map.put(tmp, new ArrayList<Integer>());
            ArrayList<Integer> arr=map.get(tmp);
            arr.add(i);
        }
        int []pre = new int[n];
        for(ArrayList<Integer> arr:map.values()){
            int s=arr.size();
            if(s==1)pre[arr.get(0)]=-1;
            else{
                for(int i=0;i<s;i++){
                    int curr=arr.get(i);
                    int prev=arr.get((i-1+s)%s);
                    int next=arr.get((i+1)%s);
                    int dnext=Math.min(Math.abs(curr-prev), n-Math.abs(curr-prev));
                    int dprev=Math.min(Math.abs(curr-next), n-Math.abs(curr-next));
                    pre[curr]=Math.min(dprev, dnext);
                }
            }
        }
        for(int q:queries)ans.add(pre[q]);
        return ans;
    }
}