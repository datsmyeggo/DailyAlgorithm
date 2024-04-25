import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        
        char [] charArr = s.toCharArray(); // s 문자열의 알파벳을 배열의 원소로
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : charArr){
            if (stack.isEmpty()) { //stack이 비어있으면
                stack.push(c);  // 해당 알파벳을 push
                continue;
            }
            if(!stack.isEmpty()) { // 비어있지 않으면
                if(stack.peek() == c) { // 해당 알파벳이 stack의 꼭대기의 값과 같을때 
                    stack.pop(); // 꼭대기 값을 제거해준다
                } else { // 만약 같지 않다면 즉, 연속된 알파벳이 아니라면
                    stack.push(c); // 해당 알파벳을 stack에 push
                }
            }
            }

        return stack.isEmpty() ? 1 : 0; // 만약 stack에 더이상 알파벳이 없다면 모두 제거되었다는 뜻이므로 1을 반환 그렇지 않다면 0을 반환
    }
}