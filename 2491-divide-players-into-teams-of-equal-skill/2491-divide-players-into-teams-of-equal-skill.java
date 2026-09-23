class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int target = skill[0] + skill[skill.length - 1];
        long chem = 0;

        int left = 0;
        int right = skill.length - 1;

        while (left < right) {
            int sum = skill[left] + skill[right];
            if (sum != target) {
                return -1;
            }

            chem += (long) skill[left] * skill[right];
            left++;
            right--;
        }
        return chem;
    }
}