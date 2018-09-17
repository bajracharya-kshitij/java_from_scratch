<h1>Static Variable Demo</h1>

```
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
```
<h3>Result</h3>

```
All subjects will have a full marks of 100
The subject English has full marks of 100
The subject Mathematics has full marks of 100
All subjects henceforth will have a full marks of 50
The subject Computer has full marks of 50
The subject General Knowledge has full marks of 50
Checking English again...
The subject English has full marks of 50
```

<p>Here, we define a class <strong>Subject</strong>. Each subject instance will have a different name, so <strong>name</strong> is defined as an instance variable, which means every instance will have a different copy of this variable. But many subjects can have the same full marks, so <strong>fullMarks</strong> has been defined as a <strong>static variable</strong>, also called a <strong>class variable</strong>. This will result in the class having a single copy no matter how many objects are created. In fact, this variable doesn't even need an object instantiation.</p>

Before any objects were created, we accessed the class variable fullMarks using `Subject.fullMarks` which printed out the following result:
```
All subjects will have a full marks of 100
```
Now, all subjects created henceforth have a full marks of 100 up until the point where we decided to updated the full marks using `changeFullMarks`. After this, the value of `fullMarks` is updated to 50. So, all subjects created after this have a full marks of 50. And since there is only one copy for this variable, if we check the value of the subject `English` again, this time we will get back 50 and not 100. So, `fullMarks` is not the value associated with `English` or `Computer`; it is the value associated with the class `Subject`.
