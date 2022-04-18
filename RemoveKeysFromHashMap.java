import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UserMainCodeTwo{
	HashMap<Integer, String> sample = new HashMap<>();
	public HashMap<Integer, String> sizeOfResultAndHashMap(HashMap<Integer, String> hashMap) {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			if(entry.getKey() %4 == 0) {
				hashMap.remove(entry.getKey());
			}
		}
		return hashMap;
	}
	
}
public class RemoveKeysFromHashMap {

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
		
		UserMainCodeTwo userMainCodeTwo = new UserMainCodeTwo();
		System.out.println(userMainCodeTwo.sizeOfResultAndHashMap(hashMap));

		scanner.close();
	}

}
