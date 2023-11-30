class Solution {
    fun solution(s: String): String {
        var splitString = s.split(' ')
        var answer = arrayOf<String>()

        splitString.forEach { s ->
            var string = ""
            s.forEachIndexed { index, c ->
                string += when (index % 2) {
                    0 -> c.toUpperCase()
                    else -> c.toLowerCase()
                }
            }
            answer += string
        }
        return answer.joinToString(' '.toString())
    }
}