class Solution {
    public boolean isAnagram(String s, String t) {
        String str1 =s.toLowerCase();
        String str2 =t.toLowerCase();

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;

    }
}
