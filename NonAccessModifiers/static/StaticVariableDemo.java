class StaticVariableDemo {

	public static void main(String[] args) {
		Subject english = new Subject("English");
		english.printSubjectDetails();
		
		Subject maths = new Subject("Mathematics");
		maths.printSubjectDetails();
		
		Subject computer = new Subject("Computer");
		computer.changeFullMarks();
		computer.printSubjectDetails();

		Subject gk = new Subject("General Knowledge");
		gk.printSubjectDetails();
	}
}

class Subject {

	static int fullMarks = 100;

	String name;

	Subject(String name) {
		this.name = name;
	}

	void printSubjectDetails() {
		System.out.println("The subject " + this.name + " has full marks of " + fullMarks);
	}

	void changeFullMarks() {
		fullMarks = 50;
	}
}