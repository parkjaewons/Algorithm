class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var temp = n.toString()
        
        for(i in temp){
            answer += i.toString().toInt()
        }
        return answer
    }
}