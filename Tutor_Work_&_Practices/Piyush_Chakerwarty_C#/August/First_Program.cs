// Old version of .NET
using System;
namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            // Program that takes name as user input and display name:
            Console.WriteLine("Enter your name: ");
            string? name = Console.ReadLine();
            Console.WriteLine($"Hello, {name}!");
        }
    }
}
