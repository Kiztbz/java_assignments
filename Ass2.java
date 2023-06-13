public class Ass2 {
    // instance variable
    int n = 14;
    int ot = 0;

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

    public static void main(String[] args) {
        Ass2 obj = new Ass2();
        obj.even();
    }
}