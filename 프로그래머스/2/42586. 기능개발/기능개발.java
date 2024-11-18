import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
     
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
       
        
        for(int i=0; i<progresses.length; i++){
            //Math.ceil 을 사용해서 올림하기 위해선 정수가 아닌 실수값으로 계산해야함 100 => 100.0 반환이 실수가 되도록. 
            int day = (int)Math.ceil((100.0-progresses[i])/speeds[i]);
            queue.offer(day);
        }
        
        while(!queue.isEmpty()){
            int task=queue.poll();  
            int count =1;
            while(!queue.isEmpty() && task >=queue.peek()){
                queue.poll();   
                count++;             
            }
            answer.add(count);
        }
        
        
        
        return answer;
    }
}