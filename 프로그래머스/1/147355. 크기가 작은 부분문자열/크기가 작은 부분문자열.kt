class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        
        for(i in 0 until t.length - p.length){
            val s = t.substring(i, i + p.length)
            
            if(s.toLong() <= p.toLong()){
                answer++
            }
        }
        return answer
    }
    
}