// Last updated: 4/27/2026, 10:52:39 PM
class Solution {
    public int minimizeXor(int num1, int num2) {
        int set_bit=0;
		while(num2>0) {
			num2=(num2&(num2-1));
			set_bit++;
		}
		int x=0;
		for(int i=30;i>=0;i--) {
			int mask=(1<<i); //konsi didgit pr 1 mila hai uss i pr ya uss jgh pr 1 rekheneg
			if((num1&mask)!=0) {//jha jha 1 aa rha udhr uski according 1 rkho x mai
				x|=mask; //x=x|mask;
				set_bit--; //set bit ko kum krenge
				if(set_bit==0) { //agr set bit khtm ho gyi toh loop ko break kr do aur yhi se x return kr do bit khtm ho gyi ab choti value bnane k liye pecche se 1 rkhne k liye ab 1 nhi bacha
					return x; //no of set bit khtm jisse hum value bna skte h toh yha se vo number return krdo
				}
			}
		}
		//minimum bnane k liye last m bit add krenge bachi huyyi
		for(int i=0;i<=30;i++) {
			int mask=(1<<i);
			if((num1 & mask)==0) {
				x|=mask; //x=x|mask;
				set_bit--;
				if(set_bit==0) {
					return x;
				}
			}
			
		}
		return x;
		
	}

}
