using System;

class Program
{
    static void Main()
    {
        string string1 = "abcdefghijklmabcdefghijklm";
        string string2 = "ABCDEFGHIJKLMABCDEFGHIJKLM";

        // 1. Use string1.CompareTo(string2) and string2.CompareTo(string1) to compare the two string literals
        int compareResult1 = string1.CompareTo(string2);
        int compareResult2 = string2.CompareTo(string1);
        Console.WriteLine("string1.CompareTo(string2) is " + compareResult1);
        Console.WriteLine("string2.CompareTo(string1) is " + compareResult2);

        // 2. Find the first 'B' starting at 2 located at which index in string2
        int firstBIndex = string2.IndexOf('B', 2);
        Console.WriteLine("First 'B' starting at 2 located at index " + firstBIndex);

        // 3. Find the last 'B' up to position 25 located at which index in string2
        int lastBIndex = string2.LastIndexOf('B', 25);
        Console.WriteLine("Last 'B' up to position 25 located at index " + lastBIndex);

        // 4. Find the first "CDE" starting at 7 located at which index in string2
        int firstCDEIndex = string2.IndexOf("CDE", 7);
        Console.WriteLine("First \"CDE\" starting at 7 located at index " + firstCDEIndex);

        // 5. Find the last "CDE" up to position 25 located at which index in string2
        int lastCDEIndex = string2.LastIndexOf("CDE", 25);
        Console.WriteLine("Last \"CDE\" up to position 25 located at index " + lastCDEIndex);

        // 6. Find the substring from index 6 to 12 of string2
        string substring = string2.Substring(6, 7);
        Console.WriteLine("Substring from index 6 to 12 is " + substring);

        // 7. Append the characters from string2 to the end of a copy of string1
        string concatenatedString = string1 + string2;
        Console.WriteLine("Result of string.Concat(string1,string2) = " + concatenatedString);

        // 8. Replace "d" with "D" in string1
        string modifiedString1 = string1.Replace("d", "D");
        Console.WriteLine("Replacing 'd' with 'D' in string1: " + modifiedString1);

        // 9. Transfer string2 to lowercase
        string lowercaseString2 = string2.ToLower();
        Console.WriteLine("string2.ToLower() = " + lowercaseString2);
    }
}