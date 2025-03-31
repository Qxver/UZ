package Lab2.Zad1;
import java.lang.Math;

public class Space2D {
    double x;
    double y;

    public Space2D(){
        this.x = 0;
        this.y = 0;
    }

    public Space2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void Values(){
        System.out.println("Wartosci punktu: (" + x + ", " + y + ")");
    }

    public double Distance(Space2D a){
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2));
    }

    public double Distance0(){
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static double Obwod(Space2D a, Space2D b, Space2D c){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2)) +
               Math.sqrt(Math.pow(a.x - c.x, 2) + Math.pow(a.y - c.y, 2)) +
               Math.sqrt(Math.pow(b.x - c.x, 2) + Math.pow(b.y - c.y, 2));
    }

    public static double Pole(Space2D p1, Space2D p2, Space2D p3){
        double a = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        double b = Math.sqrt(Math.pow(p1.x - p3.x, 2) + Math.pow(p1.y - p3.y, 2));
        double c = Math.sqrt(Math.pow(p2.x - p3.x, 2) + Math.pow(p2.y - p3.y, 2));
        double p = 0.5 * (a + b + c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
