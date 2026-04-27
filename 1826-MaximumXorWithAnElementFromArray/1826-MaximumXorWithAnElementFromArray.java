// Last updated: 4/27/2026, 10:53:24 PM
class Solution {
    public int[] maximizeXor(int[] arr, int[][] queries) {
        int[][] q=new int[queries.length][3];
		for(int i=0;i<q.length;i++) {
			q[i][0]=queries[i][0];//xi
			q[i][1]=queries[i][1];//mi
			q[i][2]=i; //i
		}
		Arrays.sort(q,(a,b)->a[1]-b[1]);
		Arrays.sort(arr);
		int[] ans=new int[q.length];
		Trie t=new Trie();
		int j=0;//index
		for(int[] a : q) {
			while(j<arr.length && arr[j]<=a[1]) {
				t.add(arr[j]);
				j++;
			}
			if(j==0) {
				ans[a[2]]=-1; //a[2] querie ka positiona btayega
			}
			else {
				ans[a[2]]=t.getMaxXor(a[0]);
			}
		}
		return ans;
    }
    static class Trie{
		class Node{
			Node zero;
			Node one;
		}
		private Node root=new Node();
		public void add(int val) {
			Node curr=root;
			for(int i=31;i>=0;i--) { //ulta loop kyuki hume msb ko check krna h vo zero hai ya one toh starting bit check krenge 32 bit k number m
				int bit=val&(1<<i); //i time &(i.e and) krke huma first bit value nikalnege
				if(bit==0) { //agr bit 0 hai toh 0 tha 
					//agr 0 hai toh vha pocha de nhi hai toh new bna de
					if(curr.zero!=null) {
						curr=curr.zero;
					}
					else { //agr one huya toh udhr i time and krke shift krke msb bit 1 tha
						Node nn=new Node();
						curr.zero=nn;
						curr=nn;
					}
				}
				else {
					if(curr.one!=null) {
						curr=curr.one;
					}
					else {
						Node nn=new Node();
						curr.one=nn;
						curr=nn;
					}
					
				}
				
			}
		}
		public int getMaxXor(int x) {
			int ans=0;
			Node curr=root;
			for(int i=31;i>=0;i--) {
				int bit=x&(1<<i);
				if(bit==0) {
					if(curr.one!=null) {
						ans=ans | (1<<i);
						curr=curr.one;
					}
					else {
						curr=curr.zero;
					}
				}
				else {
					if(curr.zero!=null) {
						ans=ans | (1<<i);
						curr=curr.zero;
					}
					else {
						curr=curr.one;
					}
					
				}
			}
			return ans;
		}
	}
}

