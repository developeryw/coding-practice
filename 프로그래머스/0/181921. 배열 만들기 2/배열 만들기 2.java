import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        for (int i = l; i <= r; i++) {
            if (i % 5 == 0) {
                String str = String.valueOf(i);
                boolean isFive = true;
                
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) != '0' && str.charAt(j) != '5') {
                        isFive = false;
                        break;
                    }
                }
                
                if (isFive) {
                    answer = Arrays.copyOf(answer, answer.length + 1);
                    answer[answer.length - 1] = i;
                }
            }
        }
        
        if (answer.length == 0) {
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length - 1] = -1;
        }
        
        return answer;
    }
}