import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        Map<String,Integer>map = new HashMap<>();
        
        for(int i=0; i < clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                map.put(clothes[i][1],map.get(clothes[i][1])+1);
            }else{
                map.put(clothes[i][1],1);
            }
        }
        
        //같은종류의 수 + 안입는 경우의 수  각 종류마다 곱해준다
        int value=1;
        for(int count : map.values()){
           value *= count+1;
        }
        // 최소 한개는 입으므로 아에 안입는 경우 -1
        answer = value -1;

        return answer;
    }
}