// Last updated: 9/1/2025, 8:38:38 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        String str=String.valueOf(n);
        int i=str.length()-1;
        int[] arr=new int[str.length()];
        while(n>0){
            arr[i--]=n%10;
            n/=10;
        }
        for(int k:arr){
            map.put(k,map.getOrDefault(k,0)+1);
            
        }
        int min=Integer.MAX_VALUE;
        int ans=-1;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
           if(e.getValue()<min){
               min=e.getValue();
               ans=e.getKey();
           }
            
        }
        return ans;
    }
}