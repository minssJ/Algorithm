import java.util.Map;
import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
       
        String answer = null; 
        
        Map<String,Integer>map = new HashMap<>();
      
        
        for(String runner: participant){
            if(map.containsKey(runner)){
                map.put(runner,map.get(runner)+1);
            }else{
                 map.put(runner,1);
            }
        }
  
        for(String completeRunner : completion){
             int value=map.get(completeRunner)-1;
             map.put(completeRunner,value);
        }
        
       for (String key : map.keySet()) {
          if(map.get(key)==1){
              answer =key;
          }
     }   
       
        
      
        return answer;
    }
}