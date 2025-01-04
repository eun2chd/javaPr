package _10_Collection._list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner str = new Scanner(System.in);
		System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다. ");
		
		while(true) {
			System.out.print("이름 입력 : ");
			String st = str.next();
			
			if(st.equals("종료")) {
				Set<Map.Entry<String,Integer>>entrySet = map.entrySet();
				entrySet.iterator();
				Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
				while(iterator.hasNext()) {
					Map.Entry<String, Integer> entry = iterator.next();
					
					Integer k = entry.getValue();
					String v = entry.getKey();
					
					
					System.out.printf("이름 :  %s, 나이 : %d \n", v ,k);
				
				}
				break;
			}
			System.out.print("나이 입력 : ");
			int age = str.nextInt();
			
			map.put(st, age);
			
		
		}
		
		
	}

}
