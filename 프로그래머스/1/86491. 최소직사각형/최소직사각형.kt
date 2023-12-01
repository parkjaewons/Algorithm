class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var width = 0
        var height = 0
        
        for(i in sizes){
            width = maxOf(width,i[0],i[1])
            height = maxOf(height,minOf(i[0],i[1]))
            
        }
        return width * height
    }
}