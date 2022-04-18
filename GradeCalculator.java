import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UserMainCode {
	HashMap<String, String> sample = new HashMap<>();

	public HashMap<String, String> calculateGrade(HashMap<String, Float> hashMap) {
		for (Map.Entry<String, Float> entry : hashMap.entrySet()) {
			if (entry.getValue() < 49) {
				sample.put(entry.getKey(), "FAIL");
			} else if (entry.getValue() > 49 && entry.getValue() < 100) {
				sample.put(entry.getKey(), "PASS");
			} else {
				System.out.println("mark is not within the correct range!!");
			}
		}

		return sample;
	}

}

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Float> hashMap = new HashMap<>();
		System.out.println("Enter the Size of students ");
		int sizeOfStudents = scanner.nextInt();
		for (int i = 0; i < sizeOfStudents; i++) {
			hashMap.put(scanner.next(), scanner.nextFloat());
		}
		System.out.println(hashMap);

		UserMainCode userMainCode = new UserMainCode();
		System.out.println(userMainCode.calculateGrade(hashMap));

		scanner.close();
	}

}
