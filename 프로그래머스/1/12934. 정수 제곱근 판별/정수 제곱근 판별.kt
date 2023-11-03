import kotlin.math.sqrt
class Solution {
    fun solution(n: Long): Long {
        var x = sqrt(n.toFloat()).toLong()
    
        return if (x * x == n) ((x + 1) * (x + 1)) 
        else -1
    }
}