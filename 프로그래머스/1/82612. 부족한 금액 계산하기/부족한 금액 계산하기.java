class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        for(int i=0; i<=count; i++){
            answer=answer-price*i;
        }
        if(answer>=0){
            return 0;
        }else if(answer<=0){
            answer=answer*-1;
        }
        return answer;
    }
}