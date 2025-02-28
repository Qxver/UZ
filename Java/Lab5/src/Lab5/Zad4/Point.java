package Lab5.Zad4;

public class Point {
    public int x = 0;
    public int y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    public Rectangle() {
        this.origin = new Point(0, 0);
    }

    public Rectangle(Point p) {
        this.origin = p;
    }

    public Rectangle(int w, int h) {
        this.origin = new Point(0, 0);
        this.width = w;
        this.height = h;
    }

    public Rectangle(Point p, int w, int h) {
        this.origin = p;
        this.width = w;
        this.height = h;
    }
    
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    public int area() {
        return width * height;
    }
}

class Zadanie_1 {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("Obszar kwadratu: " + myRect.area());
    }
}
