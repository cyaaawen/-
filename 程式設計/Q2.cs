// See https://aka.ms/new-console-template for more information
int grades = 0;
int sum = 0;
Console.WriteLine("Enter grade one by one");
    for (int i = 0; i < 10; i++)
    {
        grades = int.Parse(Console.ReadLine());
        sum += grades;
    }
double average = sum / 10;
Console.WriteLine("average: " + average);

