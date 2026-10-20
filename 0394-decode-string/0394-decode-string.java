class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringS = new Stack<>();
        StringBuilder currString = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(k);
                stringS.push(currString);

                k = 0;
                currString = new StringBuilder();
            } else if (c == ']') {
                StringBuilder decodeS = stringS.pop();
                int currK = countStack.pop();
                for (int i = 0; i < currK; i++) {
                    decodeS.append(currString);
                }
                currString = decodeS;
            } else {
                currString.append(c);
            }
        }
        return currString.toString();
    }
}