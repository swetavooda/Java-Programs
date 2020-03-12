
/*Write a java Program to find Area of Circle,
and Circumference, Factorial of a number using callable and
Future

Sample Testcase:
Enter radius                                                                                                            
12.5       // (double)                                                                                                            
Enter a number                                                                                                          
7          //(int)                                                                                                             
Area of Circle  = 490.8738521234052                                                                                     
Factorial  = 5040                                                                                                       
Circumference  = 78.53981633974483                                                                                      
                                                                                                                        
*/

import java.util.Random;
import java.util.*;
import java.lang.Math;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class Area implements Callable <Double> 
{
    Double r;
    Area(Double t)
    {   
        r=t;
        
    }
    public Double call() throws Exception
    {
        Double a=r*r*Math.PI;
        return (a);

    }
    
}

class Circumference implements Callable <Double> 
{
    Double r;
    Circumference(Double t)
    {
        r=t;
    }
    public Double call() throws Exception
    {
        Double c=2*Math.PI*r;
        return (c);

    }
    
}
class Factorial implements Callable <Integer> 
{
    Integer n;
    Factorial(int n)
    {
        this.n=n;
    }
    public Integer call() throws Exception
    {
        int ans=1;
        for (int i=1;i<=n;i++)
        {
            ans*=i;
        }
        return (ans);

    }
    
}


class CallableThreads
    
{
    double r;
    int n;
    
    public static void main(String args[]) throws  Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double r=sc.nextDouble();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        
        Callable <Double>fc1 = new Area(r);
        Callable <Double>fc2 = new Circumference(r);
        Callable <Integer>fc3 = new Factorial(n);
        
        
        FutureTask ft1 = new FutureTask(fc1);
        FutureTask ft2 = new FutureTask(fc2);
        FutureTask ft3 = new FutureTask(fc3);
        
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);
        Thread t3= new Thread(ft3);
        
        t1.start();
        t3.start();
        t2.start();
        
        
        while(ft1.isDone()==false)
        {
            
            
        }
        System.out.println("Area of Circle  = "+ft1.get());
        
        if(ft3.isDone()==false)
        {
            
        }
        System.out.println("Factorial  = "+ft3.get());    
            
        if(ft2.isDone()==false)
        {
            
        }
        System.out.println("Circumference  = "+ft2.get());

                
           
        
        
    }
}