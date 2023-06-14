//program to break up break-up amount in descending order of denomination
import java.util.Scanner;
public class Ass5 {
    //instance variables
    int n;

    //contructor
    Ass5(){
        n = 0;
    }

    //method to take input from the user
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        n = sc.nextInt();
        //to shift cursor to the new line
        System.out.print("\n");
        sc.close();
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

    //method to spell out the amount
    void spell(){
        //function variables
        char tn;//temporary number
        String ns = Integer.toString(n);
        int l = ns.length();
        for(int i = 0; i<l;i++)
        {
            tn = ns.charAt(i);
            if(tn=='0')
            {
                System.out.print(" ZERO");
            }
            if(tn=='1')
            {
                System.out.print(" ONE");
            }
            if(tn=='2')
            {
                System.out.print(" TWO");
            }
            if(tn=='3')
            {
                System.out.print(" THREE");
            }
            if(tn=='4')
            {
                System.out.print(" FOUR");
            }
            if(tn=='5')
            {
                System.out.print(" FIVE");
            }
            if(tn=='6')
            {
                System.out.print(" SIX");
            }
            if(tn=='7')
            {
                System.out.print(" SEVEN");
            }
            if(tn=='8')
            {
                System.out.print(" EIGHT");
            }
            if(tn=='9')
            {
                System.out.print(" NINE");
            }
        }
        System.out.print("\n");
    }

    //method to denominate the amount
    void deno(){
        int n1000 = 0;
        int n500 = 0;
        int n100 = 0;
        int n50 = 0;
        int n20 = 0;
        int n10 = 0;
        int n5 = 0;
        int n2 = 0;
        int n1 = 0;
        n1000 =  n/1000;
        n500 = (n-(n1000*1000))/500;
        n100 = (n-(n1000*1000)-(n500*500))/100;
        n50 = (n-(n1000*1000)-(n500*500)-(n100*100))/50;
        n20 = (n-(n1000*1000)-(n500*500)-(n100*100)-(n50*50))/20;
        n10 = (n-(n1000*1000)-(n500*500)-(n100*100)-(n50*50)-(n20*20))/10;
        n5 = (n-(n1000*1000)-(n500*500)-(n100*100)-(n50*50)-(n20*20)-(n10*10))/5;
        n2 = (n-(n1000*1000)-(n500*500)-(n100*100)-(n50*50)-(n20*20)-(n10*10)-(n5*5))/2;
        n1 = (n-(n1000*1000)-(n500*500)-(n100*100)-(n50*50)-(n20*20)-(n10*10)-(n5*5)-(n2*2))/1;
        System.out.println("DENOMINATION :");
        if(n1000!=0)
        System.out.println("1000 x "+n1000+" = "+(n1000*1000));
        if(n500!=0)
        System.out.println("1000 x "+n500+" = "+(n500*500));
        if(n100!=0)
        System.out.println("100  x "+n100+" = "+(n100*100));
        if(n50!=0)
        System.out.println("50   x "+n50+" = "+(n50*50));
        if(n20!=0)
        System.out.println("20   x "+n20+" = "+(n20*20));
        if(n10!=0)
        System.out.println("10   x "+n10+" = "+(n10*10));
        if(n5!=0)
        System.out.println("5    x "+n5+" = "+(n5*5));
        if(n2!=0)
        System.out.println("2    x "+n2+" = "+(n2*2));
        if(n1!=0)
        System.out.println("1    x "+n1+" = "+(n1*1));
        System.out.println("TOTAL = "+n);
        System.out.println("TOTAL NUMBER OF NOTES = "+(n1000+n500+n100+n50+n20+n10+n5+n2+n1));
    }

    //main method
    public static void main(String[] args){
        Ass5 obj = new Ass5();
        obj.input();
        obj.spell();
        obj.deno();
    }
}
