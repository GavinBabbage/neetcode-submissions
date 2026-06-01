class Solution {
    public int calPoints(String[] operations) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(String operation : operations){
            if(operation.equals("+")){
                stack.push(stack.peek() + stack.get(stack.size() - 2));
            }
            else if(operation.equals("D")){
                stack.push(stack.peek() * 2);
            }
            else if(operation.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(operation));
            }
        }
        for(int i : stack){
            answer += i;
        }
        System.out.println(answer);
        return answer;    
    }
}