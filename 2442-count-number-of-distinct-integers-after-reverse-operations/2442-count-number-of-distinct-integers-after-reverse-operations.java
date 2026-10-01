class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            set.add(reve(num));
        }

        return set.size();
    }
    public int reve(int numd) {
        int rev = 0;
        while (numd > 0) {
            rev = rev * 10 + numd % 10;
            numd /= 10;
        }
        return rev;
    }
}