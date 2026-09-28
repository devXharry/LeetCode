class Solution {
    public int maxVowels(String s, int k) {
        char[] fg = s.toCharArray();
        int n = fg.length;
        int left = 0;
        int maxG = 0;
        int cnt = 0;
        for (int right = 0; right < n; right++) {
            if (fg[right] == 'a' || fg[right] == 'e' || fg[right] == 'i' || fg[right] == 'o' || fg[right] == 'u') {
                cnt++;
            }

            while ((right - left + 1) > k) {
                if (fg[left] == 'a' || fg[left] == 'e' || fg[left] == 'i' || fg[left] == 'o' || fg[left] == 'u') {
                    cnt--;
                }
                left++;
            }
            maxG = Math.max(maxG, cnt);
        }
        return maxG;
    }
}