using System;
class Program
{
    static void Main(string[] args)
    {
        try
        {
            Console.Write("Input miles driven: ");
            double miles = double.Parse(Console.ReadLine());
            Console.Write("Input gallons used: ");
            double gallons = double.Parse(Console.ReadLine());
            double mpg = miles / gallons;
            Console.WriteLine("The miles per gallon: " + mpg);
        }
        catch (FormatException)
        {
            Console.WriteLine("The input string 'error' was not in a correct format.");
        }
        Console.WriteLine("This is finally block");
    }
}
