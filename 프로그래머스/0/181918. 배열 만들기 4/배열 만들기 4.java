import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int i = 0;
        
        while (i < arr.length) {
            if (stk.length == 0) {
                stk = Arrays.copyOf(stk, stk.length + 1);
                stk[stk.length - 1] = arr[i];
                i++;
                
                continue;
            } 
            
            if (stk[stk.length - 1] < arr[i]) {
                stk = Arrays.copyOf(stk, stk.length + 1);
                stk[stk.length - 1] = arr[i];
                i++;
            } else {
                stk = Arrays.copyOf(stk, stk.length - 1);
            }
        }
        
        return stk;
    }
}