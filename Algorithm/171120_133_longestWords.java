/**
最长单词
*/

public class Solution {
    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        int maxLen = 0;
        ArrayList<String> lString = new ArrayList<String>();
        if (dictionary.length == 0)
            return null;
        for (int i=0; i<dictionary.length; i++) {
            if (dictionary[i].length() == maxLen) {
                lString.add(dictionary[i]);
            } else if (dictionary[i].length() > maxLen) {
                lString.clear();
                lString.add(dictionary[i]);
                maxLen = dictionary[i].length();
            }
        }
        return lString;
    }
}