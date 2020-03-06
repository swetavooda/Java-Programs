/*Write a Java Program to print even and odd numbers using threads for 1 to 20 numbers using threads
Sample Testcase:
odd 1                                                                                                                   
even 2                                                                                                                  
odd 3                                                                                                                   
even 4                                                                                                                  
odd 5                                                                                                                   
even 6                                                                                                                  
odd 7                                                                                                                   
even 8                                                                                                                  
odd 9                                                                                                                   
even 10                                                                                                                 
odd 11                                                                                                                  
even 12                                                                                                                 
odd 13                                                                                                                  
even 14                                                                                                                 
odd 15                                                                                                                  
even 16                                                                                                                 
odd 17                                                                                                                  
even 18                                                                                                                 
odd 19                                                                                                                  
even 20   */

import java.util.*;
class SharedData
{
    public int n;
    public int ans;
    int flag=0;
    SharedData(int a)
    {
        ans=a;
        n=1;
    }
    synchronized void Even()throws InterruptedException
    {
        while(n%2!=0)
        {
            wait();
        }
        System.out.println("even "+n);
            n++;
            notifyAll();

    }
    synchronized void Odd()throws InterruptedException
    {
        while(n%2==0)
        {
            wait();
        }
        System.out.println("odd "+n);
            n++;
            notifyAll();

    }
}
class Even implements Runnable
{
    SharedData sd;
    
    Even(SharedData s)
    {
        sd=s;
    }
    public void run()
    {
    try{
        while(sd.n<sd.ans)
        {
            sd.Even();
        }
        }
        catch(Exception e)
        {
            //System.out.println(e.getMessage());
    
        }
    }
    
}
class Odd implements Runnable
{
    SharedData sd;
    
    Odd(SharedData s)
    {
        sd=s;
    }
    public void run()
    {
    try{
        while(sd.n<sd.ans)
        {
            sd.Odd();
        }
        }
        catch(Exception e)
        {
            //System.out.println(e.getMessage());
    
        }
    }
    
}

class EvenOddThreads
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        a=sc.nextInt();
        SharedData sd = new SharedData(a);
        Even e = new Even(sd);
        Odd o = new Odd(sd);
        
        Thread  t1 = new Thread(e);
        Thread  t2 = new Thread(o);
        
        t1.start();
        t2.start();
        
    }
}