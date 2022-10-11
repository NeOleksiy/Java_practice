package lab2;

public class Point3d extends Point2d{
    //Поля для координат
    
    private double zCoord;

    //Конструктор инициализации
    public Point3d (double x , double y, double z) {
        super(x,y);
        zCoord = z ;
    }
   

    //Методы возвращение значения
   

    public double getZ(Point3d coord1) {
        return zCoord;
    }
    //Методы установки значения
    
  

    public void setZ(double value) {
        zCoord = value;
    }
    public static boolean compare(Point3d coord1, Point3d coord2){//Метод сравнения двух точек
        if (coord1 == coord2)
            return false;
        else
            return true;
    }
    //Метод для рассчёта расстояние между точками
    public double distanceTo(Point3d coord1, Point3d coord2){

        return (Math. sqrt((getX(coord2)-getX(coord1))*(getX(coord2)-getX(coord1))+(getY(coord2)-getY(coord1))*(getY(coord2)-getY(coord1))+(getZ(coord2)-getZ(coord1))*(getZ(coord2)-getZ(coord1))));
    }
}



