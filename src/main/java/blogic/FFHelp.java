package blogic;

public class FFHelp {

    // Проверка, является ли фигура треугольником по сторонам
    public static boolean isTriangle(double a, double b, double c) {
        return (c < a + b) && (b < c + a) && (a < c + b);
    }

    // Проверка, является ли фигура параллелограммом по углам
    public static boolean isParallelogram(int alfa, int betta) {
        return alfa + betta == 180;
    }
}
