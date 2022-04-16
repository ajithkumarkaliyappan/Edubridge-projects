import java.util.ArrayList;

public class UserMainCodeOne {

	protected ArrayList<Integer> sample = new ArrayList<>();

	public ArrayList<Integer> removeMultipliesOfThree(ArrayList<Integer> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			if ((i + 1) % 3 != 0) {
				sample.add(arrayList.get(i));
			}
		}

		return sample;

	}
}
