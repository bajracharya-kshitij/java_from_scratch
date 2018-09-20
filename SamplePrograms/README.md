<h1>Common Even Factors</h1>

<h4>Sample Run 1 Result</h4>

```
Enter first number: 
100
Enter second number: 
256
The even factors of 100 are:
2 4 10 20 50 

The even factors of 256 are:
2 4 8 16 32 64 128 

The common even factors of 100 and 256 are:
2 4
```

<h4>Sample Run 2 Result</h4>

```
Enter first number: 
9
Enter second number: 
89
9 has no even factors

89 has no even factors

There are no common even factors between 9 and 89
```

<h1>Water Jug Problem</h1>

<p>You have two empty water jugs in your hands. One holds 3 gallons of water, the other holds 5 gallons of water. You need to use these two jugs to measure exactly 4 gallons of water.</p>

<h4>Possible cases</h4>

<table>
  <thead>
    <tr>
      <th>Initial Volume in 3 gallon jug</th>
      <th>Initial Volume in 5 gallon jug</th>
      <th>Volume in 3 gallon jug after transferring from 3 to 5</th>
      <th>Volume in 5 gallon jug after transferring from 3 to 5</th>
      <th>Volume in 3 gallon jug after transferring from 5 to 3</th>
      <th>Volume in 5 gallon jug after transferring from 5 to 3</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
    </tr>
    <tr>
      <td>0</td>
      <td>1</td>
      <td>0</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
    </tr>
    <tr>
      <td>0</td>
      <td>2</td>
      <td>0</td>
      <td>2</td>
      <td>2</td>
      <td>0</td>
    </tr>
    <tr>
      <td>0</td>
      <td>3</td>
      <td>0</td>
      <td>3</td>
      <td>3</td>
      <td>0</td>
    </tr>
    <tr>
      <td>0</td>
      <td>4</td>
      <td>0</td>
      <td>4</td>
      <td>3</td>
      <td>1</td>
    </tr>
    <tr>
      <td>0</td>
      <td>5</td>
      <td>0</td>
      <td>5</td>
      <td>3</td>
      <td>2</td>
    </tr>
    <tr>
      <td>1</td>
      <td>0</td>
      <td>0</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
    </tr>
    <tr>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>2</td>
      <td>2</td>
      <td>0</td>
    </tr>
    <tr>
      <td>1</td>
      <td>2</td>
      <td>0</td>
      <td>3</td>
      <td>3</td>
      <td>0</td>
    </tr>
    <tr>
      <td>1</td>
      <td>3</td>
      <td>0</td>
      <td>4</td>
      <td>3</td>
      <td>1</td>
    </tr>
    <tr>
      <td>1</td>
      <td>4</td>
      <td>0</td>
      <td>5</td>
      <td>3</td>
      <td>2</td>
    </tr>
    <tr>
      <td>1</td>
      <td>5</td>
      <td>1</td>
      <td>5</td>
      <td>3</td>
      <td>3</td>
    </tr>
    <tr>
      <td>2</td>
      <td>0</td>
      <td>0</td>
      <td>2</td>
      <td>2</td>
      <td>0</td>
    </tr>
    <tr>
      <td>2</td>
      <td>1</td>
      <td>0</td>
      <td>3</td>
      <td>3</td>
      <td>0</td>
    </tr>
    <tr>
      <td>2</td>
      <td>2</td>
      <td>0</td>
      <td>4</td>
      <td>3</td>
      <td>1</td>
    </tr>
    <tr>
      <td>2</td>
      <td>3</td>
      <td>0</td>
      <td>5</td>
      <td>3</td>
      <td>2</td>
    </tr>
    <tr>
      <td>2</td>
      <td>4</td>
      <td>1</td>
      <td>5</td>
      <td>3</td>
      <td>3</td>
    </tr>
    <tr>
      <td>2</td>
      <td>5</td>
      <td>2</td>
      <td>5</td>
      <td>3</td>
      <td>4</td>
    </tr>
    <tr>
      <td>3</td>
      <td>0</td>
      <td>0</td>
      <td>3</td>
      <td>3</td>
      <td>0</td>
    </tr>
    <tr>
      <td>3</td>
      <td>1</td>
      <td>0</td>
      <td>4</td>
      <td>3</td>
      <td>1</td>
    </tr>
    <tr>
      <td>3</td>
      <td>2</td>
      <td>0</td>
      <td>5</td>
      <td>3</td>
      <td>2</td>
    </tr>
    <tr>
      <td>3</td>
      <td>3</td>
      <td>1</td>
      <td>5</td>
      <td>3</td>
      <td>3</td>
    </tr>
    <tr>
      <td>3</td>
      <td>4</td>
      <td>2</td>
      <td>5</td>
      <td>3</td>
      <td>4</td>
    </tr>
    <tr>
      <td>3</td>
      <td>5</td>
      <td>3</td>
      <td>5</td>
      <td>3</td>
      <td>5</td>
    </tr>
  </tbody>
</table>
