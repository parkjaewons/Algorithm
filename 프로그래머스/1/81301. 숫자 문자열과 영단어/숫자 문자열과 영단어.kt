class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var temp = s
        
        if(temp.contains("zero")){
            temp = temp.replace("zero" , "0")
        }
        if(temp.contains("one")){
            temp = temp.replace("one" , "1")
        }
        if(temp.contains("two")){
            temp = temp.replace("two" , "2")
        }
        if(temp.contains("three")){
            temp = temp.replace("three" , "3")
        }
        if(temp.contains("four")){
            temp = temp.replace("four" , "4")
        }
        if(temp.contains("five")){
            temp = temp.replace("five" , "5")
        }
        if(temp.contains("six")){
            temp = temp.replace("six" , "6")
        }
        if(temp.contains("seven")){
            temp = temp.replace("seven" , "7")
        }
        if(temp.contains("eight")){
            temp = temp.replace("eight" , "8")
        }
        if(temp.contains("nine")){
            temp = temp.replace("nine" , "9")
        }
        
        answer = temp.toInt()
        return answer
    }
}