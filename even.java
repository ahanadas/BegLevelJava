import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
         {
          int a;
	  System.out.println("Enter the no:");
	  Scanner s= new Scanner(System.in);
          a=s.nextInt();

          if(a%2==0)
          System.out.println("Even no " +a);
          else
          System.out.println("Odd no " +a);
         

         }
}