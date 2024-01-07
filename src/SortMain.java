import java.util.ArrayList;

public class SortMain {

	public static void main(String[] args) {
	
		// create ArrayList of students
		ArrayList<Student> students = new ArrayList<>();
		
		// add student objects and their parameters to the students arraylist
		students.add(new Student(4256, "Jack", "32 Albert St"));
		students.add(new Student(3255, "Alice", "19 Hazzard St"));
		students.add(new Student(8991, "Brad", "22 Huntingdon St"));
		students.add(new Student(1255, "Sara", "67 Frankford Ave"));
		students.add(new Student(6678, "Kyle", "222 Belgrade St"));
		
		System.out.print("UNSORTED names: ");
		for (int i = 0; i < students.size(); ++i) {
			System.out.print(students.get(i).getName() + " ");
		}
		System.out.println();
		
		System.out.print("UNSORTED roll numbers: ");
		for (int i = 0; i < students.size(); ++i) {
			System.out.print(students.get(i).getRollNo() + " ");
		}
		System.out.println();
		
		// sort students list by student name
		SortByName.sortNames(students);
		
		System.out.print("SORTED by name: ");
		for (int i = 0; i < students.size(); ++i) {
			System.out.print(students.get(i).getName() + " ");
		}
		System.out.println();
	
		// sort students list by student roll number
		SortByRollNo.sortRollNumbers(students);
		
		System.out.print("SORTED by roll number: ");
		for (int i = 0; i < students.size(); ++i) {
			System.out.print(students.get(i).getRollNo() + " ");
		}

	}

}