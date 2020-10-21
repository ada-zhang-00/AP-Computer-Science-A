/*
Consider a program which can evaluate strings of DNA code. DNA code is a String containing only the letters “C”, “T”, “G” or “A”.

Write a public method, compareDna, that takes two DNA Strings as parameters and returns true if they are the same, false otherwise.
*/

public boolean compareDna(String dna1, String dna2) {
    if (dna1.equals(dna2))
    {
        return true;
    }
    return false;
}
