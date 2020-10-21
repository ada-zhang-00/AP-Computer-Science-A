/*
Consider a program which can evaluate strings of DNA code. DNA code is a String containing only the letters “C”, “T”, “G” or “A”.

Write a method countPattern, that will take in a DNA sequence dna of any length as well as a pattern pattern, and return an int counting the number of times that pattern appears in the dna String.

An example, given the dna: “ACACTGACGT”

and the pattern: “AC”

countPattern(dna, pattern) would return 3.
*/

public int countPattern(String dna, String pattern)
{
    int count = 0;
    String var = "";
    
    for(int i = 0; i < dna.length(); i++)
    {
        for(int k = i; k < dna.length(); k++)
        {
            var += dna.charAt(k);
            if(var.length() == pattern.length() && var.equals(pattern))
            {
                count++;
            }
        }
        
        var = "";
    }
    return count;
}
