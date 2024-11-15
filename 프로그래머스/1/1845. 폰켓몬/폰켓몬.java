import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> poncketmon = new HashSet<>();
        for(Integer n : nums){
            poncketmon.add(n);
        }
        int size = poncketmon.size();
        int num = nums.length/2;

        if(size > num){
           return num;
        }else{
            return size;        
        }
        
        }
}