import java.util.ArrayList;


public class SortByName {
	
	public static void sortNames(ArrayList<Student> students) {
		int i;
		int j;
		int indexSmallest;
		Student temp;
		
		// loop through all the students besides the last one in the arraylist
		for (i = 0; i < students.size() - 1; ++i) {
			
			// set the smallest index as the current index
			indexSmallest = i;
			
			// starting from the current index, loop through the remaining list and compare them to the current index
			for (j = i; j < students.size(); ++j) {
				// check if the current smallest index value is higher than j, than j is the smallest index
				if (students.get(indexSmallest).getName().compareTo(students.get(j).getName()) > 0) {
					indexSmallest = j;
				}
			}
			
			// swap the current index with the new smallest index
			temp = students.get(i);
			students.set(i, students.get(indexSmallest));
			students.set(indexSmallest, temp);
		}
	}
}