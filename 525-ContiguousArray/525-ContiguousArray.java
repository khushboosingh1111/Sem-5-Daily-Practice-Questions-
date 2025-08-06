// Last updated: 8/6/2025, 10:13:52 AM
import java.util.*;
class Solution {
  public int findMaxLength(int[] binaryArray) {
    int maxLength = 0;
    int sum = 0;  // running sum: +1 for 1, -1 for 0
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);  // base case: sum 0 at index -1

    for (int index = 0; index < binaryArray.length; ++index) {
      sum += (binaryArray[index] == 1) ? 1 : -1;
      
      if (map.containsKey(sum)) {
        int firstSeen = map.get(sum);
        int currentLength = index - firstSeen;
        maxLength = Math.max(maxLength, currentLength);
      } else {
        map.put(sum, index);
      }
    }
    return maxLength;
  }
}
