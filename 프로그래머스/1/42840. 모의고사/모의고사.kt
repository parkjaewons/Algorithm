class Solution {
    fun solution(answers: IntArray): IntArray {
    var answer = ArrayList<Int>()


    val one = arrayOf(1, 2, 3, 4, 5)
    val two = arrayOf(2, 1, 2, 3, 2, 4, 2, 5)
    val three = arrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    val list = arrayOf(0,0,0)

    for(i in 0 until answers.size) {
        if(answers[i] == one[i%5]) list[0] = list[0] + 1
        if(answers[i] == two[i%8]) list[1] = list[1] + 1
        if(answers[i] == three[i%10]) list[2] = list[2] + 1
    }

    val max = list.maxOrNull()

    for(i in 0 until list.size) {
        if (list[i] == max) answer.add(i + 1)
    }

    return answer.toIntArray()
    }
}

