//program to check if number is a circular prime
import java.util.Scanner;
public class Ass4
{
    //instance variables
    int n;

    //contructor
    Ass4()
    {
        n = 0;
    }

    //method to take input from the user
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        n = sc.nextInt();
        //to shift cursor to the new line
        System.out.print("\n");
        sc.close();
    }

    //method to check if number is prime
    boolean isPrime(int num)
    {
        for(int i = 2; i<=(num/2);i++)
        {
            if(num%i==0)
            return false;
        }
        return true;
    }

    //method to raise x to the power y
    int pow(int x, int y)
    {
        int p = 1;
        for(int i = 1; i<=y; i++)
        {
            p = x*x;
        }
        return p;
    }

    //method to check if number is circular prime
    void cp()
    {
        int cn = 0;//changed number
        String ns = Integer.toString(n);
        int l = ns.length();
        cn = n;
        for(int i = 0; i<l; i++)
        {
            cn = (cn%10*pow(10, l-1))+(cn/10);
            System.out.println(cn);
            if(!isPrime(cn))
            break;
            if(n == cn)
            {
                System.out.println(n+" IS A CIRCULAR PRIME.");
                System.exit(0);
            }
        }
        System.out.println(n+" IS NOT A CIRCULAR PRIME.");
    }

    //main method
    public static void main(String[] args)
    {
        Ass4 obj = new Ass4();
        obj.input();
        obj.cp();
    }
}