// See https://aka.ms/new-console-template for more information
Random r = new Random();
int[] p = new int[21];
int a;
int b;
int c;
int d;
int o = 4;
for (int i = 0; i < 72000; ++i)
    {
        int sum;
        a = r.Next(1,7);
        b = r.Next(1,7); 
        c = r.Next(1,7); 
        d = r.Next(1,7);
        sum = a+b+c+d;
        ++p[sum - 4];
    }
    
foreach (int q in p)
{
    Console.WriteLine($"{o}\t{q}");
    ++o;
}
