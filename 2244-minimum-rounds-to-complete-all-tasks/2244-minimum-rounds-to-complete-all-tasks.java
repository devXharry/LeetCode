class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int task : tasks){
            map.merge(task, 1, Integer::sum);
        }
        int totalRounds = 0;
        for(int freq : map.values()){
            if(freq == 1){
                return -1;
            }
            totalRounds += freq / 3 + (freq % 3 == 0 ? 0 : 1);
        }
        return totalRounds;
    }
}