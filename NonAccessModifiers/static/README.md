[static variables](#static-variable-demo)<br/>
[static methods](#static-method-demo)

# Static Variable Demo

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
Now, all subjects created henceforth have a full marks of 100 up until the point where we decided to update the full marks using `changeFullMarks`. After this, the value of `fullMarks` is updated to 50. So, all subjects created after this have a full marks of 50. And since there is only one copy for this variable, if we check the value of the subject `English` again, this time we will get back 50 and not 100. So, `fullMarks` is not the value associated with `English` or `Computer`; it is the value associated with the class `Subject`.


# Static Method Demo

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StaticMethodDemo {
  
  public static void main(String[] args) {
    String dateString1 = "1970-01-01";
    DateFormatter.getFormattedDate(dateString1);
    
    String dateString2 = "2018-09-17";
    DateFormatter.getFormattedDate(dateString2);
  }
	
}

class DateFormatter {

  private static final List<String> MONTH_NAMES = Collections.unmodifiableList(
                                    Arrays.asList("January", "February", "March", "April", 
                                                  "May", "June", "July", "August",
                                                  "September", "October", "November", "December"));

  private static ArrayList<String> getDateList(String dateString) {
    Pattern pattern = Pattern.compile("(\\d{4})-(\\d{1,2})-(\\d{1,2})");
    Matcher match = pattern.matcher(dateString);
    ArrayList<String> dateList = new ArrayList<String>();
    while(match.find()) {
      for(int i=1; i<=match.groupCount(); i++) {
        dateList.add(match.group(i));
      }
    }
    return dateList;
  }

  static void getFormattedDate(String dateString) {
    ArrayList<String> dateList = getDateList(dateString);
    System.out.println("The formatted date is: " + 
                        MONTH_NAMES.get(Integer.parseInt(dateList.get(1))-1) + " " + 
                        Integer.parseInt(dateList.get(2)) + ", " +
                        dateList.get(0));
  }
}
```
<h3>Result</h3>

```
The formatted date is: January 1, 1970
The formatted date is: September 17, 2018
```
