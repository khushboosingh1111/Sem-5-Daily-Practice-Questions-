// Last updated: 8/6/2025, 10:15:12 AM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int result=0;
        while(start<=end){
            int mid=start+((end-start)>>1);
            if(isBadVersion(mid)==true){
                result=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
}