// 구명보트
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int min_num = 0;
        Arrays.sort(people);
        for(int i = people.length-1; i >= min_num; i--) {
            int sum = people[i] + people[min_num];
            if(sum <= limit) {
                min_num+=1;
            } 
            answer+=1;
        }
        return answer;
    }
}
