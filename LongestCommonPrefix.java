class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        //Set longest prefix to the first string
        String prefix = strs[0];

        //Go through array of strings
        for (int i = 0; i < strs.length; i++) {

            //While the prefix is not equal to the next element delete a char
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        return prefix;
    }
}