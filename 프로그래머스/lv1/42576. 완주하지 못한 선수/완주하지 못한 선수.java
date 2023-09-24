import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < participant.length; i++) {
            if(map.containsKey(participant[i])){
                map.put(participant[i], map.get(participant[i]) + 1);
            }else {
                map.put(participant[i], 1);
            }
        }
        //완주자 배열을 돌면서 map의 value 감소시키기
        for(int i = 0; i < completion.length; i++) {
            if(map.containsKey(completion[i])){
                map.put(completion[i], map.get(completion[i]) - 1);
            }
            if(map.get(completion[i]) == 0) {
                map.remove(completion[i]);
            }
        }

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            answer = keyIterator.next();
        }
        return answer;
    }
}