package lab2;

public class Point3d {
    //Поля для координат
    private double xCoord;
    private double yCoord;
    private double zCoord;

    //Конструктор инициализации
    public Point3d (double x , double y, double z) {
        xCoord = x ;
        yCoord = y ;
        zCoord = z ;
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

    public double getZ(Point3d coord1) {
        return zCoord;
    }
    //Методы установки значения
    public void setX(double value) {
        xCoord = value;
    }

    public void setY(double value) {
        yCoord = value;
    }

    public void setZ(double value) {
        zCoord = value;
    }
    public boolean compare(double xc,double yc,double zc){//Метод сравнения двух точек
        if (xc == yc)
            return false;
        else if (xc == zc)
            return false;
        else if (yc == zc)
            return false;
        else
            return true;
    }
    //Метод для рассчёта расстояние между точками
    public double distanceTo(Point3d coord1, Point3d coord2){

        return (Math. sqrt((getX(coord2)-getX(coord1))*(getX(coord2)-getX(coord1))+(getY(coord2)-getY(coord1))*(getY(coord2)-getY(coord1))+(getZ(coord2)-getZ(coord1))*(getZ(coord2)-getZ(coord1))));
    }
}



