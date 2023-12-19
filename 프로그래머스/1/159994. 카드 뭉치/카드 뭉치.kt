class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var p1 = 0
        var p2 = 0
        var result = "Yes"
        
        goal.forEach {
            when(it) {
                cards1.getOrNull(p1) -> p1++
                cards2.getOrNull(p2) -> p2++
                else -> {
                    result = "No"
                    return@forEach
                }
            }
        }
        return result
    }
}