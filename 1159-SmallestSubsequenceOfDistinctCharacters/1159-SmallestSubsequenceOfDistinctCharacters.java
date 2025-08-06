// Last updated: 8/6/2025, 10:11:37 AM
class Solution {
    public String smallestSubsequence(String s) {
        return Subsequence(s);
    }
    public static String Subsequence(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int[]fre = new int[26];
        for(int i=0;i<s.length();i++) {
        	fre[s.charAt(i)-97]+=1;
        }
        
        boolean [] used = new boolean[26];
        used[s.charAt(0)-97] = true;
        fre[sb.charAt(sb.length()-1)-97]--;

        
        for(int i=1; i<s.length();i++) {
        	char now = s.charAt(i);
        	fre[now-97]-=1;
        	
        	if(used[now-97]) {
        		continue;
        	}
        	while(sb.length()>0 && now<sb.charAt(sb.length()-1) && fre[sb.charAt(sb.length()-1)-97]>0) {
        		used[sb.charAt(sb.length()-1)-97] = false;
        		sb.deleteCharAt(sb.length()-1);
        	}
        	
        	sb.append(now);
        	used[now-97] = true;
        	

        }
//        System.out.println(sb);
        return sb.toString();
        
    }
}