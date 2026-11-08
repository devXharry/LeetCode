class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(map.values());

        int res = heap.size();
        while(k > 0 && !heap.isEmpty()){
            int f = heap.poll();
            if(k >= f){
                k -= f;
                res--;
            }
        }
        return res;
    }
}