import java.io.*;
import java.util.*;

class MyClass{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int no;

        System.out.println("Enter the number :");
        no = in.nextInt();
        boolean flag=false;
        for( int i=2; i<=no/2; i++ )
        {
            if(no%i==0)
            {
               flag = true;
               break;
            }
        }
        if(!flag)
        {
             System.out.println(no+" is a prime number");
        }
        else
        {
             System.out.println(no+" is not a prime number");
        }
       
    }
}