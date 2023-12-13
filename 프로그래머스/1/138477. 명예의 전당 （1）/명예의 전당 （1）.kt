class Solution {
        fun solution(k: Int, score: IntArray): IntArray {
            var answer: IntArray = intArrayOf()
            var list= mutableListOf<Int>()
            var minList= mutableListOf<Int>()
            var min = 0
            for(i in score){
                    if(list.size < k){
                list.add(i)
                min = list?.minOrNull()!!
            }else{
                min = list?.minOrNull()!!
                if(i > min){
                    list = list.sortedDescending().toMutableList()
                    list.removeAt(list.lastIndex)
                    list.add(i)
                    min = list?.minOrNull()!!
                }
            }
            minList.add(min)
        }
        return minList.stream().mapToInt { i: Int? -> i!! }.toArray()
	}
}
