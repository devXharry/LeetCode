class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> sore = new HashMap<>();
        char[] fj = s.toCharArray();
        for (int i = 0; i < fj.length; i++) {
            sore.put(fj[i], sore.getOrDefault(fj[i], 0) + 1);
        }
        List<Character> list = new ArrayList<>(sore.keySet());
        list.sort((a, b) -> sore.get(b) - sore.get(a));

        StringBuilder ans = new StringBuilder();

        for(char c: list){
            int freq = sore.get(c);
            for(int i = 0; i< freq; i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}