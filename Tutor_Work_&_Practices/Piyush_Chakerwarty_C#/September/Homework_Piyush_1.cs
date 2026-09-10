/** Question 1: What will be printed to the console when the following code runs? */

using System.Drawing;

Point p1 = new() { X = 5, Y = 10}; //
Point p2 = p1;
p2.X = 50; //

Student s1 = new() { Id = 1, Name = "Liam"}; //
Student s2 = s1;
s2.Name = "Noah"; //

Console.WriteLine($"p1.X: {p1.X}, p2.X: {p2.X}");
Console.WriteLine($"s1.Name: {s1.Name}, s2.Name: {s2.Name}");

// Answer:

/** Question 2: What will be printed to the console? */

int count = 42;
object boxed = count; // Boxing
count = 99;

int unboxed = (int) boxed; // Unboxing[cite: 2]

Console.WriteLine($"count: {count}");
Console.WriteLine($"unboxed: {unboxed}");

/** Question 3: Will the follwoing code compile? If not, what error occurs and why? */

var maxStudents = 30; //[cite: 2]
var semester = "Fall 2026"; // [cite: 2]

semester = 2026;
maxStudents = 35;

/** Question 4: Will this code compile? If it compiles, what happens when it runs? */

int originalNumber = 100;
object boxedNumber = originalNumber; // Boxing[cite: 2]

double restoredNumber = (double)boxedNumber; // Unboxing[cite: 2]
Console.WriteLine(restoredNumber);

/** Question 5: Look at the property definitions below: */

public class Instructor
{
    public int Id { get; set; } //
    public string Title { get; set; }
    public string? Office { get; set; } //
}

/** Why might the compiler display a warning on public string Title { get; set; }? 
    How does writing public string Title { get; set; } = ""; resolve it? */

/** Question 6: */