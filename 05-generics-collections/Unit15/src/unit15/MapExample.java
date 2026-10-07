package unit15;

import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer>map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong",86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String>keySet =map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int score = map.get(key);
			totalScore += score;
			if(score > maxScore) {
				maxScore = score;
				name = key;
			}	
		}
		double avg = (double) totalScore / map.size();
		System.out.println("평균점수:"+ avg );
		System.out.println("최고점수"+maxScore);
		System.out.println("아이디: "+ name);
		
	}

}
