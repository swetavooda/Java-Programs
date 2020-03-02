/*
Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for
the multiples of five output “Buzz”. For numbers which are multiples of both 
three and five output “FizzBuzz” by Using  threads(Runnable).

Example:
input =
15
output =
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz


*/
/*
Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for
the multiples of five output “Buzz”. For numbers which are multiples of both 
three and five output “FizzBuzz” by Using  threads(Runnable).

Example:
input =
15
output =
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz


*/
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
    synchronized void sayFizz()throws InterruptedException
    {
        if(n%3==0 && n%5!=0)
        {
            System.out.println("Fizz");
            n++;
            notifyAll();
        }
    }
    synchronized void sayBuzz()throws InterruptedException
    {
        if(n%5==0 && n%3!=0)
        {
            System.out.println("Buzz");
            n++;
            notifyAll();// can be called only in syncchronized methods      
            
        }
        
    }
    synchronized void sayFizzBuzz()throws InterruptedException
    {
        if(n%3==0 && n%5==0)
        {
            System.out.println("FizzBuzz");
            n++;
            notifyAll();// can be called only in syncchronized methods      
        }
        
    }
}
class Fizz implements Runnable
{
    SharedData sd;
    
    Fizz(SharedData s)
    {
        sd=s;
    }
    public void run()
    {
    try{
        while(sd.n<=sd.ans)
        {
            sd.sayFizz();
        }
        }
        catch(Exception e)
        {
            //System.out.println(e.getMessage());
    
        }
    }
    
}
class Buzz implements Runnable
{
    SharedData sd;
    
    Buzz(SharedData s)
    {
        sd=s;
    }
    public void run()
    {
    try{
        while(sd.n<=sd.ans)
        {
            sd.sayBuzz();
        }
        }
        catch(Exception e)
        {
            //System.out.println(e.getMessage());
    
        }
    }
    
}
class FizzBuzz implements Runnable
{
    SharedData sd;
    
    FizzBuzz(SharedData s)
    {
        sd=s;
    }
    public void run()
    {
    try{
        while(sd.n<=sd.ans)
        {
            sd.sayFizzBuzz();
        }
        }
        catch(Exception e)
        {
            //System.out.println(e.getMessage());
    
        }
    }
    
}

class ThreadFizzBuzz
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        a=sc.nextInt();
        SharedData sd = new SharedData(a);
        Fizz f = new Fizz(sd);
        Buzz b = new Buzz(sd);
        FizzBuzz fb = new FizzBuzz(sd);
        
        Thread  t1 = new Thread(f);
        Thread  t2 = new Thread(b);
        Thread  t3 = new Thread(fb);
        
        t1.start();
        t2.start();
        t3.start();
        while(sd.n<a)
        {
            if(sd.n%3!=0 && sd.n%5!=0)
            {
                System.out.println(sd.n);
                sd.n++;
            
            }
        }
        
        
        
    }
}