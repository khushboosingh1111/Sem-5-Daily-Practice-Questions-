// Last updated: 8/6/2025, 10:11:40 AM
public class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        
        // Step 1: Find first decreasing point from right
        int i = n - 2;
        while (i >= 0 && arr[i] <= arr[i + 1]) {
            i--;
        }
        
        if (i < 0) return arr; // already smallest
        
        // Step 2: Find the largest element smaller than arr[i] to the right
        int j = n - 1;
        while (j > i && arr[j] >= arr[i]) {
            j--;
        }
        
        // If there are duplicates, find the leftmost among equal values
        while (j > i && arr[j] == arr[j - 1]) {
            j--;
        }
        
        // Step 3: Swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        return arr;
    }
}
