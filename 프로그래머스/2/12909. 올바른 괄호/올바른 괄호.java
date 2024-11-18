import java.util.*;
class Solution {
    boolean solution(String s) {
        
       //괄호가 쌓이는 중첩구조에서 가장 최근에 추가되는 요소를 비교 삭제하기 위해 스택 사용.
        Stack<Character>stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c=='(') stack.push(c);    
             
            if(c==')'){
                if(stack.isEmpty()) return false;
                
                stack.pop();
            }
        }
       boolean answer= stack.isEmpty() ? true : false;
        
        return answer;
    }
}