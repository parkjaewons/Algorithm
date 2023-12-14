class Solution {
    fun solution(a: Int, b: Int): String {
        var day = arrayOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
        var date = 0
        
        for(i in 1 .. a){
            if(i <= 7){
                if(i == a) date += b
                else if(i == 2 && a > 2) date += 29
                else if(i % 2 == 0) date += 30
                else if(i % 2 != 0) date += 31
            }
            else{
                if(i == a) date += b
                else if(i % 2 == 0) date += 31
                else if(i % 2 != 0) date += 30
            }
        }
        return day[date % 7]
    }
}
