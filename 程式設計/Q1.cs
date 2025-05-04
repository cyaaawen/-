// See https://aka.ms/new-console-template for more information
using System.Diagnostics.Metrics;
int a = 0;
int b = int.Parse(Console.ReadLine());
    while(b > 0)
    {
        if(b>a)
        {
            a = b;
        }
    b = int.Parse(Console.ReadLine());
    }
Console.WriteLine(a);

