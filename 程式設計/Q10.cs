using System;

class Student
{
    private int chinese;
    private int english;
    private int math;
    private int physics;
    private int chemistry;
     public void SetGrades(int chinese, int english, int math)
    {
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }
    public void SetGrades(int chinese, int english, int math, int physics, int chemistry)
    {
        this.chinese = chinese;
        this.english = english;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }
    public void GetGrades()
    {
        Console.WriteLine($"English grade is {english}\nMath grade is {math}");
    }
}   
    class Program
{
    static void Main(string[] args)
    {
        Student student1 = new Student();
        student1.SetGrades(85, 65, 75);
        student1.GetGrades();
        Console.WriteLine();
        Student student2 = new Student();
        student2.SetGrades(75, 60, 70, 90, 95);
        student2.GetGrades();
    }
}

