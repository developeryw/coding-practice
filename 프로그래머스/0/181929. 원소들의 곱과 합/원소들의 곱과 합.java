class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num1 = 1;
        int num2 = 0;
        int len = num_list.length;
        
        for (int i = 0; i < len; i++) {
            num1 *= num_list[i];
            num2 += num_list[i];
        }
        
        if (num1 < num2 * num2) {
            answer = 1;
        }
        
        return answer;
    }
}