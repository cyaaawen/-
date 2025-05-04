using System;

class Coaching
{
    public string CoachingType { get; }
    public int NumberOfPlayers { get; }
    public string ClassTiming { get; }
    public decimal Charges { get; }
    public Coaching(string coachingType, int numberOfPlayers, string classTiming, decimal charges)
    {
        CoachingType = coachingType;
        NumberOfPlayers = numberOfPlayers;
        ClassTiming = classTiming;
        Charges = charges;
    }
}
class Program
{
    static void Main(string[] args)
    {
        Coaching coaching = new Coaching("baseball", 25, "2023/04/25 14:10", 70000.00m);
        Console.WriteLine($"{coaching.CoachingType}\t{coaching.NumberOfPlayers}\t{coaching.ClassTiming}\t${coaching.Charges}");
    }
}
