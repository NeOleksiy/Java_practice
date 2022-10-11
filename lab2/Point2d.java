package lab2;

public class Point2d {
    //Поля для координат
    private double xCoord;
    private double yCoord;
    

    //Конструктор инициализации
    public Point3d (double x , double y) {
        xCoord = x ;
        yCoord = y ;
       
    }
    //Конструктор по умолчанию
    public Point3d () {}

    //Методы возвращение значения
    public double getX(Point3d coord2) {
        return xCoord;
    }

    public double getY(Point3d coord2) {
        return yCoord;
    }

   
    //Методы установки значения
    public void setX(double value) {
        xCoord = value;
    }

    public void setY(double value) {
        yCoord = value;
    }

   
