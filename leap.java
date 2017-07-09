import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
         {
          int a;
	  System.out.println("Enter the year:");
	  Scanner s= new Scanner(System.in);
          a=s.nextInt();

          if(a%4==0)
          System.out.println("It is a leap year");
          else
          System.out.println("It is not a leap year");
         

         }
}