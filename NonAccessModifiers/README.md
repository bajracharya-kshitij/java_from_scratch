<h1>Non Access Modifiers</h1>

<p>Non access modifiers provide special properties to variables, methods and classes and alter their behavior. There are two levels on which non access modifiers can be applied. They are:
</p>	

<ol>
	<li>Classes</li>
	<li>Members</li>
</ol>

<ol>
	<li><strong>Classes</strong>:<br/>
		On a class level, there are two non access modifiers:
		<ul>
			<li><a href="#final">final</a></li>
			<li><a href="abstract">abstract</a></li>
		</ul>
	</li>
	<li><strong>Members</strong>:<br/>
		Following are common non access modifiers on members:
		<ul>
			<li><a href="#final">final</a></li>
			<li><a href="#abstract">abstract</a></li>
			<li><a href="#static">static</a></li>
			<li><a href="#synchronized">synchronized</a></li>
			<li><a href="#native">native</a></li>
			<li><a href="#transient">transient</a></li>
			<li><a href="#volatile">volatile</a></li>
			<li><a href="#strictfp">strictfp</a></li>
		</ul>
	</li>
</ol>

<h4 id="final">final</h4>
<p>This non access modifier can be applied on class as well as member level.<br/>
<strong>final class</strong>: When a class is set to final, it cannot be extended by any other class. It is the final segment of class hierarchy of the program<br/>
<strong>final method</strong>: A method when set to final cannot be overriden by any child class. The final modifier prevents a method from being modified in a child class.<br/>
<strong>final variable</strong>: Final variables are like constants. When a variable is set as final, its value cannot be changed. A final varibale can be explicitly initialized only once. A reference variable declared final can never be reassigned to refer to a different object. The data within the object can be changed. So the state of the object can be changed but not the reference.<br/>
Mostly, final is used along with static to make the constant a class variable.

<h4 id="abstract">abstract</h4>
<p>This non access modifier can be applied on class as well as member level.<br/>
<strong>abstract class</strong>: If a class is declared as abstract, it can never be instantiated, but abstract class can be extended. If a class contains one or more abstract methods, then the class should be declared as abstract otherwise a compile error will be thrown, but it is not neccessary for an abstract class to contain abstract methods. An abstract class can contain both abstract as well as normal methods. A class can't be declared as both abstract and final as final classes cannot be extended whereas abstract class can be.<br/>
<strong>abstract method</strong>: Abstract methods don't have a body but only a signature. The method body is provided by sub class that extend the abstract class. A class that extends an abstract class must implement all abstract methods of the super class unless the sub class is also abstract. Abstract methods can never be final as final methods cannot be overriden by a child class.<br/>
Abstract method ends with a semicolon.
</p>

<h4 id="static">static</h4>
<p>This non access modifier can be applied on member level only.<br/>
<strong>Note: Inner classes can be declared as static.</strong><br/>
<strong>static variable</strong>: A static variable belongs to the class rather than objects/instances, hence they are also known as Class variables.<br/>
<strong>static method</strong>: A static method belongs to the class rather than objects/instances. A static method can only access static data, it cannot access non-static data (instance variables).<br/>
</p>

<h4 id="synchronized">synchronized</h4>
<p>This non access modifier can be applied on methods only.<br/>
<p>A synchronized method can only be accessed by a single thread at a time. The synchronized modifier can be applied with any of the four access modifiers.<br/>
</p>

<h4 id="native">native</h4>
<p>This keyword is applied to a method to indicate that the method is implemented in native code (code in another language) using Java Native Interface (JNI). Native methods were used in the past to write performance critical section but with Java now getting faster, it is less common now. Currently, native methods are needed when calling a library written in another language or access system/hardware resources that are only reachable from other language.
</p>

<h4 id="transient">transient</h4>
<p>This keyword marks a member variable not to be serialized when it is persisted to streams of bytes. Variables may be marked transient to indicate that they are not part of the persistent state of an object.
</p>

<h4 id="volatile">volatile</h4>
<p>A volatile variable will never be cached thread-locally, all reads and writes will go straight to main memory.</p>

<h4 id="strictfp">strictfp</h4>
<p>strictfp keyword restricts floating-point calculations to ensure portability. strictfp ensures that we get exactly the same results from the floating point calculations on every platform. If we don't use strictfp, the JVM is free to use extra precision where available.<br/>
strictfp can be used on classes, interfaces and non-abstract methods. When applied to a method/class, it causes all calculations inside the method/class to use strict floating-point math.
</p>
