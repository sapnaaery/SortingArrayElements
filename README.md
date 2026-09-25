SortingElementArray
A simple Java program that demonstrates how to sort the elements of an integer array using Java's built-in Arrays.sort() method.

📌 Description
This program:

Creates an integer array with unsorted values.

Displays the array before sorting.

Uses Arrays.sort() to sort the array in ascending order.

Displays the sorted array.

🛠️ Technologies Used
Java

java.util.Arrays

📂 Package
day7

📄 Class Name
SortingElementArray

💻 Source Code
package day7;

import java.util.Arrays;

public class SortingElementArray {

    public static void main(String[] args) {
        // Program to sort Array elements

        int i[] = {4, 80, 35, 23, 90, 56, 32, 12, 21, 75, 2};

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(i));

        System.out.println("After sorting");
        Arrays.sort(i); // To sort array elements
        System.out.println(Arrays.toString(i));
    }
}

▶️ How to Run
Make sure Java is installed on your system.

Compile the program:

javac SortingElementArray.java

Run the program:

java day7.SortingElementArray

📊 Expected Output
Before sorting
[4, 80, 35, 23, 90, 56, 32, 12, 21, 75, 2]

After sorting
[2, 4, 12, 21, 23, 32, 35, 56, 75, 80, 90]

🔑 Key Concept
The program uses:

Arrays.sort(i);

Arrays.sort() is a Java utility method that sorts the elements of an array in ascending order.

The program also uses:

Arrays.toString(i);

to display the contents of the array in a readable format.

📚 Learning Objective
This program is useful for beginners learning:

Java arrays

Array sorting

Arrays.sort()

Arrays.toString()

Importing and using Java utility classes

Basic console output
