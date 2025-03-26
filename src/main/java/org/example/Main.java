package org.example;

public class Main {
    public static void main(String[] args) {
try
{
   int myInt = Integer.parseInt("pants");
} catch (NumberFormatException e) {
    System.out.println("\nCannot make the string \"john\" into an integer");
}
finally {
    System.out.println("this \"finally\" block will be executed regardless of there being an exception");
}
        System.out.println("End here");
    }
}