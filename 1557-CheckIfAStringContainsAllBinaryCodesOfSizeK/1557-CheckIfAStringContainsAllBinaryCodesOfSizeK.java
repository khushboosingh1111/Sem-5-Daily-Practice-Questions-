// Last updated: 4/27/2026, 10:53:48 PM
class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set=new HashSet<>();
        int n=s.length();
        int c=1<<k; //pow(2,k)
        for(int i=k;i<=n;i++){
            String sub=s.substring(i-k,i);
            if(!set.contains(sub)){
                set.add(sub);
                c--;
            }
            if(c==0){
                return true;
            }
        }
        return false;
    }
}