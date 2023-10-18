import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0; //최대 이익(각 상자의 최저점(p[i]) * 한 상자 내 사과 개수(m) 를 모두 합치기
        List p = new ArrayList<>(); //각 사과상자의 최저점 리스트
        Arrays.sort(score); //오름차순 정렬
        for(int i = score.length - m; i > score.length % m - 1; i-=m){
            //점수가 가장 큰 사과부터 상자를 채우고, 각 상자의 최저점의 인덱스가 i, 상자 내 사과개수를 뺀 것만큼 반복문 돌며 리스트에 추가.
            p.add(score[i]);
        }
        for(int i = 0; i < p.size(); i++){
            //최종 이익 = 최종 이익 + (각 사과상자의 최저점 * 사과개수)
            answer += Integer.parseInt(p.get(i).toString()) * m;
        }
        return answer;
    }
}