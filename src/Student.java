public class Student {
	
	// create student class
	public int rollNo;
	public String name;
	public String address;
	
	public Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
	// returns the roll number of the student object
	public int getRollNo() {
		return rollNo;
	}
	
	// return the name of the student object
	public String getName() {
		return name;
	}

}