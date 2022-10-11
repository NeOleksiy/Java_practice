package lab2;

public class Lab1 extends Point3d {
    //Метод для ввода и вывода
    public static void main(String[] args) {
        double d1 = Double.parseDouble(args[0]);
        double d2 = Double.parseDouble(args[1]);
        double d3 = Double.parseDouble(args[2]);
        double d4 = Double.parseDouble(args[3]);
        double d5 = Double.parseDouble(args[4]);
        double d6 = Double.parseDouble(args[5]);
        double d7 = Double.parseDouble(args[6]);
        double d8 = Double.parseDouble(args[7]);
        double d9 = Double.parseDouble(args[8]);
        Point3d Point1 = new Point3d(d1,d2,d3);
        Point3d Point2 = new Point3d(d4,d5,d6);
        Point3d Point2 = new Point3d(d7,d8,d9);
        if (Point3d.compare(Point1,Point2) || Point3d.compare(Point1,Point3) || Point3d.compare(Point3,Point2))
           System.out.println("there are 2 equal points");
        else
            System.out.println(computeArea(Point1.distanceTo(Point1,Point2), Point2.distanceTo(Point2,Point3), Point1.distanceTo(Point1, Point3));
            
    }
    //Расчёт площади по формуле Герона
    public static double computeArea(double num1, double num2, double num3) {
        double p = (num1 + num2 + num3) * 0.5d;
        return Math. sqrt(p*(p-num1)*(p-num2)*(p-num3));
    }
}
