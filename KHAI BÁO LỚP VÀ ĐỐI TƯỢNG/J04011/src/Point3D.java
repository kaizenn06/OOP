package J04011;

public class Point3D {
    private int x, y, z;
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D) {
        int abx = B.x - A.x, aby = B.y - A.y, abz = B.z - A.z;
        int acx = C.x - A.x, acy = C.y - A.y, acz = C.z - A.z;
        int adx = D.x - A.x, ady = D.y - A.y, adz = D.z - A.z;
        int det = abx * (acy * adz - acz * ady)
                - aby * (acx * adz - acz * adx)
                + abz * (acx * ady - acy * adx);
        return det == 0;
    }
}
