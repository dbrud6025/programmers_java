import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] upperStr = s.toUpperCase().split("");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(hashMap.containsKey(upperStr[i])){
                hashMap.put(upperStr[i], hashMap.get(upperStr[i]) + 1);
            } else {
                hashMap.put(upperStr[i], 1);
            }
        }
        int maxcount = 0;
        String maxKey = null;
//        int maxValue = Integer.MIN_VALUE;
        for (String key : hashMap.keySet()) {
            if (maxKey == null || hashMap.get(key) > hashMap.get(maxKey)) {
                maxKey = key;
                maxcount = 1;
            }else if (Objects.equals(hashMap.get(key), hashMap.get(maxKey))) {
                maxcount++;
            }
        }
        if(maxcount > 1) System.out.println("?");
        else System.out.println(maxKey);
    }
}