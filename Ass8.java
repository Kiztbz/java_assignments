
//Prime palindrome is a number which is prime as well as a palindrome number
import java.util.Scanner;

class Ass8 {
    // Instance Variables
    int m;
    int n;

    Ass8()// Initialising Instance Variable
    {
        m = 0;
        n = 0;
    }

    boolean isPrime(int num)// check whether a given number is prime or not
    {
        int c = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)// 7%2==0(false)
                c++;
        }
        return c == 2;// number is prime
    }

    boolean isPalindrome(int num) {
        int rem, rev = 0, temp;
        temp = num;
        while (num != 0) {
            rem = num % 10;// last digit of number
            rev = rev * 10 + rem;// reversed number
            num = num / 10;// number is divided by 10
        }
        return temp == rev;// return if reversed number is equal to original number
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M : ");// first limit
        m = sc.nextInt();
        System.out.print("Enter N : ");// second limit
        n = sc.nextInt();
        // to accept the value of M and N
        if (m < 100 || n > 3000) {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        if (m >= n) {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
    }

    void display() {
        int c = 0;// count
        System.out.println("Prime-Palindrome numbers are: ");
        for (int i = m; i <= n; i++) {
            boolean palindrome = isPalindrome(i);
            if (palindrome) {// if number is palindrome.
                boolean prime = isPrime(i);
                if (prime) // if number is prime
                {
                    System.out.print(i + " ");// print number
                    c++;// increase count value
                }
            }
        }
        System.out.println();// cursor moves to next line
        System.out.println("FREQUENCY OF PRIME-PALINDROME NUMBERS ARE:" + c);
    }

    public static void main()// main method
    {
        Ass8 ob = new Ass8();
        ob.input();
        ob.display();
    }
}