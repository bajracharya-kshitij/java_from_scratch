<h1>Non Access Modifiers</h1>

<p>Non access modifiers provide special properties to variables, methods and classes and alter their behavior. There are two levels on which non access modifiers can be applied. They are:
</p>	

<ol>
	<li>Classes</li>
	<li>Members</li>
</ol>

<ol>
	<li>Classes:
		On a class level, there are two non access modifiers:
		<ul>
			<li>final</li>
			<li>abstract</li>
		</ul>
	</li>
	<li>Members:
		Following are common non access modifiers on members:
		<ul>
			<li>final</li>
			<li>abstract</li>
			<li>static</li>
			<li>synchronized</li>
			<li>native</li>
			<li>transient</li>
			<li>volatile</li>
			<li>strictfp</li>
		</ul>
	</li>
</ol>

<h4>final</h4>
<p>This non access modifier can be applied on class as well as member level.<br/>
When a class is set to final, it cannot be extended by any other class. It is the final segment of class hierarchy of the program<br/>
A method when set to final cannot be overriden by any child class. The final modifier prevents a method from being modified in a child class.<br/>
Final variables are like constants. When a variable is set as final, its value cannot be changed. A final varibale can be explicitly initialized only once. A reference variable declared final can never be reassigned to refer to a different object. The data within the object can be changed. So the state of the object can be changed but not the reference.<br/>
Mostly, final is used along with static to make the constant a class variable.
</p>