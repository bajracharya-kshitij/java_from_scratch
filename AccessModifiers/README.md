<h1>Access Modifiers</h1>

<p>Access modifiers helps to restrict the scope of a class, constructor, variable, method or data member. There are four types of access modifiers in Java. They are:
<ol>
	<li>Default</li>
        <li>Private</li>
        <li>Public</li>
        <li>Protected</li>
</ol>
</p>

<p>
<ol>
    <li>
        <strong>Default</strong>:
        As the name suggests, it is the default access modifier when no other access modifier is specified for the class, method or data member. Such class, method or data members are only accessible from within the same package.
        </li>
        <li>
        <strong>Private</strong>:
        Giving a method or data member an access modifier of private makes it accessible from within the same class. A class cannot be made private.
        </li>
        <li>
        <strong>Public</strong>:
        Giving a class, method or data member an access modifier of public makes it accessible from anywhere in the program. Thus, it has the widest scope.
        </li>
        <li>
        <strong>Protected</strong>:
        This is an intermediate scope level between private and public. Giving a constructor, method or data member an access modifier of protected makes it accessible from within the same package and from within inherited classes in a different package. A class cannot be made protected.
        </li>
</ol>
</p>

<p>
The following table summarizes the access modifiers with their scope:
    <table>
        <th>
            <td>Class</td>
            <td>Package</td>
            <td>Sub Class</td>
            <td>World</td>
        </th>
        <tr>
            <td>Public</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>Yes</td>
        </tr>
        <tr>
            <td>Protected</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>No</td>
        </tr>
        <tr>
            <td>Default</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>No</td>
            <td>No</td>
        </tr>
        <tr>
            <td>Private</td>
            <td>Yes</td>
            <td>No</td>
            <td>No</td>
            <td>No</td>
        </tr>
    </table>
</p>
