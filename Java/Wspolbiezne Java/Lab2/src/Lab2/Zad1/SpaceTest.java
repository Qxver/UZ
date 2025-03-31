package Lab2.Zad1;

public class SpaceTest {
    public static void main(String[] args){
        Space2D point1 = new Space2D(1, 1);
        Space2D point2 = new Space2D(3, 1);
        Space2D point3 = new Space2D(3, 4);
        Space3D p4 = new Space3D(1, 2, 3);
        Space3D p5 = new Space3D(4, 5, 6);
        Space3D p6 = new Space3D(1, 6, 3);
        point1.Values();
        System.out.println("Odleglosc punktu 1 od punktu 2: " + point1.Distance(point2));
        System.out.println("Odleglosc punktu 1 od 0,0: " + point1.Distance0());
        System.out.println("Wartosci punktu 1: " + point1.toString());
        System.out.println("Obwod trojkata punktow 1,2 i 3: " + Space2D.Obwod(point1, point2, point3));
        System.out.println("Pole trojkata punktow 1,2 i 3: " + Space2D.Pole(point1, point2, point3));
        System.out.println();
        System.out.println("Odleglosc p4 od p5: " + p4.Distance(p5));
        System.out.println("Odleglosc p4 od 0,0,0: " + p4.Distance0());
        System.out.println("Obwod trojkata punktow 4, 5, 6: " + Space3D.Obwod(p4, p5, p6));
        System.out.println("Pole trojkata punktow 4, 5, 6: " + Space3D.Pole(p4, p5, p6));
    }
}
