class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int len = queries.length;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            answer[i] = 1000001;
            
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < answer[i]) {
                    answer[i] = arr[j];
                }
            }
            
            if (answer[i] == 1000001) {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}