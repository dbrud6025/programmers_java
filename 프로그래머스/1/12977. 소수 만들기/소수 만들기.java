import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int answer = 0;
        List<Integer> list = new ArrayList();
        //nums에서 3개를 뽑아 만들 수 있는 숫자들 리스트에 저장
        for(int i = 0; i < nums.length; i++){
            //nums에 애초에 중복된 값이 없으니, i,j,k 시작점만 잘 정하면 중복 값 없음
            //을 것 같지만 ? 중복 값이 있을 수도 있어서 리스트 중복 제거 해야 함!
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        for(int number : list){
            int i = 2;
            answer++; //answer++; 를 while 뒤에 두려고 하니까 내 머리로는 답이 정말 나오지 않음!
            while(number > i){
                if(number % i == 0){
                    answer--; //한개 증가한거 취소
                    break;
                }else i++;
            }

        }
        return answer;
        
        
        
        /*
        int answer = 0;
        List<Integer> list = new ArrayList();
        //nums에서 3개를 뽑아 만들 수 있는 숫자들 리스트에 저장
        for(int i = 0; i < nums.length - 2; i++){
            //nums에 애초에 중복된 값이 없으니, i,j,k 시작점만 잘 정하면 중복 값 없음
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        for(int number : list){
            if(number == 2 || number == 3) {
                answer++;
            }else if(number % 2 != 0 && number % 3 != 0) {
                double sqrtResult = Math.sqrt(number);
                int roundedSqrt = (int) Math.round(sqrtResult);
                if (roundedSqrt * roundedSqrt != number) {
                    // 정수가 아닌 제곱근
                    answer++;
                }
                //2로도 안나눠지고 3으로도 안나눠지는 수 중에 제곱근이 정수가 아닌 수만 answer 개수에 추가
                //제곱수는 약수가 3개이므로 소수가 아니기 때문
            }
        }
        return answer;
        */
        
    }
}