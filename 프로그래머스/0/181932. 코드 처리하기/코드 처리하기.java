class Solution {
    public String solution(String code) {
        String answer = "";
        
        int idx = 0;
        int mode = 0;
        int len = code.length();
        
        while (idx < len) {
            char cur = code.charAt(idx);
            
            if (mode == 0) {
                if (cur == '1') {
                    mode = 1;
                } else {
                    if (idx % 2 == 0) {
                        answer += cur;
                    }
                }
            } else if (mode == 1) {
                if (cur == '1') {
                    mode = 0;
                } else {
                    if (idx % 2 == 1) {
                        answer += cur;
                    }
                }
            }
            
            idx++;
            
        }
        
        if (answer == "") {
            answer = "EMPTY";
        }
        
        return answer;
    }
}