class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        
        int[] answer = new int[len];
        
        for (int i = 0; i < (len / 2); i++) {
            answer[i] = num_list[len - i - 1];
            answer[len - i - 1] = num_list[i];
        }
        
        if (len % 2 == 1) {
            answer[len / 2] = num_list[len / 2];
        }
            
        return answer;
    }
}