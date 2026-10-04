class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Integer> freqo = new ArrayList<>(map.values());
        Collections.sort(freqo, Collections.reverseOrder());

        int total = 0;
        int index = 0;

        for (int freq : freqo) {
            int multi = (index / 8) + 1;
            total += freq * multi;
            index++;
        }
        return total;
    }
}