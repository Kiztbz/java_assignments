import java.util.Scanner;

public class Ass3 
{
    //instance variables
    int num, y, N;
    
    Ass3()
    {
        num = 0;
        y = 0;
        N = 0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("DAY NUMBER  : ");
        num = sc.nextInt();
        if(num<1 || num>366)
        {
            System.err.print("\nDAY NUMBER OUT OF RANGE");
            System.exit(0);
        }
        System.out.print("\nYEAR : ");
        y = sc.nextInt();
        if(!(y>=1000 && y<=9999))
        {
            System.err.print("\nINVALID YEAR");
            System.exit(0);
        }
        System.out.print("\nDATE AFTER (N DAYS): ");
        N = sc.nextInt();
        if(!(N>=1 && N<=100))
        {
            System.err.print("\nDATE AFTER (N DAYS) OUT OF RANGE");
            System.exit(0);
        }
        sc.close();
    }

    boolean leap(int year)
    {
        if(year%4==0)
        return true;
        else 
        return false;
    }

    void day(int n)
    {
        if(leap(y)==true)
        {
            if(n>0 && n<=31)
            {
                if(n==1)
                System.out.print("1ST JANUARY, "+y);
                else if(n==2)
                System.out.print("2ND JANUARY, "+y);
                else if(n==3)
                System.out.print("3RD JANUARY, "+y);
                else
                System.out.print(n+"TH JANUARY, "+y);
            }
            else if(n>31 && n<=60)
            {
                if(n==(31+1))
                System.out.print("1ST FEBRUARY, "+y);
                else if(n==(31+2))
                System.out.print("2ND FEBRUARY, "+y);
                else if(n==(31+3))
                System.out.print("3RD FEBRUARY, "+y);
                else
                System.out.print((n-31)+"TH FEBRUARY, "+y);
            }
            else if(n>60 && n<=91)
            {
                if(n==(60+1))
                System.out.print("1ST MARCH, "+y);
                else if(n==(60+2))
                System.out.print("2ND MARCH, "+y);
                else if(n==(60+3))
                System.out.print("3RD MARCH, "+y);
                else
                System.out.print((n-60)+"TH MARCH, "+y);
            }
            else if(n>91 && n<=121)
            {
                if(n==(91+1))
                System.out.print("1ST APRIL, "+y);
                else if(n==(91+2))
                System.out.print("2ND APRIL, "+y);
                else if(n==(91+3))
                System.out.print("3RD APRIL, "+y);
                else
                System.out.print((n-91)+"TH APRIL, "+y);
            }
            else if(n>121 && n<=152)
            {
                if(n==(121+1))
                System.out.print("1ST MAY, "+y);
                else if(n==(121+2))
                System.out.print("2ND MAY, "+y);
                else if(n==(121+3))
                System.out.print("3RD MAY, "+y);
                else
                System.out.print((n-121)+"TH MAY, "+y);
            }
            else if(n>152 && n<=182)
            {
                if(n==(152+1))
                System.out.print("1ST JUNE, "+y);
                else if(n==(152+2))
                System.out.print("2ND JUNE, "+y);
                else if(n==(152+3))
                System.out.print("3RD JUNE, "+y);
                else
                System.out.print((n-152)+"TH JUNE, "+y);
            }
            else if(n>182 && n<=213)
            {
                if(n==(182+1))
                System.out.print("1ST JULY, "+y);
                else if(n==(182+2))
                System.out.print("2ND JULY, "+y);
                else if(n==(182+3))
                System.out.print("3RD JULY, "+y);
                else
                System.out.print((n-182)+"TH JULY, "+y);
            }
            else if(n>213 && n<=244)
            {
                if(n==(213+1))
                System.out.print("1ST AUGUST, "+y);
                else if(n==(213+2))
                System.out.print("2ND AUGUST, "+y);
                else if(n==(213+3))
                System.out.print("3RD AUGUST, "+y);
                else
                System.out.print((n-213)+"TH AUGUST, "+y);
            }
            else if(n>244 && n<=274)
            {
                if(n==(244+1))
                System.out.print("1ST SEPTEMBER, "+y);
                else if(n==(244+2))
                System.out.print("2ND SEPTEMBER, "+y);
                else if(n==(244+3))
                System.out.print("3RD SEPTEMBER, "+y);
                else
                System.out.print((n-244)+"TH SEPTEMBER, "+y);
            }
            else if(n>274 && n<=305)
            {
                if(n==(274+1))
                System.out.print("1ST OCTOBER, "+y);
                else if(n==(274+2))
                System.out.print("2ND OCTOBER, "+y);
                else if(n==(274+3))
                System.out.print("3RD OCTOBER, "+y);
                else
                System.out.print((n-274)+"TH OCTOBER, "+y);
            }
            else if(n>305 && n<=335)
            {
                if(n==(305+1))
                System.out.print("1ST NOVEMBER, "+y);
                else if(n==(305+2))
                System.out.print("2ND NOVEMBER, "+y);
                else if(n==(305+3))
                System.out.print("3RD NOVEMBER, "+y);
                else
                System.out.print((n-305)+"TH NOVEMBER, "+y);
            }
            else if(n>335 && n<=366)
            {
                if(n==(335+1))
                System.out.print("1ST DECEMBER, "+y);
                else if(n==(335+2))
                System.out.print("2ND DECEMBER, "+y);
                else if(n==(335+3))
                System.out.print("3RD DECEMBER, "+y);
                else
                System.out.print((n-335)+"TH DECEMBER, "+y);
            }
        }
        else
        {
            if(n>0 && n<=31)
            {
                if(n==1)
                System.out.print("1ST JANUARY, "+y);
                else if(n==2)
                System.out.print("2ND JANUARY, "+y);
                else if(n==3)
                System.out.print("3RD JANUARY, "+y);
                else
                System.out.print(n+"TH JANUARY, "+y);
            }
            else if(n>31 && n<=59)
            {
                if(n==(31+1))
                System.out.print("1ST FEBRUARY, "+y);
                else if(n==(31+2))
                System.out.print("2ND FEBRUARY, "+y);
                else if(n==(31+3))
                System.out.print("3RD FEBRUARY, "+y);
                else
                System.out.print((n-31)+"TH FEBRUARY, "+y);
            }
            else if(n>59 && n<=90)
            {
                if(n==(59+1))
                System.out.print("1ST MARCH, "+y);
                else if(n==(59+2))
                System.out.print("2ND MARCH, "+y);
                else if(n==(59+3))
                System.out.print("3RD MARCH, "+y);
                else
                System.out.print((n-59)+"TH MARCH, "+y);
            }
            else if(n>90 && n<=120)
            {
                if(n==(90+1))
                System.out.print("1ST APRIL, "+y);
                else if(n==(90+2))
                System.out.print("2ND APRIL, "+y);
                else if(n==(90+3))
                System.out.print("3RD APRIL, "+y);
                else
                System.out.print((n-90)+"TH APRIL, "+y);
            }
            else if(n>120 && n<=151)
            {
                if(n==(120+1))
                System.out.print("1ST MAY, "+y);
                else if(n==(120+2))
                System.out.print("2ND MAY, "+y);
                else if(n==(120+3))
                System.out.print("3RD MAY, "+y);
                else
                System.out.print((n-120)+"TH MAY, "+y);
            }
            else if(n>151 && n<=181)
            {
                if(n==(151+1))
                System.out.print("1ST JUNE, "+y);
                else if(n==(151+2))
                System.out.print("2ND JUNE, "+y);
                else if(n==(151+3))
                System.out.print("3RD JUNE, "+y);
                else
                System.out.print((n-151)+"TH JUNE, "+y);
            }
            else if(n>181 && n<=212)
            {
                if(n==(181+1))
                System.out.print("1ST JULY, "+y);
                else if(n==(181+2))
                System.out.print("2ND JULY, "+y);
                else if(n==(181+3))
                System.out.print("3RD JULY, "+y);
                else
                System.out.print((n-181)+"TH JULY, "+y);
            }
            else if(n>212 && n<=243)
            {
                if(n==(212+1))
                System.out.print("1ST AUGUST, "+y);
                else if(n==(212+2))
                System.out.print("2ND AUGUST, "+y);
                else if(n==(212+3))
                System.out.print("3RD AUGUST, "+y);
                else
                System.out.print((n-212)+"TH AUGUST, "+y);
            }
            else if(n>243 && n<=273)
            {
                if(n==(243+1))
                System.out.print("1ST SEPTEMBER, "+y);
                else if(n==(243+2))
                System.out.print("2ND SEPTEMBER, "+y);
                else if(n==(243+3))
                System.out.print("3RD SEPTEMBER, "+y);
                else
                System.out.print((n-243)+"TH SEPTEMBER, "+y);
            }
            else if(n>273 && n<=304)
            {
                if(n==(273+1))
                System.out.print("1ST OCTOBER, "+y);
                else if(n==(273+2))
                System.out.print("2ND OCTOBER, "+y);
                else if(n==(273+3))
                System.out.print("3RD OCTOBER, "+y);
                else
                System.out.print((n-273)+"TH OCTOBER, "+y);
            }
            else if(n>304 && n<=334)
            {
                if(n==(304+1))
                System.out.print("1ST NOVEMBER, "+y);
                else if(n==(304+2))
                System.out.print("2ND NOVEMBER, "+y);
                else if(n==(304+3))
                System.out.print("3RD NOVEMBER, "+y);
                else
                System.out.print((n-304)+"TH NOVEMBER, "+y);
            }
            else if(n>334 && n<=365)
            {
                if(n==(334+1))
                System.out.print("1ST DECEMBER, "+y);
                else if(n==(334+2))
                System.out.print("2ND DECEMBER, "+y);
                else if(n==(334+3))
                System.out.print("3RD DECEMBER, "+y);
                else
                System.out.print((n-334)+"TH DECEMBER, "+y);
            }
        }
    }

    void display()
    {
        System.out.print("\nDATE : ");
        day(num);
        System.out.print("\nDATE AFTER "+N+" DAYS: ");
        day(num+N);
        //to bring the cursor to the next line after execution
        System.out.println("\n");
    }

    public static void main(String[] args)
    {
        Ass3 obj = new Ass3();
        obj.input();
        obj.display();
    }
}
