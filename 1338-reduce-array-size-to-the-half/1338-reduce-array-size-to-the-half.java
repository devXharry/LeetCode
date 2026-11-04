class Solution {
    public int minSetSize(int[] arr) {
        int maxValue = 0;
        for(int num : arr){
            maxValue = Math.max(maxValue, num);
        }
        int[] freq = new int[maxValue + 1];
        for(int num : arr){
            freq[num]++;
        }
        Arrays.sort(freq);
        int setSize = 0;
        int count = 0;
        for(int i = maxValue; ; i--){
            if(freq[i] > 0){
                count += freq[i];
                setSize++;
                if(count * 2 >= arr.length){
                    return setSize;
                }
            }
        }
    }
}