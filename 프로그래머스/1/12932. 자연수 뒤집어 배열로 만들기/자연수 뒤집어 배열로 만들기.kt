class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        
        n.toString().map {
            answer += (it.toInt() - '0'.toInt())
        }
        
        return answer.reversedArray()
    }
}