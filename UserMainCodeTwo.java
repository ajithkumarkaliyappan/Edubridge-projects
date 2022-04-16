
import java.util.ArrayList;
import java.util.Collections;

public class UserMainCodeTwo {

	protected ArrayList<Integer> sample = new ArrayList<>();

	public ArrayList<Integer> SortMergedArrayList(ArrayList<Integer> array1, ArrayList<Integer> array2, int n1, int n2){
		array1.addAll(array2);
		
		Collections.sort(array1);
		System.out.println(array1);
		
		for(int i=0; i<array1.size();i++) {
			if(i == 2 || i == 6 || i == 8) {
				sample.add(array1.get(i));
			}
		}
		return sample;
	}
}
