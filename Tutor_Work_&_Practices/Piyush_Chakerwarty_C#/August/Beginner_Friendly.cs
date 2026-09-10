using System;
using System.Collections.Generic;

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            int age = ReadNumber("Enter your age:");
            double temperature = 21.5;
            bool isLearning = true;

            Console.WriteLine($"Next year, I will be {age + 1}.");
        }
    }
}