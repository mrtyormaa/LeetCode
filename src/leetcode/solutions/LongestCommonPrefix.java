package leetcode.solutions;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        int minLength = Integer.MAX_VALUE;
        for(String str:strs){
            if (minLength > str.length())
                minLength = str.length();
        }
        if (minLength == 0 ) return "";

        for (int i = 0; i < minLength; i++) {
            char check = 'a';
            for (int j = 0; j < strs.length; j++) {
                if (j == 0){
                    check = strs[j].charAt(i);
                    continue;
                }
                if(strs[j].charAt(i) != check)
                    return strs[j].substring(0,i);
            }
        }
        return strs[0].substring(0, minLength);
    }
}
