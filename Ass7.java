
/*Program to :
* 1. Accept an array
* 2. Sort the array
* 3. Calculate sum of diagonals
*/
import java.util.Scanner;

public class Ass7 {
    // instance variables
    int arr[][], a[], n, sum1, sum2;

    // Constructor
    Ass7() {
        n = 0;
        arr = null;
        a = null;
        sum1 = 0;
        sum2 = 0;
    }

    // method to take input from user
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        a = new int[n*n];
        arr = new int [n][n];
        System.out.println("\nEnter " + (n * n) + " elements of array : ");
        for (int i = 0; i < (n*n); i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
    }

    // method to sort the array
    void sort() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 0;
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    // method to convert SDA into TDA
    void convert() {
        int x = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = a[x];
                x = x + 1;
            }
        }
    }

    //method to calculate sum of diagonals
    void calculate()
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)
                {
                    sum1 = sum1 + arr[i][j];
                }
                if(i+j == n-1)
                {
                    sum2 = sum2 + arr[i][j];
                }
            }
        }
    }

    //method to display the arrays
    void display() {
        for (int i = 0; i < n * n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }
        System.out.println("\nSum of diagonal1 : "+sum1);
        System.out.println("Sum of diagonal2 : "+sum2);
    }

    //main method
    public static void main(String[] args)
    {
        Ass7 obj = new Ass7();
        obj.input();
        obj.sort();
        obj.convert();
        obj.calculate();
        obj.display();
    }
}