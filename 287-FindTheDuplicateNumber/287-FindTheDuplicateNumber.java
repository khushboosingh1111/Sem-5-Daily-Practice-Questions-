// Last updated: 8/6/2025, 10:15:08 AM
class Solution {
    public int findDuplicate(int[] arr) {
        int slow=arr[0];
        int fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);
        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
}