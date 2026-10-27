class Solution {
    public int minAddToMakeValid(String s) {
        int openN = 0;
        int closeN = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                openN++;
            }else{
                if(openN > 0){
                    openN--;
                }else{
                    closeN++;
                }
            }
        }
        return openN + closeN;
    }
}