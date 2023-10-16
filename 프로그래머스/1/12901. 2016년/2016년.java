import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] weekDay = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        for(int i = 0; i < 7; i++) {
        	if(dayOfWeek.getValue() == i + 1){
            	answer = weekDay[i];
            }
        }
        
        return answer;
    }
}