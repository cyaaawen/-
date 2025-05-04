using System;

public interface fly
{
    void flying();
}
public class Bird : fly
{
    public void flying()
    {
        Console.WriteLine("Bird uses wings to fly");
    }
}
public class Airplane : fly
{
    public void flying()
    {
        Console.WriteLine("Airplane uses engines to fly");
    }
}
public class Program
{
    public static void Main()
    {
        Bird bird = new Bird();
        bird.flying();
        Airplane airplane = new Airplane();
        airplane.flying();
    }
}

