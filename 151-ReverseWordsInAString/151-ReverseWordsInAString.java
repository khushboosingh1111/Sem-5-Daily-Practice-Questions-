// Last updated: 8/6/2025, 10:16:12 AM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        System.out.println(s);
        String[] arr=s.split("\s+");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";

        }
        return ans.trim();
        
    }
}