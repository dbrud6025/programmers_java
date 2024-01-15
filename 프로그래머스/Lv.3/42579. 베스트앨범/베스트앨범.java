import java.util.ArrayList;
import java.util.HashMap;


class Solution {
    public int[] solution(String[] genres, int[] plays) {
        //장르별 재생 수 계산
        //classic : 1,450번, pop : 3,100번
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        for(int i = 0; i < genres.length; i++) {
        	if(hashmap.containsKey(genres[i])) {
        		hashmap.put(genres[i], hashmap.get(genres[i]) + plays[i]);
        	}else {
        		hashmap.put(genres[i], plays[i]);
        	}
        	/*if else 문을 한 문장으로...*/
        	/*map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);*/
        }
        
        
        //HashMap의 key 값들을 ArrayList에 넣기
        //****리스트 정렬을 HashMap의 value 순으로!
        ArrayList<String> mapToGenres = new ArrayList<>();
        for(String item : hashmap.keySet()) {
        	mapToGenres.add(item);
        }
        mapToGenres.sort(((o1, o2) -> hashmap.get(o2) - hashmap.get(o1)));
        //Collections.sort(mapToGenres, (o1, o2) -> hashmap.get(o2) - (hashmap.get(o1)));
        
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < mapToGenres.size(); i++) {
        	String g = mapToGenres.get(i);
        	
        	//해당 장르의 음악 중에서 play 횟수가 가장 큰 인덱스를 찾는다
        	int max = 0;
        	int firstIdx = -1;
        	for(int j = 0; j < genres.length; j++) {
        		if(g.equals(genres[j]) && max < plays[j]) {
        			max = plays[j];
        			firstIdx = j;
        		}
        	}
        	
        	//해당 장르의 음악 중에서 play 횟수가 두번째로 큰 인덱스를 찾는다
        	
        	max = 0;
        	int secondIdx = -1;
        	for(int j = 0; j < genres.length; j++) {
        		if(g.equals(genres[j]) && max < plays[j] && j != firstIdx) {
        			max = plays[j];
        			secondIdx = j;
        		}
        	}
        	
        	list.add(firstIdx);
        	if(secondIdx >= 0) list.add(secondIdx); //secondIdx는 존재할 수도, 안 할 수도 있다
        }
        
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	result[i]= list.get(i); 
        }
        
        
        
        /*
        //장르끼리 앨범 묶기
        HashMap<String, List<HashMap<Integer, Integer>>> byGenre = new HashMap<String, List<HashMap<Integer, Integer>>>();
        for(int i = 0; i < genres.length; i++) {
        	HashMap<Integer, Integer> album = new HashMap<Integer, Integer>();
        	List<HashMap<Integer, Integer>> list = new ArrayList<HashMap<Integer,Integer>>();
        	if (byGenre.containsKey(genres[i])) {
                // 이미 해당 장르가 존재하면 기존 리스트를 가져옴
                list = byGenre.get(genres[i]);
            } else {
                // 해당 장르가 존재하지 않으면 새로운 리스트 생성
                list = new ArrayList<HashMap<Integer, Integer>>();
            }
    		album.put(i, plays[i]);
    		list.add(album);
    		byGenre.put(genres[i], list);
        }
        //{pop=[{1=600}, {4=2500}], classic=[{0=500}, {2=150}, {3=800}]}
        */
        
        
        return result;
    }
}