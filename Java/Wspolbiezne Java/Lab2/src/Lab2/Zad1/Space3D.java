package Lab2.Zad1;

class Space3D extends Space2D {
    double z;

    public Space3D() {
        super();
        this.z = 0;
    }

    public Space3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() { return z; }
    public void setZ(double z) { this.z = z; }

    public double Distance(Space3D other) {
        return Math.sqrt(Math.pow(getX() - other.getX(), 2) +
                Math.pow(getY() - other.getY(), 2) +
                Math.pow(this.z - other.z, 2));
    }

    public double distance0() {
        return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    public static double Obwod(Space3D a, Space3D b, Space3D c) {
        return a.Distance(b) + b.Distance(c) + c.Distance(a);
    }

    public static double Pole(Space3D a, Space3D b, Space3D c) {
        double ab = a.Distance(b);
        double bc = b.Distance(c);
        double ca = c.Distance(a);
        double p = (ab + bc + ca) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }
}
