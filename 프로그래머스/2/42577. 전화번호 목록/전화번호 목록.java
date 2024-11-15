import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Set<String>set = new HashSet<>();
        
        for(String hp: phone_book){
            set.add(hp);
        } 
        
        for(String hp : phone_book){   
            for(int i =1; i<hp.length(); i++){
                  if(set.contains(hp.substring(0,i))){
                      answer= false;
                    return answer;
                  }
                }  
            }
        return answer;
    }
}