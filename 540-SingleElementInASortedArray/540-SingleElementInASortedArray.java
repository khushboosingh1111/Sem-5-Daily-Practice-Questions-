// Last updated: 8/6/2025, 10:13:50 AM
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int len=arr.length;
        int start=0;
        int end=len-1;
        if(len==1){
            return arr[0];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==0 && arr[0]!=arr[1]){
                return arr[0];
            }
            if(mid==len-1 && arr[len-1]!=arr[len-2]){
                return arr[len-1];
            }
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            if(mid%2==0){//even mid
                if(arr[mid]==arr[mid-1]){//left check
                end=mid-1;
                }
                else{//right check
                    start=mid+1;
                }
            }
            else{//odd mid
                if(arr[mid]==arr[mid-1]){//right check
                start=mid+1;
                }
                else{//left check
                    end=mid-1;
                }

            }
        }
        return -1;
    }
}