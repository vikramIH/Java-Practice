package main;
import java.util.Scanner;
 
public class StringReverse
{
    public static String reverse(String str )
    {
        String reverse = "";
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        return reverse;
    }
}