```
class FirstProgram {

  public static void main(String args[]) {
    System.out.println("I have just begun programming in Java!");
  }
  
}
```

For a detailed description on access modifiers, see [here](../../AccessModifiers/README.md).
<p>The access modifier <strong>public</strong> means that it can be accessed from anywhere in the program. This includes within the same package or even outside of it.
</p>

For a detailed description on non access modifiers, see [here](../../NonAccessModifiers/README.md).
<p>The non access modifier <strong>static</strong> means that the method belongs to the class and not to an object/instance. Hence, the method can be invoked without any object instantiation.</p>
	
[When is java main method called?](https://stackoverflow.com/questions/10493990/when-is-java-main-method-called)
<p><a href="https://stackoverflow.com/questions/10493990/when-is-java-main-method-called#answer-10494027">Answer by Rich</a>:

> The main method is only called in two situations:
><ol>
>	<li>By the Java Virtual Machine to start the application</li>
>	<li>By another method (possibly in another class) calling the main method, though while this is correct Java it is not best practise</li>
></ol>
</p>
<p><a href="https://stackoverflow.com/questions/10493990/when-is-java-main-method-called#answer-10494062">Answer by Ewald</a>:
	
> Any class can have a main method. For example, both Class(1) and Class(2) classes can have a main method, but only one will be called once when your program is ran.<br/><br/>
> When you run the program, for example, java class1 - you tell Java that you wish to START the program using the main method of Class(1). This can be confusing, as you'd think Java would execute each and every main method it finds, but that's not the case. Once Java has found and ran the main method in the class you specified, it will ignore all future main() methods it may find as it's already executed a main method for your program.<br/><br/>
> You can think of main() as the door that leads into your program, once in, the computer won't try to come in again, it's already in the program! I hope this helps you a bit.
</p>

For an indepth explanation, see [this link](http://csis.pace.edu/~bergin/KarelJava2ed/ch2/javamain.html).
