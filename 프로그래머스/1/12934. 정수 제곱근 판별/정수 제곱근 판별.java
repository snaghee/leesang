class Solution {
    public long solution(long n) {
        long answer = -1;
        for(long i=1; i<=n; i++){
            if(n==i*i){
                answer=i;
                answer=(answer+1)*(answer+1);
                break;
            }
        }
        
        return answer;
    }
}