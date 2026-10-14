class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int len = num_list.length;
        
        int odd = 0;
        int even = 0;
        
        int odd_ten = 1;
        int even_ten = 1;
        
        for (int i = len - 1; i >= 0; i--) {
            if (num_list[i] % 2 == 0) {
                even += num_list[i] * even_ten;
                even_ten *= 10;
            } else {
                odd += num_list[i] * odd_ten;
                odd_ten *= 10;
            }
        }
        
        answer = odd + even;
        
        return answer;
    }
}