import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    
        Stack<Integer>stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            
            if(stack.empty()){
                stack.push(arr[i]);     
                continue;
            }
            if(stack.peek()==arr[i]){
                stack.pop(); 
                stack.push(arr[i]);
                continue;
             }
            stack.push(arr[i]);
        }
      
        int[] answer = new int[stack.size()];
        for(int i =0; i<stack.size(); i++){
            answer[i] = stack.get(i);
        }
        
        return answer;
      }   
    }
