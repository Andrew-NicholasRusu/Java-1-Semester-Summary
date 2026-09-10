using System;
using System.Runtime.InteropServices;
class Fundamentals
{
    static async Task Main()
    {
        int num = 10;
        // int is converted to double (implicit type casting)
        double d = num;
        Console.WriteLine(d);

        // Ternary Operator
        int a = 10, b = 5;
        string result = (a > b) ? "a" : "b";
        Console.WriteLine(result + " is greater");

        if (a > b)
        {
            Console.WriteLine("a is greater");
        }

        int c = 30, d = 15;
        if (c > d)
        {
            Console.WriteLine("c is greater.");
        } 
        else
        {
            Console.WriteLine("d is greater");
        }
    }
}