import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        /*우선순위 큐 (내림차순)*/
        PriorityQueue<Integer>priQue = new PriorityQueue<>(Collections.reverseOrder());
        
        /*큐 넣기.*/
        for(int process : priorities){
            priQue.add(process);
        }
        
        /*큐가 없을때까지 루프*/
        while(!priQue.isEmpty()){ 
            /*큐만으로 루프돌면 프로세스의 위치를 못찾기 때문에 배열이랑 같이 루프 진행.*/
            for(int i=0; i<priorities.length; i++){
                if(priorities[i]==priQue.peek()){
                    priQue.poll();
                    answer++; //실행횟수.
                    if(location == i){
                        return answer;
                    }
                }
            }   
        }    
        return answer;
    }
}
