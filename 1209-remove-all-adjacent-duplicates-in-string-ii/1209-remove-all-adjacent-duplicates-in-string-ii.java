class Solution {
    private static class Element{
        char ch;
        int count;
        Element(char ch, int count){
            this.ch = ch;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Element> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().ch == c){
                stack.peek().count++;
                if(stack.peek().count == k){
                    stack.pop();
                }
            }else{
                stack.push(new Element(c, 1));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Element e : stack){
            sb.append(String.valueOf(e.ch).repeat(e.count));
        }
        return sb.toString();
    }
}