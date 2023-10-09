class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] arr1String = new String[arr1.length];
        String[] arr2String = new String[arr2.length];
        String[] answer = new String[n];

/*
        for(int i = 0; i < n; i++) {
            arr1String[i] = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
            arr2String[i] = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
        }
        for(int i = 0; i < n; i++) {
            answer[i] = "";
            
            for(int j = 0; j < n; j++) {
                if(arr1String[i].charAt(j) == '1' || arr2String[i].charAt(j) == '1') {
                    answer[i] += "#";
                }else if(arr1String[i].charAt(j) == '0' && arr2String[i].charAt(j) == '0') {
                    answer[i] += " ";
                }
            }

        }
        return answer;
*/
        
        for(int i = 0; i < n; i++) {
            arr1String[i] = Integer.toBinaryString(arr1[i]);
            arr2String[i] = Integer.toBinaryString(arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            answer[i] = "";
            while (arr1String[i].length() < n) {
                arr1String[i]= "0" + arr1String[i];
            }
            while (arr2String[i].length() < n) {
                arr2String[i]= "0" + arr2String[i];
            }
            for (int j = 0; j < n; j++) {

                if(arr1String[i].charAt(j) == '1' || arr2String[i].charAt(j) == '1') {
                    answer[i] += "#";
                }else if(arr1String[i].charAt(j) == '0' && arr2String[i].charAt(j) == '0') {
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }
}