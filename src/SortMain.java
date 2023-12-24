import java.util.ArrayList;

public class SortMain {

	public static void main(String[] args) {
	
		// create student objects
		// add them to list
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student(5, "Jack", "32 Albert St"));
		students.add(new Student(4, "Alice", "19 Hazzard St"));
		students.add(new Student(1, "Brad", "22 Huntingdon St"));
		students.add(new Student(2, "Sara", "67 Frankford Ave"));
		students.add(new Student(3, "Kyle", "222 Belgrade St"));
		
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
		
		// sort by name
		SortByName.sortNames(students);
		
		System.out.print("SORTED by name: ");
		for (int i = 0; i < students.size(); ++i) {
			System.out.print(students.get(i).getName() + " ");
		}
		System.out.println();
	
		// sort by roll number
		SortByRollNo.sortRollNumbers(students);
		
		System.out.print("SORTED by roll number: ");
			for (int i = 0; i < students.size(); ++i) {
			System.out.print(students.get(i).getRollNo() + " ");
		}

	}

}