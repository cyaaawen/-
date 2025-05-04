// See https://aka.ms/new-console-template for more information

while (true)
{
    int a;
    int b;
    Console.WriteLine("Enter first integer value: ");
    a = int.Parse(Console.ReadLine());
    Console.WriteLine("Enter second integer value: ");
    b = int.Parse(Console.ReadLine());
    if (b == 0) break;
    bool result = Multiple(a, b);
    Console.WriteLine("Result of Multiple method is " + result);
}
static bool Multiple(int a, int b)
{
    if (a%b == 0) return true;
    else return false;
}


