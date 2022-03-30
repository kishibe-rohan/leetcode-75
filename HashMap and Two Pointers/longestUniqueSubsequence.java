//Question Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

public int lengthOfLongestSubstring(String s) {
    if (s.length()==0) return 0;

    //map containing char-latest index pairs
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    
    //our result variable
    int max=0;

    for (int i=0, j=0; i<s.length(); ++i){

        //repeated letter?
        if (map.containsKey(s.charAt(i))){
            //slide window
            j = Math.max(j,map.get(s.charAt(i))+1);
        }

        //update position of current character
        map.put(s.charAt(i),i);
        max = Math.max(max,i-j+1);
    }
    return max;
}