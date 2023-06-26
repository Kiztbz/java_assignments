//program to break up boxes into cartons
import java.util.Scanner;
public class Ass1
{
    int n, r, b48, b24, b12, b6;

    //constructor
    Ass1()
    {
        n = 0;
        r = 0;
        b48 = 0;
        b24 = 0;
        b12 = 0;
        b6 = 0;
    }

    //method to take input
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of boxes : ");
        n = sc.nextInt();
        if(n<0 && n>1000)
        {
            System.out.println("Invalid input!");
            System.exit(0);
        }
        sc.close();
    }

    //assigning boxes
    void div()
    {
        b48 = n/48;
        b24 = (n-(b48*48))/24;
        b12 = (n-(b48*48)-(b24*24))/12;
        b6 = (n-(b48*48)-(b24*24)-(b12*12))/6;
        r = n-(b48*48)-(b24*24)-(b12*12)-(b6*6);
    }

    //method to display output
    void display()
    {
        if(r==0)
        System.out.println("48 * "+b48+" = "+48*b48+"\n24 * "+b24+" = "+24*b24+"\n12 * "+b12+" = "+12*b12+"\n6 * "+b6+" = "+6*b6+"\nTotal number of boxes = "+n+"\nTotal number of cartons = "+(b48+b24+b12+b6));
        else
        System.out.println("48 * "+b48+" = "+48*b48+"\n24 * "+b24+" = "+24*b24+"\n12 * "+b12+" = "+12*b12+"\n6 * "+b6+" = "+6*b6+"\nRemaining boxes = "+r+"\nTotal number of boxes = "+n+"\nTotal number of cartons = "+(b48+b24+b12+b6+1));
    }

    //main method
    public static void main(String[] args)
    {
        Ass1 obj = new Ass1();
        obj.input();
        obj.div();
        obj.display();
    }
}