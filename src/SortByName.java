import java.util.ArrayList;


public class SortByName {
	
	public static void sortNames(ArrayList<Student> students) {
		int i;
		int j;
		int indexOfSmallest; // renamed this to further clarify this is the index of the current smallest value in the list
		Student temp;
		
		// loop through all the students in the arraylist
		for (i = 0; i < students.size() - 1; ++i) {
			
			// set the smallest index as the current index
			indexOfSmallest = i;
			
			// loop through the remaining students, starting from the next iteration after the current index
			for (j = i; j < students.size(); ++j) {
				// check if the current smallest index value is greater than j. If so, than j is now the smallest index
				if (students.get(indexOfSmallest).getName().compareTo(students.get(j).getName()) > 0) {
					indexOfSmallest = j;
				}
			}
			
			// swap the current index with the index of the smallest value
			// create a temporary place to hold the current indexed value
			temp = students.get(i);
			// set the current index as the smallest value found in this iteration of the for loop
			students.set(i, students.get(indexOfSmallest));
			// and then set in place of the index of the smallest value found in this iteration of the loop with the value stored in the temporary slot, fulfilling the swap
			students.set(indexOfSmallest, temp);
		}
	}
}