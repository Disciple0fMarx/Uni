public class TP1 {
    // public int A;
    // public int B;
    // public int C;

    private int A;
    private int B;
    private int C;


    public TP1() {
        this.A = 0;
        this.B = 0;
        this.C = 0;
    }

    public TP1(int a, int b, int c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }


    public int get_A() {
        return this.A;
    }

    public void set_A(int a) {
        this.A = a;
    }


    public int get_B() {
        return this.B;
    }

    public void set_B(int b) {
        this.B = b;
    }


    public int get_C() {
        return this.C;
    }

    public void set_C(int c) {
        this.C = c;
    }


    public static int Maximum(int a, int b, int c) {
        if (a >= b) {
            return (c >= a) ? c : a;
        }
        if (a >= c) {
            return (b >= a) ? b : a;
        }
        return (b >= c) ? b : c;
    }

    public static int Minimum(int a, int b, int c) {
        if (a <= b) {
            return (c <= a) ? c : a;
        }
        if (a <= c) {
            return (b <= a) ? b : a;
        }
        return (b <= c) ? b : c;
    }
}
