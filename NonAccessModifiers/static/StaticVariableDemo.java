class StaticVariableDemo {

	public static void main(String[] args) {

		System.out.println("All subjects will have a full marks of " + Subject.fullMarks);

		Subject english = new Subject("English");
		english.printSubjectDetails();
		
		Subject maths = new Subject("Mathematics");
		maths.printSubjectDetails();
		
		Subject computer = new Subject("Computer");
		computer.changeFullMarks();
		System.out.println("All subjects henceforth will have a full marks of " + Subject.fullMarks);
		computer.printSubjectDetails();

		Subject gk = new Subject("General Knowledge");
		gk.printSubjectDetails();

		System.out.println("Checking English again...");
		english.printSubjectDetails();
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