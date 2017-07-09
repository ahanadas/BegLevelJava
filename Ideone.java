import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i;
        System.out.println("The leap years between 1900 and 2020:");
       for (i=1900;i<=2020;i++)
        {
           if(i%4==0)
            System.out.print(i+ " ");
            }
	}
