package blogic;

public class FlatFigure {
    double a,b,c,d;
    int al,bet;

    public FlatFigure(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (FFHelp.isTriangle(a,b,c))
            System.out.println("ok Triangle");
        else
            System.out.println("bad Triangle");
    }
    public FlatFigure(double a, double b, int alfa) {
        this.a = a;
        this.b = b;
        if (alfa == 90)
            this.c = Math.sqrt(a*a + b*b);
        else
            this.c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(alfa*Math.PI/180));
        this.al = alfa;
    }
    public FlatFigure(double a, int alfa) {
        this.a = a;
        this.b = a;
        this.c = a;
        this.d = a;
        this.al = alfa;
        this.bet = 180 - alfa;
    }
    public FlatFigure(double a, double b, int alfa, int betta) {
        this.a = a;
        this.b = b;
        this.c = a;
        this.d = b;
        if (FFHelp.isParallelogram(alfa, betta))
            System.out.println("ok Parallelogram");
        else
            System.out.println("bad Parallelogram");

        this.al = alfa;
        this.bet = betta;
    }

    // приватный метод для вычисления площади треугольника
    private double triangleArea() {
        if (al == 90) {
            return 0.5 * a * b;
        } else {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    // приватный метод для вычисления площади параллелограмма
    private double parallelArea() {
        if (al == 90 && bet == 90 && a == c && b == d) {
            return a * b; // прямоугольник
        } else {
            return a * b * Math.sin(al * Math.PI / 180);
        }
    }

    public double area() {
        if (d == 0) {
            return triangleArea();
        } else {
            return parallelArea();
        }
    }
}
