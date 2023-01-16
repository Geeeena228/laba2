public class Laba1 {
    public static void main(String[] args) {
        Point3d point1 = new Point3d(2,3,4);
        Point3d point2 = new Point3d(12,11,13);
        Point3d point3 = new Point3d(15,24,87);

        double x, y, z, x1, y1, z1, x2, y2, z2;

        x = point1.getX();
        x1 = point2.getX();
        x2 = point3.getX();

        y = point1.getY();
        y1 = point2.getY();
        y2 = point3.getY();

        z = point1.getZ();
        z1 = point2.getZ();
        z2 = point3.getZ();

        if ((x==x1 && y==y1 && z==z1) || (x==x2 && y==y2 && z==z2) || (x1==x2 && y1==y2 && z1==z2)) {
            System.out.println("Одна из точек равна другой");
        }
        else {
            System.out.println(computeArea(point1, point2, point3));
        }
    }
    public static double computeArea(Point3d point1, Point3d point2, Point3d point3){
        double Dist1 = point1.distanceTo(point2);
        double Dist2 = point2.distanceTo(point3);
        double Dist3 = point3.distanceTo(point1);
        double PolyPerim = (Dist1 + Dist2 + Dist3) / 2;
        double Geron = Math.sqrt(PolyPerim * (PolyPerim - Dist1) * (PolyPerim - Dist2) * (PolyPerim - Dist3));

        double scale = Math.pow(10,2); // округление
        Geron = Math.ceil(Geron*scale)/scale;
        return Geron;
    }



}
