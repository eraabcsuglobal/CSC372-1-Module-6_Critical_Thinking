import java.util.ArrayList;

public class SortByRollNo {
	
	// selection sort by roll number
	public static void sortRollNumbers(ArrayList<Student> students) {
		int i;
		int j;
		int indexOfSmallest; // renamed this to further clarify this is the index of the current smallest value in the list
		Student temp;
		
		// loop through all the students in the arraylist
		for (i = 0; i < students.size() - 1; ++i) {
			
			// set the smallest index to the current index
			indexOfSmallest = i;
			
			// loop through the remaining students, starting from the next iteration after the current index
			for (j = i + 1; j < students.size(); ++j) {
				// if j's roll number value is smaller than the current smallest index, then set the smallest index to j
				if (students.get(j).getRollNo() < students.get(indexOfSmallest).getRollNo()) {
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