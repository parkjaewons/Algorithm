class Solution {
    fun solution(start: Int, end: Int): IntArray {
        var answer = IntArray(end+1-start){i: Int -> i+start}
        return answer
    }
}