class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {

            char[] arr = str.toCharArray();   // string → char array
            Arrays.sort(arr);                 // sort characters
            String key = new String(arr);     // sorted string as key

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
        

