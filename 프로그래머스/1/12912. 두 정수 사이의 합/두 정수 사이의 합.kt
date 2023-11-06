class Solution {
    fun solution(a: Int, b: Int): Long {
        return if(a<=b) (a..b).map{it.toLong()}.sum() else (b..a).map{it.toLong()}.sum()
    }
}