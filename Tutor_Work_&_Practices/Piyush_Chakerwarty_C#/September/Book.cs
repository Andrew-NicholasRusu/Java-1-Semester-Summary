/** Create a class named Book that satisfies the following criteria: 

    An integer auto-property Id.  

    A non-nullable string auto-property Title initialized to an empty string.  

    A nullable string auto-property Author[cite: 1]. 

    A method PrintDetails() that prints the ID, Title, and Author. 
    If Author is null, it should display "Unknown" using the null-coalescing operator (??)[cite: 1]. */

using System;

public class Book
{
    public int Id {get; set;} // integer auto-property Id
    public string Title {get; set;} = ""; // non-nullable string auto-property Title initialized to an empty string
    public string? Author {get; set;} // nullable string auto-property Author

    public void PrintDetails() // method PrintDetails()
    {
        Console.WriteLine($"ID: {Id}, Title: {Title}, Author: {Author ?? Unknown}");
    }
}