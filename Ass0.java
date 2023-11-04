/*
 * program to check if a given answer is right
 */
import java.util.Scanner;
public class Ass0
{
    //instance variables
    char search[];
    String statement;
    int n;

    //Constructor
    Ass0()
    {
        statement = "";
        n = 0;
        search = null;
    }

    //method to take input
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of keywords to search : ");
        n = sc.nextInt();
        search = new char[n];
        System.out.println("\nEnter "+n+" keywords to search : ");
        for(int i = 0; i < n; i++)
        {
            search[i] = sc.next().charAt(0);
        }
        System.out.println("Enter a statement to search for keywords : ");
        statement = sc.nextLine();
        sc.close();
    }

    //method to search keywords 
    void keysearch()
    {
        String st = " "+statement+" ";
        String word = ""; 
        int l = st.length();
        for(int i = 0; i<l; i++)
        {
            if(st.charAt(i)==' ')
            {
                for(int j = i+1; st.charAt(j)!=' '; j++)
                {
                    word = word + st.charAt(j);
                }
                for(int j = 0; j<n; j++)
                {
                    if(keysearchcore(word)==false)
                    System.out.println("Keyword not found!");
                }
            }
        }
    }

    boolean keysearchcore(String s)
    {
        for(int i = 0; i<n; i++)
        {
            if(s == search[i])
            return true;
        }
        return false;
    }
}