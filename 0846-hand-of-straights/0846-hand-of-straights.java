class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);
        Map<Integer, Integer> map = new HashMap<>();
        for (int h : hand) {
            map.merge(h, 1, Integer::sum);
        }
        for (int a : hand) {
            if (map.getOrDefault(a, 0) > 0) {
                for (int i = 0; i < groupSize; i++) {
                    int card = a + i;
                    if (map.getOrDefault(card, 0) <= 0) {
                        return false;
                    }
                    map.put(card, map.get(card) - 1);
                }
            }
        }
        return true;
    }
}