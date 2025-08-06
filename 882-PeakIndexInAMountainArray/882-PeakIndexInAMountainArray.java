// Last updated: 8/6/2025, 10:12:39 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=1;
        int end=arr.length-2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){ //right Binary Search
                start=mid+1;
            }
            else { // left BInary search-->if(arr[mid]>arr[mid+1])
                end=mid-1;
            }
        }
        return -1;
    }
}