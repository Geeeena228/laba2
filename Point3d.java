public class Point3d extends Point2d{ //наследуемся от класса Point2d

    private double zCoord;

    public Point3d ( double x, double y, double z) { //конструктор инициализации
        super(x, y);
        zCoord = z;
    }

    public Point3d () { //констурктор по умолчанию
        this(0, 0, 0);
    }

    public double getZ () {
        return zCoord;
    }

    @Override
    public boolean equals(Object o) { // позволяет сравнить объекты (ссылки) переопрделение
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point3d point3d = (Point3d) o;

        return Double.compare(point3d.zCoord, zCoord) == 0 && Double.compare(point3d.getX(), this.getX()) == 0 && Double.compare(point3d.getY(), this.getY()) == 0;
    }

    public void setZ (double val) {
        zCoord = val;
    }

    // метод для вычисления растояния между 2 точками
    public double distanceTo (Point3d t) {
        double d = Math.sqrt(Math.pow(this.getX()-t.getX(), 2) + Math.pow(this.getY() - t.getY(), 2) + Math.pow(this.getZ() - t.getZ(), 2));
        double scale = Math.pow(10,2);
        d = Math.ceil(d*scale)/scale;
        return d;
    }

}