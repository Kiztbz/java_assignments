//program to check if number is Keprekar
import java.util.Scanner;
public class Ass6 {
    //instance variables
    int p, q;
    
    //constructor
    Ass6(){
        p = 0;
        q = 0;
    }

    //method to take input
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT RANGE\nP = ");
        p = sc.nextInt();
        System.out.print("Q = ");
        q = sc.nextInt();
        //taking the cursor to the newline
        System.out.print("\n");
        sc.close();
    }

    //method to raise x to the power y
    int pow(int x, int y)
    {
        int p = 1;
        for(int i = 1; i<=y; i++)
        {
            p = p*x;
        }
        return p;
    }

    //method to check if number is kaprekar
    boolean kap(int n)
    {
        int sq = n*n;
        String ns = Integer.toString(n);
        int l = ns.length();
        int rs = sq%pow(10, l);
        int ls = (sq-rs)/pow(10, l);
        int add = rs+ls;
        if(n == add)
        return true;
        return false;
    }

    //method to check numbers from the given range
    void kcall()
    {
        int f = 0;
        System.out.println("THE KAPREKAR NUMBERS ARE : ");
        for(int i = p; i<=q; i++)
        {
            if(kap(i)!=true)
            continue;
            if(i==1)
            System.out.print(i);
            else
            System.out.print(","+i);
            f++;
        }
        System.out.print("\n"); //taking the cursor to the newline
        System.out.println("FREQUENCY OF KAPREKAR NUMBERS IS: "+f);
    }

    //main method
    public static void main(String[] args){
        Ass6 obj = new Ass6();
        obj.input();
        obj.kcall();
    }
}
