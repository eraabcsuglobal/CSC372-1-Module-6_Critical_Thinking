import java.util.ArrayList;

public class SortByRollNo {
	
	// selection sort by roll number
	public static void sortRollNumbers(ArrayList<Student> students) {
		int i;
		int j;
		int indexSmallest;
		Student temp;
		
		for (i = 0; i < students.size() - 1; ++i) {
			
			// set the smallest index to the current index
			indexSmallest = i;
			
			// loop through the remaining students
			for (j = i + 1; j < students.size(); ++j) {
				// if j's roll number value is smaller than the current smallest index, than set the smallest index to j
				if (students.get(j).getRollNo() < students.get(indexSmallest).getRollNo()) {
					indexSmallest = j;
				}
			}
		
			// swap the current index value with the new smallest index value
			temp = students.get(i);
			students.set(i, students.get(indexSmallest)); 
			students.set(indexSmallest, temp);
		}
		
	}
	
}