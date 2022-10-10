package lab2;

public class Lab1 extends Point3d {
    //Метод для ввода и вывода
    public static void main(String[] args) {
        double d1 = Double.parseDouble(args[0]);
        double d2 = Double.parseDouble(args[1]);
        double d3 = Double.parseDouble(args[2]);
        Point3d myPoint = new Point3d(d1,d2,d3);
        if (myPoint.compare(d1,d2,d3))
            System.out.println(computeArea(d1,d2,d3));
        else
            System.out.println("there are 2 equal points");
    }
    //Расчёт площади по формуле Герона
    public static double computeArea(double num1, double num2, double num3) {
        double p = (num1 + num2 + num3) * 0.5d;
        return Math. sqrt(p*(p-num1)*(p-num2)*(p-num3));
    }
}
