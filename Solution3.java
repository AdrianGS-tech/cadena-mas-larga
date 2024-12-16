class Solution3 {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() ==0)
        return 0;

        int i =0, j=0, max =0;
        Set<Character> set = new HashSet<>();

        while(i < s.length()){
            char c= s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                max = Math.max(max, i-j+1);
                i++;
            }else{
                c = s.charAt(j);
                set.remove(c);
                j++;
            }
        }
        return max;
    }
}
