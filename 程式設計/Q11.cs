using System;
public class College
{
    private string college;
    public College(string college)
    {
        this.college = college;
    }
    public virtual void GetName()
    {
        Console.WriteLine($"College name: {college}");
    }
}
public class Department : College
{
    private string department;
    public Department(string college, string department) : base(college)
    {
        this.department = department;
    }
    public override void GetName()
    {
        base.GetName();
        Console.WriteLine($"Department name: {department}");
    }
}
public class Program
{
    public static void Main()
    {
        Department mis = new Department("Management", "MIS");
        mis.GetName();
    }
}

