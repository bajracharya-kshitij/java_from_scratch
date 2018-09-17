Without exception handling, the program would return

```
The given array of numbers is: 
1 2 3 4 5 6 7 8 9 10 

Finding the third item in the array...
The third item in the array is 3

Finding the eleventh item in the array...
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	at ExceptionDemo.main(ExceptionDemo.java:20)
```

With exception handling, the program returns

```
The given array of numbers is: 
1 2 3 4 5 6 7 8 9 10 

Finding the third item in the array...
The third item in the array is 3

Finding the eleventh item in the array...
An error has occurred! Cannot find the eleventh item in the array because the array has only 10 items.
```
