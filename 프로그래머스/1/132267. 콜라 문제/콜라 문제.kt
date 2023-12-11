class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var n = n
        var remain = 0
        
        while(n >= a){
            remain = n / a * b
            answer += remain
            
            n = n % a + remain
        }
        return answer
    }
}