import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UserMainCodeThree<K,V>{
	
	public int getMaxKeyValue(HashMap<Integer, String> hashMap) {
		// TODO Auto-generated method stub
		int maxKey = ( Collections.max(hashMap.keySet()));
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			if(entry.getKey()==maxKey) {
				System.out.println(entry.getValue());
			}
		}
		return maxKey;
	}

}
public class LargestKeyInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, String> hashMap = new HashMap<>();
		System.out.println("Enter the Size ");
		int sizeOfStudents = scanner.nextInt();
		for(int i=0; i<sizeOfStudents; i++) {
			hashMap.put(scanner.nextInt(), scanner.next());
		}
		System.out.println(hashMap);
		
		UserMainCodeThree userMainCodeThree = new UserMainCodeThree();
		System.out.println(userMainCodeThree.getMaxKeyValue(hashMap));

		scanner.close();
	}

}
