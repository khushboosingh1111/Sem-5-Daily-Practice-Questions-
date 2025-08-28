// Last updated: 8/28/2025, 11:22:12 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    // Map<String,List<String>> map=new HashMap<>();
    // for(String word:strs){
    //     char[] ch=word.toCharArray();
    //     Arrays.sort(ch);
    //     String sortedWord=new String(ch);
    //     if(!map.containsKey(sortedWord)){
    //         map.put(sortedWord,new ArrayList<>());
    //     }
    //     map.get(sortedWord).add(word);
    // }
    // return new ArrayList<>(map.values());
    return ga(strs);
    
    }
    public static List<List<String>> ga(String[] arr){
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String key=GetKey(arr[i]);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(arr[i]);
        }
        List<List<String>> ll=new ArrayList<>();
        for(String key:map.keySet()){
            ll.add(map.get(key));
        }
        return ll;
    }
    public static String GetKey(String s){
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<freq.length;i++){
            sb.append(freq[i]+" ");
        }
        return sb.toString();
    }
}