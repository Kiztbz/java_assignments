//program to check if a number is Goldbach number
import java.util.Scanner;
public class Ass2 {

    // instance variable
    int n, ot;
    //constructor
    Ass2() 
    {
        n = 0;
        ot = 0;
    }

    //taking input
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 9 and 50: ");
        n = sc.nextInt();
        if(!(n>9 && n<50))
        {
            System.out.println("Invalid input!");
            System.exit(0);
        }
        sc.close();
    }

    //to check if number is even
    void even() {
        for (int i = 1; ((i*2)+1) <= (n/2); i++) {
            int p = ((i * 2) + 1);
            if (prime(p)==false)
                continue;
            ot = n - p;
            if (prime(ot)==false)
                continue;
            System.out.println(p + "," + ot);
        }
    }
    
    //to check if number is prime
    boolean prime(int pp)
    {
        for (int j = 2; j <= pp / 2; j++) {
            if (pp % j == 0)
            {
                return false;
            }
        }
        return true;
    }

    //main method
    public static void main(String[] args) {
        Ass2 obj = new Ass2();
        obj.even();
    }
}